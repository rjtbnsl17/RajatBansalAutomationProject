package Weather;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONParsing {

	@Test
	public void JSONParsing() throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir") + "/JSONfile/coinDCX.json";

		Object obj = new JSONParser().parse(new FileReader(path));

		if (obj instanceof JSONObject) {
			System.out.println("obj is json object");
		} else if (obj instanceof JSONArray) {
			System.out.println("obj is json array");
		}

		JSONArray JsonArray = (JSONArray) obj;

		for (int i = 0; i < JsonArray.size(); i++) {

			JSONObject JsonObject = (JSONObject) JsonArray.get(i + 2);

			String s1 = JsonObject.get("coin").toString();
			System.out.println(s1);
			break;
		}
	}

}
