@GrabConfig(systemClassLoader=true)
// additonal dependencies required by the Generic API
@Grab(group='org.apache.camel', module='camel-core', version='2.20.4')
@Grab(group='javax.activation', module='activation', version='1.1.1')

import groovy.json.*
import impl.*

// setup Groovy scripting engine
def binding = new Binding()
def logFactory = new MessageLogFactoryImpl()
binding.setVariable("messageLogFactory", logFactory)
def shell = new GroovyShell(binding)

def scriptFile = new File('script.groovy')
shell.evaluate(scriptFile)
def script = shell.parse(scriptFile)

// setup message
def message = new MessageImpl()
message.headers.foo = "bar"
message.properties.bar = "foo"
message.body = "Hello World"

// execute script and log output
println "==== BEFORE ===="
println message

result = script.invokeMethod("processData", message)

println ""
println "==== AFTER ===="
println result
println ""
println logFactory.messageLog

// Assert correct result
assert result.body == "Hello World processed"
