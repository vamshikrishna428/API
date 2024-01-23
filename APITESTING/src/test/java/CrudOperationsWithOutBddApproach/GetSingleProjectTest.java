package CrudOperationsWithOutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProjectTest {
	@Test
	public void getOneProject() {
		
		Response response = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_980");
		ValidatableResponse valresponse = response.then();
		valresponse.assertThat().statusCode(200);
		valresponse.log().all();
		
	}

}
