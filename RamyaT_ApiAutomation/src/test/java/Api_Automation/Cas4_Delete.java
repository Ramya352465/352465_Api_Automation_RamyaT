package Api_Automation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Cas4_Delete {

	
	@Test
	void removeMethod()
	{
		RestAssured.baseURI="http://postman-echo.com/delete";
		RequestSpecification httpRequest = RestAssured.given();
	    
		JSONObject requestParam = new JSONObject();
	    
	    requestParam.put("foo1","bar1");
	    
	    httpRequest.header("Content-Type","application/json");
	    
	    httpRequest.body(requestParam.toJSONString());
	    
	    Response response = httpRequest.request(Method.DELETE);
	    
	    String value =response.getBody().asString();
		System.out.println("Response is"+ value);
		
		int statusCode=response.getStatusCode();
		System.out.println("Status Code is"+ statusCode);
		Assert.assertEquals(statusCode,200);
	}
		
}
