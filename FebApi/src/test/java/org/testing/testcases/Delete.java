package org.testing.testcases;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Delete {

	public static void main(String[] args) {
		//https://jsonpath.com/
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete("http://localhost:3000/APIStudentsList/1");
		
		
			
	}

}
