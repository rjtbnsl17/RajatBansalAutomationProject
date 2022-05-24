package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.JSONParsingPOJO;

public class PassingJSONWithPOJO {

	@Test
	public void PassingJSONWithPOJO() throws FileNotFoundException, IOException, ParseException {
		String path = System.getProperty("user.dir") + "/JSONfile/POJOfileJSON.json";

		Object obj = new JSONParser().parse(new FileReader(path));
		String strng = obj.toString();

		ObjectMapper objmapper = new ObjectMapper();

		JSONParsingPOJO jpojo = objmapper.readValue(strng, JSONParsingPOJO.class);

		System.out.println(jpojo.getBirth_year());
		System.out.println(jpojo.getEye_color());

	}
}
