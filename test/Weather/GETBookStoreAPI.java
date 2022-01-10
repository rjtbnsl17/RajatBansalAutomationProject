package Weather;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
//import com.sun.tools.javac.util.Assert;
import com.test.RestAssuredSample;

import io.restassured.response.Response;

// every api methods here

public class GETBookStoreAPI extends RestAssuredSample {

	RestAssuredSample restassuredsample;
	
	@BeforeClass
	public void setReference() {

		restassuredsample = new RestAssuredSample();

	}

	@Test
	public void seturipath() {

		restassuredsample.setBaseURI("https://bookstore.toolsqa.com");
		restassuredsample.setBasePath("BookStore/v1/Books");
		Response resp = restassuredsample.getRequest();
		System.out.println(resp.prettyPrint());
		org.testng.Assert.assertTrue(false);

	}

}