package CrudOperationsWithOutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProjectTest {
		
	@Test
	public void deleteProjectTest() {
		
		Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_3906");
		ValidatableResponse valresponse = response.then();
//		valresponse.assertThat().statusCode(200);
		valresponse.log().all();
		
		
		
		
		
	}
}
