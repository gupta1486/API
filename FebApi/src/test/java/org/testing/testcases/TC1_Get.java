package org.testing.testcases;
import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TC1_Get {
	public static void main(String[] args) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		//.get("http://localhost:3000/APIStudentsList?id=1");
		//or 2nd way to fine id 
		.get("http://localhost:3000/APIStudentsList");
//or third Way
			String id =res.jsonPath().get("[4].id");
		     System.out.println(id);
		//System.out.println("status code is "+res.statusCode());
		//System.out.println("Response Data is ");
		//System.out.println(res.asString());
		
//***** Fetch single value of perticular field
		JSONArray js = new JSONArray(res.asString());
		JSONObject jo= js.getJSONObject(3);// 0 is for index of the object
		System.out.println("Fetch single value of perticular field" + jo.get("id"));
		
//get multiple occurrence of a key
		
		for(int i=0;i<js.length();i++)
		{
			JSONObject j= js.getJSONObject(i);
			//System.out.println("get multiple occurrence of a key");
			System.out.println("get multiple occurrence of a key " +  j.get("name"));
		}

//Extract all the key value of an object	

	for (int i=0; i<js.length();i++)
	{
		JSONObject O= js.getJSONObject(i);
	System.out.println("Extract all the key value of an object " + O.keySet());
	
	
	Set<String> ALLKey = O.keySet();
	for(String key:ALLKey)
	{
System.out.println("Extract all the key value of an object " + key +"=" + O.get(key));
	}
	}
			
	}

}
