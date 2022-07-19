package apitesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC02_POST {

	@Test
	void create() {

		RestAssured.baseURI = "https://reqres.in/api/users";

		RequestSpecification httpreq = RestAssured.given();

		JSONObject params = new JSONObject();

		params.put("name","morpheus");

		params.put("job","leader");

		// specifycontenttype
		httpreq.header("Content-Type", "application/json");

		// to join the paramters with post req
		httpreq.body(params.toJSONString());

		Response resp = httpreq.request(Method.POST);

		int statusCode = resp.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 201);

		System.out.println("User is successfully created");
		
		
		String body = resp.getBody().asString();
		
		System.out.println("NEW USER  " +body);
		
	}

}
