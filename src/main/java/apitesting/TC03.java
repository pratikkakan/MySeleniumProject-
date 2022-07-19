package apitesting;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC03 {

	//validating the headers
	@Test
	void googlemap() {
		RestAssured.baseURI = "https://reqres.in/api";

		RequestSpecification req = RestAssured.given();

		Response res = req.request(Method.GET, "/users?delay=3");

		String body = res.getBody().asString();
		System.out.println("Response body : " + body);

		String content = res.header("Content-Type");

		Assert.assertEquals(content, "application/json; charset=utf-8");

		System.out.println("content type is verfied successfully");

		String contencode = res.getHeader("Content-Encoding");

		Assert.assertEquals(contencode, "gzip");

		System.out.println("Content code is verified successfully");

		// for all headers
		Headers allheaders = res.headers();

		List<Header> hd = allheaders.asList();

		for (Header hd1 : hd) {

			System.out.println(hd1);

		}

	}
}