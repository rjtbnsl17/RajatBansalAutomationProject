package com.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given; // given ko use krne k lie  package

import java.io.File;

//import org.codehaus.groovy.runtime.metaclass.NewMetaMethod;

//import com.sun.org.apache.bcel.internal.generic.NEW;

// restAssured all methpods here

public class RestAssuredSample {

	Response response; // Response class in restassured

	int responseCode;
	// public String tokenvalue =null;

	public void setBaseURI(String baseuri) {
		RestAssured.baseURI = baseuri;
		// restassured jar file/library
		// restassured jar mein hi hai baseURI defined

	}

	public void setBasePath(String basepath) {

		RestAssured.basePath = basepath;
	}

	public Response getRequest() {

		response = given().when().get(); // get ki api ko hit kr rhe h

		return response;

	}

	public Response PostRequest(String path) {

		response = given().header("Content-Type", "application/json").body(new File(path)).post(); // json file is
																									// passing in body
		// json can covert into string , can pass to body also

		// response.jsonPath().get("token"); // one way to get body key values

		return response;

	}

	public int httpsStatus() {

		responseCode = given().when().get().getStatusCode();
		return responseCode;

	}

	public Response queryParam() {

		response = given().queryParam("q", "London,uk").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").when()
				.get();

		return response;

	}

	public Response jsonbody(String newvalue1) {

		response = given().baseUri("https://restful-booker.herokuapp.com/booking").body(newvalue1).log().all().when()
				.get();

		return response;
	}

	public Response postjson(String jSON) {

		response = given().header("Content-Type", "application/json").log().all().body(jSON).when().post();
		return response;
	}
}
