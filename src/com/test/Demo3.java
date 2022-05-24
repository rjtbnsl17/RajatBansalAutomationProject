package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//import org.yaml.snakeyaml;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
//import com.sun.org.apache.bcel.internal.generic.NEW;

//Parse the YAML to tell how many people have names starting with the same alphabet, 
//compared to someone from their own generation only.
public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, JsonProcessingException, ParseException {

		InputStream fi = new FileInputStream("newFile.yml");

		Yaml yaml = new Yaml();
		HashMap<String, String> data = yaml.load(fi);


ObjectMapper mapper = new ObjectMapper();

String jsonString =  mapper.writeValueAsString(data);
System.out.println(jsonString);

Object obj = new JSONParser().parse(jsonString);


System.out.println(obj instanceof JSONObject);

JSONObject ob = (JSONObject) obj;

	
	System.out.println(ob.keySet());
	
JSONArray j1 =   (JSONArray) ob.get("GrandPa_Albert");

  






	}

}
