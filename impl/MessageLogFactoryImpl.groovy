package impl

import com.sap.it.api.msglog.MessageLogFactory
import com.sap.it.api.msglog.MessageLog

class MessageLogFactoryImpl implements MessageLogFactory {
    def messageLog = new MessageLogImpl()

    MessageLog getMessageLog(Object context) {
        return messageLog
    }
}