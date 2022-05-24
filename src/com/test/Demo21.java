package com.test;

import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Demo21 {
	
	
	Response r1;
		
		
		public void baseUR(String baseUR) {
			
			
			RestAssured.baseURI = baseUR;
		}
		
		public void basePat(String basePat) {
			
			RestAssured.basePath = basePat;
			
		}
		
		
		public Response getRequest(String path) {
			
			
			r1 = given().when().body(path).get();
			return r1;
			
			
		}
		
	}


