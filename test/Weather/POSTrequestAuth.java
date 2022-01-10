package Weather;

import java.nio.file.Path;

import org.codehaus.groovy.runtime.StringGroovyMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.RestAssuredSample;

import io.restassured.response.Response;

public class POSTrequestAuth extends RestAssuredSample {

	RestAssuredSample restAssuredSample;

	String PathJson = "/Users/rajatbansal/eclipse-workspace/restAssured project/JSON file/JSON.json";

	@BeforeClass
	public void referenceClass() {

		restAssuredSample = new RestAssuredSample();

	}

	@Test

	public void postrequestTest() {

		restAssuredSample.setBaseURI("https://bookstore.toolsqa.com");
		restAssuredSample.setBasePath("Account/v1/GenerateToken");

		Response re = restAssuredSample.PostRequest(PathJson);

		System.out.println(re.prettyPeek());
		// System.out.println(re.getHeader("result"));
		// String a =re.header("Content-Type");
		// System.out.println(a);

		String token = re.then().extract().path("token"); // get body keys

		System.out.println("token value :" + token);
		// tokenvalue = re.getHeader("token");

		// System.out.println(re.getHeader("token"));
		// System.out.println("tokenvalue :" +tokenvalue);

	}

}
