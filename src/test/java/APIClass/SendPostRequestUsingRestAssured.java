package APIClass;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class SendPostRequestUsingRestAssured
{

	@Test
	public void postRequest()
	{
		Response res = given().auth().basic("sk_test_51IJ559FmDlJard7s3vNx5bB5mWKlobkZa6QFOFBmPq7CC9kJ4HKxvw1MHlRQxOyXS63044RevkATUK776Dl1dFJX00O6fwTl0D","" )
		.param("key", "#12345")
		.formParam("address[line1]","A-12345 New Delhi").formParam("address[line3]","Long Road").formParam("address[line5]","New Delhi India")//HashMap
		.formParam("preferred_locales[0]", "Test1").formParam("preferred_locales[1]", "Test2")//ArrayLiat
		.post("https://api.stripe.com/v1/customers");
		
		System.out.println("This statu code : " + res);
		Assert.assertEquals(res, 200);
		
		res.prettyPrint();
	}
}

