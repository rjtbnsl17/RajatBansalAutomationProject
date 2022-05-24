package Weather;

//import com.aventstack.extentreports.gherkin.model.Given;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.RestAssuredSample;

import POJO.JsonClass;
import POJO.NewJson;
//import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class passingJson extends RestAssuredSample {

	RestAssuredSample restAssuredSample;

	@BeforeClass
	public void Instantiate() {

		restAssuredSample = new RestAssuredSample();
		restAssuredSample.setBaseURI("https://bookstore.toolsqa.com");
		restAssuredSample.setBasePath("/Account/v1/GenerateToken");
	}

	@Test
	public void JsonPass() throws JsonProcessingException {

		// JsonClass jsonClass = new JsonClass("rohitsinha026", "Rohit@1234");

		NewJson newjson = new NewJson("rohitsinha026", "Rohit@1234");
		ObjectMapper objectMapper = new ObjectMapper();
		String jSON = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newjson);

		// System.out.println("jSON " +jSON);

		// Response resp = restAssuredSample.postjson(jSON);
		Response resp = given().header("Content-Type", "application/json").log().all().body(jSON).when().post();
		System.out.println("Response ---------> " + resp.asString());

		JSONObject jo = new JSONObject();
		jo.putAll(jo);

//	System.out.println(resp.asString());	

		String tokenValueString = resp.jsonPath().get("token");

		System.out.println("tokenValue is : " + tokenValueString);

	}

}
