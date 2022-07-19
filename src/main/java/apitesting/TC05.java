package apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC05 {

	@Test
	void authenticate() {

		// authentication should be before request

		RestAssured.baseURI = "https://postman-echo.com/basic-auth";

		// Authentication

		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();

		auth.setUserName("postman");
		auth.setPassword("password");

		// specify which type of authentication it is
		RestAssured.authentication = auth;
		
		
		

		RequestSpecification req = RestAssured.given();

		Response rs = req.request(Method.GET);
		
		System.out.println(rs.getBody().asString());
		System.out.println(rs.getStatusLine());

	}

}
