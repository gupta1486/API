package org.testing.testcases;

import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_PostRequest {

	public static void main(String[] args) {

//	    "Address": [
//	      {
//	        "addLine3": "Southdelhi",
//	        "addLine4": "delhi",
//	        "addLine1": "170-B",
//	        "addLine2": "south"
//	      },
//	      {
//	        "addLine3": "Southdelhi",
//	        "addLine4": "delhi",
//	        "addLine1": "170-B",
//	        "addLine2": "south"
//	      }
//	    ],
//	    "surname": "gupta",
//	    "name": "gupta",
//	    "batch": "Feb",
//	    "id": "13"
		JSONObject inner1 = new JSONObject();
		inner1.put("addLine1","170-B");
		inner1.put("addLine2","south");
		inner1.put("addLine3","Southdelhi");
		inner1.put("addLine4","delhi");
		JSONObject inner2= new JSONObject();
		inner2.put("addLine1","170-B");
		inner2.put("addLine2","south");
		inner2.put("addLine3","Southdelhi");
		inner2.put("addLine4","delhi");
		
		JSONArray array = new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		JSONObject outer= new JSONObject();
		outer.put("name","gupta");
		outer.put("batch","Feb");
		outer.put("surname","gupta");
		outer.put("id","13");
		outer.put("Address",array);	
		
		Response res =
			given()
		.contentType(ContentType.JSON)
		        //.body(js.toString())
		        .body(outer.toString())
		        .body(outer.toString())
		        .when()
				.post("http://localhost:3000/APIStudentsList");
		System.out.println("status code is "+res.statusCode());
		System.out.println("Response Data is ");
		System.out.println(res.asString());
		
		
		
	}
}
