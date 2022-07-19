package apitesting;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice {

	@Test
	public void userlist() {

		RestAssured.baseURI = "https://reqres.in/api";

		RequestSpecification httpreq = RestAssured.given();

		Response res = httpreq.request(Method.GET, "/users?page=2");

		String body = res.getBody().asString();

		int sts = res.getStatusCode();
		
		Assert.assertEquals(sts,200);
		
		System.out.println("validation successfull");
}
}