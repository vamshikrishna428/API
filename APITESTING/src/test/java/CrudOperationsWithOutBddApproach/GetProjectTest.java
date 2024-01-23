package CrudOperationsWithOutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProjectTest {
	@Test
	public void getProject() {
		
		Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
		ValidatableResponse valresponse = response.then();
		valresponse.assertThat().statusCode(200);
		valresponse.log().all();
		
	}
}
