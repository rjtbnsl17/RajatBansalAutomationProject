package Weather;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNGAnnotation {
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("BeforeTEST");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Beforeclass");
	}
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("Beforesuite");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("BeforeMethod");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		
		System.out.println("BeforeGroup");
	}
	
	@Test
	public void test()
	
	{
		
		System.out.println("Test");
		System.out.println("new ");
	}
	
	
	
	
	
	
	
	
	
	

}
