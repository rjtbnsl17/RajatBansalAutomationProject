package Weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Book;
import POJO.POJOcomplex;
public class JSONPOJOComplex {
	
	@Test
	public void JSONPOJOComplex() throws FileNotFoundException, IOException, ParseException {
		
		String path = System.getProperty("user.dir") + "/JSONfile/JSONCOmplex.json";

		Object obj = new JSONParser().parse(new FileReader(path));
		String strng2 = obj.toString();
		ObjectMapper objmapper1 = new ObjectMapper();
		
		POJOcomplex pojoExample =	objmapper1.readValue(strng2, POJOcomplex.class);
		
		
	List<Book> b1 =	pojoExample.getBooks();
	
	for(int i=0; i<b1.size();i++) {
		
	Book b	= b1.get(i);
	System.out.println(b.getAuthor());
	System.out.println(b.getPages());
	
	
		
	}
		
		
		
	}

}
