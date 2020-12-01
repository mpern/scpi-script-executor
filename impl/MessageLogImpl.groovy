package impl

import com.sap.it.api.msglog.MessageLog

class MessageLogImpl implements MessageLog {
    def attachments = []
    def headers = [:]
    def properties = [:]

    void addAttachmentAsString(String name, String body, String type) {
        attachments.add([
            "name": name,
            "body": body,
            "type": type
        ])
    }

    void addCustomHeaderProperty(String name, String value) {
        headers[name] = value
    }

    void setBooleanProperty(String name, Boolean value) {
        properties[name] = value
    }

    void setDateProperty(String name, Date value) {
        properties[name] = value
    }

    void setDoubleProperty(String name, Double value) {
        properties[name] = value
    }

    void setFloatProperty(String name, Float value) {
        properties[name] = value
    }

    void setIntegerProperty(String name, Integer value) {
        properties[name] = value
    }

    void setLongProperty(String name, Long value) {
        properties[name] = value
    }

    void setStringProperty(String name, String value) {
        properties[name] = value
    }

    String toString() {
        def result = "MessageLogImpl\n"
        result += "  Properties\n"
        properties.each  {
            result += "  - ${it.key} -> ${it.value}"
        }
        result += "  Custom Headers\n"
        headers.each  {
            result += "  - ${it.key} -> ${it.value}"
        }
        result += "  Attachments\n"
        attachments.sort{ it.name }.each{
            result += "    >>>\"${it.name}\" (${it.type})\n"
            result += "    ${it.body}\n"
            result += "    <<<\"${it.name}\" (${it.type})\n"
        }
        return result
    }
}