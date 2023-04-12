package org.testing.testcases;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_ArrayComplexJson_POJOClasses {

	public static void main(String[] args) {
//		
//		{
//		      "surname": "Sumit",
//		      "name": "Kumar",
//		      "batch": "Tech",
//		      "id": "19",
//		      "address": [
//		        {
//		          "addLine3": "Shahpur Jat",
//		          "addLine2": "B",
//		          "addLine1": "170)",
//		          "addLine4": "New Delhi-110049"
//		        },
//		        {
//		          "addLine3": "Shahpur Jat",
//		          "addLine2": "B",
//		          "addLine1": "170)",
//		          "addLine4": "New Delhi-110049"
//		        }
//		      ]
//		    }
		
		AddressInformation[] Address = new AddressInformation[2];
		
		Address[0] =new AddressInformation();
		Address[0].setAddLine1("170)");
		Address[0].setAddLine2("B");
		Address[0].setAddLine3("Shahpur Jat");
		Address[0].setAddLine4("New Delhi-110049");
		
		Address[1] =new AddressInformation();
		Address[1].setAddLine1("170)");
		Address[1].setAddLine2("B");
		Address[1].setAddLine3("Shahpur Jat");
		Address[1].setAddLine4("New Delhi-110049");

		BasicInformationArray basic= new BasicInformationArray();
		basic.setSurname("Sumit");
		basic.setName("Kumar");
		basic.setBatch("Tech");
		basic.setId("19");
		basic.setAddress(Address);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
		        .post("http://localhost:3000/APIStudentsList");
		System.out.println("status code is "+res.statusCode());
		// TODO Auto-generated method stub

	}

}
