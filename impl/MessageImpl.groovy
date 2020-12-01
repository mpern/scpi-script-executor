package impl

import com.sap.gateway.ip.core.customdev.util.Message

class MessageImpl implements Message {
    Map properties = [:]
    Map headers = [:]
    def body = ""

    void setAttachmentHeader(java.lang.String a, java.lang.String b, org.apache.camel.Attachment c) {
        throw new RuntimeException()
    }

    long getBodySize() {
        -1
    }

    void setAttachmentHeader(java.lang.String a, java.lang.String b, com.sap.gateway.ip.core.customdev.util.AttachmentWrapper c) {
        throw new RuntimeException()
    }

    void addAttachmentHeader(java.lang.String a, java.lang.String b, com.sap.gateway.ip.core.customdev.util.AttachmentWrapper c) {
        throw new RuntimeException()
    }

    void setAttachmentWrapperObjects(java.util.Map a) {
        throw new RuntimeException()
    }

    java.lang.Object getHeader(java.lang.String a, java.lang.Class c) {
        throw new RuntimeException()
    }

    long getAttachmentsSize() {
        throw new RuntimeException()
    }

    java.lang.String getAttachmentHeader(java.lang.String a, org.apache.camel.Attachment b) {
        throw new RuntimeException()
    }

    void addAttachmentObject(java.lang.String a, org.apache.camel.Attachment b) {
        throw new RuntimeException()
    }

    void setHeader(java.lang.String a, java.lang.Object b) {
        throw new RuntimeException()
    }

    void removeAttachmentHeader(java.lang.String a, org.apache.camel.Attachment b) {
        throw new RuntimeException()
    }

    void removeAttachmentHeader(java.lang.String a, com.sap.gateway.ip.core.customdev.util.AttachmentWrapper b) {
        throw new RuntimeException()
    }

    void addAttachmentObject(java.lang.String a, com.sap.gateway.ip.core.customdev.util.AttachmentWrapper b) {
        throw new RuntimeException()
    }

    java.util.Map getAttachmentObjects() {
        throw new RuntimeException()
    }

    java.util.Map getAttachmentWrapperObjects() {
        throw new RuntimeException()
    }

    void addAttachmentHeader(java.lang.String a, java.lang.String b, org.apache.camel.Attachment c) {
        throw new RuntimeException()
    }

    java.lang.String getAttachmentHeader(java.lang.String a, com.sap.gateway.ip.core.customdev.util.AttachmentWrapper b) {
        throw new RuntimeException()
    }

    void setAttachmentObjects(java.util.Map a) {
        throw new RuntimeException()
    }

    java.util.Map getAttachments() {
        throw new RuntimeException()
    }

    java.lang.Object getBody(java.lang.Class clazz) {
        if (clazz == java.io.InputStream.class) {
            InputStream stream = new ByteArrayInputStream(this.body.getBytes("UTF-8"));
            return stream
        } else if (clazz == java.lang.String.class) {
            return body
        } else {
            throw new RuntimeException("Unsupported class " + clazz)
        }
    }

    void setAttachments(java.util.Map a) {
        throw new RuntimeException()
    }

    @Override
    String toString() {
        def result = "MessageImpl\n"
        result += "  Properties\n"
        properties.each {
            result += "  - ${it.key} -> ${it.value}\n"
        }
        result += "  Headers\n"
        headers.each {
        result += "  - ${it.key} -> ${it.value}\n"
        }
        result += "  >>> Body\n"
        result += "  ${body}\n"
        result += "  <<< Body\n"
    }
}