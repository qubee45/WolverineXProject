package upskill.api.restAssured;

import java.io.File;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class EmployeeRestSteps {
	
	@Given("^Create new employee record$")
	public void create_new_employee_record() throws Throwable {
	
	  
	}

	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
		
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code == " + statusCode);
		System.out.println("Response Body == " + responseBody);
	    
	}

	@Then("^Get single employee data by id$")
	public void get_single_employee_data_by_id() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code == " + statusCode);
		System.out.println("Response Body == " + responseBody);
	    
	}


}