package org.testing.testcases;
import static io.restassured.RestAssured.*;

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
			//String id =res.jsonPath().get("[4].id");
		     //System.out.println(id);
		System.out.println("status code is "+res.statusCode());
		System.out.println("Response Data is ");
		System.out.println(res.asString());
//		
//		String[] name= {"sumit","test"};
//		int s=name.length;
//				System.out.println(s);
		
	}

}
