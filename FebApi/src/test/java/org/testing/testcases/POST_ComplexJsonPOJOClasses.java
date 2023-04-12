package org.testing.testcases;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_ComplexJsonPOJOClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddressInformation Address = new AddressInformation();
		Address.setAddLine1("170)");
		Address.setAddLine2("B");
		Address.setAddLine3("Shahpur Jat");
		Address.setAddLine4("New Delhi-110049");

		BasicInformation basic= new BasicInformation();
		basic.setSurname("Sumit");
		basic.setName("Kumar");
		basic.setBatch("Tech");
		basic.setId("18");
		basic.setAddress(Address);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
		        .post("http://localhost:3000/APIStudentsList");
		System.out.println("status code is "+res.statusCode());
	
		
	}

}
