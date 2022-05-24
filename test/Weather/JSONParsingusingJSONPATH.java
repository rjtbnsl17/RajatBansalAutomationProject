package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JSONParsingusingJSONPATH {
@Test
	public void JSONParsingusingJSONPATH() throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir") + "/JSONfile/JSONParseExample.json";

		Object obj = new JSONParser().parse(new FileReader(path));

		String s = obj.toString();

		JsonPath jsonpath1 = new JsonPath(s);
		
	String code =	jsonpath1.get("status.message.title").toString();
	
	System.out.println("code is--- "+code);

	}

}
