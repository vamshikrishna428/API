package CrudOperationsWithBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class CreateProject {
	@Test
	public void createProject() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Beem");
		jobj.put("projectName", "ChotaBeem");
		jobj.put("status", "not done");
		jobj.put("teamSize", 12);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.statusCode(201)
		.log().all();
		
		
	}
}
