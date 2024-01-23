package CrudOperationsWithOutBddApproach;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutProjectTest {
	@Test
	public void putProject() {
		// As we are using post http method --> Creating the body
		Random ran=new Random();
		int r = ran.nextInt(1036);
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sony"+r);
		jobj.put("projectName", "name");
		jobj.put("status", "not done");
		jobj.put("teamSize", 12);

		//Preconditions
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);

		//actions
		Response response = reqspec.put("http://rmgtestingserver:8084/Projects/TY_PROJ_3906");

		//validations
		response.getContentType();

		ValidatableResponse valReponse = response.then();

		valReponse.assertThat().contentType(ContentType.JSON);


		valReponse.log().all();


	}
}
