package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

import POJO.JSONPOJOExample;

public class JSONPOJOparsingExample {
	
	@Test
public void	JSONPOJOparsingExample() throws FileNotFoundException, IOException, ParseException {
		
		String path = System.getProperty("user.dir") + "/JSONfile/JSONPOJOExample.json";

		Object obj = new JSONParser().parse(new FileReader(path));
		String strng1 = obj.toString();
		ObjectMapper objmapper1 = new ObjectMapper();
		
	JSONPOJOExample jsonpojoExample =	objmapper1.readValue(strng1, JSONPOJOExample.class);
	
	    List<String> l1 =   jsonpojoExample.getHomeworld();
	    System.out.println(l1.get(1));
	
		
		
		
	}

}
