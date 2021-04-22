package APIClass;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import utilities_JavaMail.MonitoringMail;
import utilities_JavaMail.TestConfig;


public class TestMail
{

	public void mail() throws AddressException, MessagingException
	{
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);
	}
	
}
