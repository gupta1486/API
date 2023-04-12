package org.testing.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;





public class TC3_JsonExternaljsonFinePost {

	public static void main(String[] args) throws FileSystemNotFoundException, FileNotFoundException{
		// TODO Auto-generated method stub
		///FebApi/SimpleJsonBodyData.json
		
		File f =new File("../FebApi/JsonBodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener js = new JSONTokener(fr);//used for readon json file 
		JSONObject jo = new JSONObject(js);
		//System.out.println(jo.toString());
		
		String BodyData=jo.toString();
		Scanner s= new Scanner(System.in);
		String idvalue =s.next();
		//BodyData.replaceAll(pattern, idvalue)
		BodyData = BodyData.replaceAll(Pattern.quote("{{id}}"), idvalue);
		System.out.println(BodyData);
		Response rs=
		given()
		.contentType(ContentType.JSON)
		.body(BodyData)
		.when()
		.post("http://localhost:3000/APIStudentsList");
		System.out.println("status code is "+rs.statusCode());		

	}

}
