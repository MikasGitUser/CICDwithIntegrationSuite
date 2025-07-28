import com.sap.gateway.ip.core.customdev.util.Message;

def Message processData(Message message) 
{
	def body = message.getBody(java.lang.String) as String;
	def messageLog = messageLogFactory.getMessageLog(message);
	if(messageLog != null)
	{
	messageLog.addAttachmentAsString("After Mapping:", body, "text/plain");
     }
	return message;
}