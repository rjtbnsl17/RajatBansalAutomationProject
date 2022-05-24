package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JSONParseExample {

	@Test
	public void JSONParseExample() throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir") + "/JSONfile/JSONParseExample.json";

		Object obj = new JSONParser().parse(new FileReader(path));

		System.out.println(obj instanceof JSONArray);
		System.out.println(obj instanceof JSONObject);

		JSONObject jsonObj = (JSONObject) obj;
		JSONObject jsonObj1 = (JSONObject) jsonObj.get("status");
		JSONObject jsonObj2 = (JSONObject) jsonObj1.get("message");
		System.out.println("--------------------------");
		System.out.println(jsonObj2.get("message"));
		System.out.println(jsonObj2.get("title"));
		System.out.println(jsonObj1.get("result"));

	}

}
