package Weather;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

import org.apache.http.HttpStatus;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.org.apache.xpath.internal.functions.FuncFalse;
//import com.sun.org.apache.xpath.internal.functions.FuncFalse;
//import com.sun.tools.javac.util.Assert;
import com.test.RestAssuredSample;
//import org.junit.Assert;

import groovy.json.JsonOutput;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import static io.restassured.RestAssured.given;

public class GETWeatherAPI extends RestAssuredSample {

	public String newvalue = null;

	RestAssuredSample restassuredsample;

	@BeforeClass
	public void referenceClass() {

		restassuredsample = new RestAssuredSample();

	}

	@BeforeTest
	public void object() {

		HashMap<String, Object> cart = new HashMap<String, Object>();

		HashMap<String, Object> jso = new HashMap<String, Object>();

		// JSONArray jarr = new JSONArray();

		HashMap<String, String> mta = new HashMap<>();

		mta.put("board", "P Central Odisha Distribution Limited");
		mta.put("district", "N/A");
		mta.put("sub_district", "N/A");
		mta.put("sub_division", "N/A");
		mta.put("state", "Odisha");
		mta.put("recharge_number", "502S02911022");

		jso.put("meta_data", mta);

		jso.put("product_id", "318747779");
		jso.put("qty", "1");

		HashMap<String, String> config = new HashMap<>();
		config.put("price", "10");
		config.put("category_id", "26");
		config.put("recharge_number", "502s02911022");
		jso.put("configuration", config);

		/*
		 * String json =jso.toString(); System.out.println(json);
		 */

		cart.put("cart_items", jso);

		/*
		 * String json = cart.toString();
		 * 
		 * System.out.println(json);
		 */

		JSONObject all = new JSONObject();
		all.putAll(cart);
		System.out.println(all);
		newvalue = all.toString();
		System.out.println(newvalue);
		Response r4 = given().body(newvalue).log().all().when().get();

	}

	@Test(enabled = false)
	public void GETweatherAPI() {

		restassuredsample.setBaseURI("http://demoqa.com");
		restassuredsample.setBasePath("utilities/weather/city/Karnal");

		Response res = restassuredsample.getRequest();
		System.out.println(res.prettyPrint());

		int actual = restassuredsample.httpsStatus();
		// Assert.assertEquals(actual,HttpStatus.SC_OK );

		System.out.println("actual code : " + actual);
		System.out.println("expected code : " + HttpStatus.SC_OK);

	}

	@Test(priority = 1, enabled = false)

	public void getQueryParam() {

		restassuredsample.setBaseURI("https://samples.openweathermap.org");
		restassuredsample.setBasePath("data/2.5/weather");
		Response r1 = restassuredsample.queryParam();
		System.out.println("***********************************************");
		System.out.println(r1.prettyPrint());
		String name = r1.jsonPath().get("name");
		System.out.println(name);

	}

	@Test
	public void jsonfunc() {

		Response r2 = restassuredsample.jsonbody(newvalue);
		System.out.println(r2);
	}

}
