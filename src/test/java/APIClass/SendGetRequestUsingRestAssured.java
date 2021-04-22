package APIClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SendGetRequestUsingRestAssured 
{
	
	@Test
	public void postRequest()
	{
		RequestSpecification res = given().auth().basic("sk_test_51IJ559FmDlJard7s3vNx5bB5mWKlobkZa6QFOFBmPq7CC9kJ4HKxvw1MHlRQxOyXS63044RevkATUK776Dl1dFJX00O6fwTl0D","" );
		Response r = res.get("https://api.stripe.com/v1/customers");
		int s = r.statusCode();
		
		System.out.println("This statu code : " + s);
		Assert.assertEquals(s, 200);
		
		r.prettyPrint();
	}
	
}