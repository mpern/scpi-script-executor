import com.sap.gateway.ip.core.customdev.util.Message;

def Message processData(Message message) {
    def body = message.getBody(java.lang.String.class)
    message.body = body + " processed"

    def messageLog = messageLogFactory.getMessageLog(message)
    messageLog.addAttachmentAsString("Attachment #1", "header: ${message.headers.foo}", "plain/txt")
    messageLog.addAttachmentAsString("Attachment #2", message.properties.bar, "plain/txt")

    return message
}