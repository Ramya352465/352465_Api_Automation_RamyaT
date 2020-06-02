package Api_Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Cas1_Get {
     
	@Test
	void getweatherdetails()
	{
		RestAssured.baseURI="http://postman-echo.com/get?foo1=bar1&foo2=bar2";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String value =response.getBody().asString();
		System.out.println("Response is"+ value);
		int StatusCode=response.getStatusCode();
		System.out.println("Status Code is"+ StatusCode);
		Assert.assertEquals(StatusCode,200);
		String statusline=response.getStatusLine();
		System.out.println("Status line is"+ statusline);
		Assert.assertEquals(statusline,"HTTP/1.1 200 OK");
	}	
	
}
