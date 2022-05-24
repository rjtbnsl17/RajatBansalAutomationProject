package com.test;



import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SrcDemo {
Response response;
	
	public void setbaseURI(String BaseURI) {
		
		RestAssured.baseURI = BaseURI;
		
	}
	
    public void setbasepath(String Basepath) {
		
		RestAssured.basePath = Basepath;
		
	}
	
    public Response postmethod(String path) {
    	response = given().when().body(new File(path)).post();
    	return response;
    	
    	
    	
    }
    
}
