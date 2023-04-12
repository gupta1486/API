package org.testing.testcases;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class Post_SimpleJSonwithBodydata_PojoClasses {
	public static void main(String[] args) {
		
		BasicInformation basic= new BasicInformation();
		basic.setSurname("Sumit");
		basic.setName("Kumar");
		basic.setBatch("Tech");
		basic.setId("17");
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
		        .post("http://localhost:3000/APIStudentsList");
		System.out.println("status code is "+res.statusCode());
		//System.out.println("Response Data is ");
	}
	
		
}
