package CrudOperationsWithOutBddApproach;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject1 {
	@Test
	public void addProject() {
		// As we are using post http method --> Creating the body
		Random ran=new Random();
		int r = ran.nextInt(1036);

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sony");
		jobj.put("projectName", " "+r);
		jobj.put("status", "not done");
		jobj.put("teamSize", 12);
		
		//Preconditions
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		
		//actions
		Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
		
		//validations
		response.getContentType();
		
		ValidatableResponse valReponse = response.then();
		
		valReponse.assertThat().contentType(ContentType.JSON);
		
		valReponse.assertThat().statusCode(201);

		valReponse.log().all();
		
		
	}
}
