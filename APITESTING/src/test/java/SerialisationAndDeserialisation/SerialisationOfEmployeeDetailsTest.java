package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForParsing.EmployeeDetails;
import PojoClassForParsing.EmployeeDetails2;
import PojoClassForParsing.EmployeeDetails3;
import PojoClassForParsing.EmployeeDetailsWithArrayAndObject;

public class SerialisationOfEmployeeDetailsTest {
	@Test
	/*	public void serialisationOfEmployeeDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		//step1--create object for the pojo class
		EmployeeDetails ed1=new EmployeeDetails("ntr", "tyss-ntr", "gujarat", 984922608, "tyssntr@gmail.com");

		//step2--create the object for the object mapper
		ObjectMapper objm = new ObjectMapper();

		//step3--write the values to json file
		objm.writeValue(new File("./EmployeeDetails.json"), ed1);

	}
	 */
	/*	public void serialisationOfEmployeeDetailswithintArrayTest() throws JsonGenerationException, JsonMappingException, IOException {
		int[] phoneNo= {984922608,949444573};
		EmployeeDetails2 ed2=new EmployeeDetails2("ntr","tyss" , "Bangalore", 25000, phoneNo, "tyss-vamshi@gmail.com");
		//step2--create the object for the object mapper
		ObjectMapper objm = new ObjectMapper();

		//step3--write the values to json file
		objm.writeValue(new File("./EmployeeDetails2.json"), ed2);


	}
	 */
/*	public void serialisationOfEmployeeDetailswithStringArrayTest() throws JsonGenerationException, JsonMappingException, IOException {
		String[] email = {"vamshi@tyss.com","restassured@tyss.com"};
		EmployeeDetails3 ed3=new EmployeeDetails3("vamshi", "6220751", "Bangalore", 10000, 984922608, email);
		//step2--create the object for the object mapper
		ObjectMapper objm = new ObjectMapper();

		//step3--write the values to json file
		objm.writeValue(new File("./EmployeeDetails3.json"), ed3);

	}
	*/
	
	public void serialisationOfEmployeeDetailswithArrayAndString() throws JsonGenerationException, JsonMappingException, IOException {
		int[] salary= {25000,10000};
		String[] email= {"vamshi@tyss.com","restapi@tyss.com"};
		EmployeeDetailsWithArrayAndObject edas=new EmployeeDetailsWithArrayAndObject("vamshi", "tyss-6602651", "Bangalore", salary, 984922608, email);
		//step2--create the object for the object mapper
		ObjectMapper objm = new ObjectMapper();

		//step3--write the values to json file
		objm.writeValue(new File("./EmployeeDetailsWithArrayAndObject.json"), edas);
		
	}
}

