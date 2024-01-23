package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
	
import PojoClassForParsing.EmployeeDetails;
	
public class DeSerialisationOfEmployeeDetailsTest {
	@Test
	
	public void deSerialisationOfEmployeeDetails() throws JsonParseException, JsonMappingException, IOException {
		//create the object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//read the values from object mapper
		EmployeeDetails value=objm.readValue(new File("./EmployeeDetails.json"),EmployeeDetails.class);
		System.out.println(value.geteName());
		System.out.println(value.geteId());
		System.out.println(value.getEmail());
		System.out.println(value.getPhoneNo());
		
		System.out.println(value.getAddress());
	}	
	
}	
