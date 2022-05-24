import org.junit.Assert;

import com.test.SrcDemo;

import io.restassured.response.Response;

public class Demo1 extends SrcDemo{
	
	String baseURIString ="https://reqres.in/";
	String basepathString = "api/users";
	
	public String path = "Users/rajatbansal/eclipse-workspace/restAssured project/JSONfile/reqres.json";
	
	SrcDemo srcDemo;
	
	public void intializer() {
	
	srcDemo = new SrcDemo();
	
	
	}

	
	
	public void method() {
		
		srcDemo.setbaseURI(baseURIString);
		srcDemo.setbasepath(basepathString);
		
		
		Response r1 = srcDemo.postmethod(path);
		System.out.print("JSON reposne : " + r1);
		
		Assert.assertEquals(r1.jsonPath().get("name"),"ma" );
		
		
		
	}
	
}
