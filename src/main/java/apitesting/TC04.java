package apitesting;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC04 {

	
	//validate json response
	@Test
	void jsonrsTest() {
		
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		RequestSpecification req = RestAssured.given();
		
		Response res = req.request(Method.GET);
		
		String body = res.asString();
		
		System.out.println("Response body is : "+body);
		
		Assert.assertEquals(body.contains("Janet"), true);
		
		System.out.println("response body is validated");
		
		//verify all the values
		
		JsonPath path = res.jsonPath();
		
	
		System.out.println(path.get());
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
