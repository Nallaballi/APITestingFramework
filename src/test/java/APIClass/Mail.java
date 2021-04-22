package APIClass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.testng.annotations.Test;
import utilities_JavaMail.MonitoringMail;
import utilities_JavaMail.MailConfig;


public class Mail
{
	static String messageBody;
	
	@Test
	public void sendMail() throws AddressException, MessagingException
	{
		
		try {
			messageBody="http://" + InetAddress.getLocalHost().getHostAddress() + ":8080/job/API%20Testing%20Framework/My_20Extent_20Reports_20from_20Git/";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(MailConfig.server, MailConfig.from, MailConfig.to, MailConfig.subject, messageBody);
		

	}
	

	
}
