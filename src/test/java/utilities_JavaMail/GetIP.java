package utilities_JavaMail;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.testng.annotations.Test;

public class GetIP
{
	static String ip;
	
	@Test
	public void getIPAddress()
	{
		
		try {
			ip=("http://" + InetAddress.getLocalHost().getHostAddress() + ":8080/job/API%20Testing%20Framework/My_20Extent_20Reports_20from_20Git/");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
