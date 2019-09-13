package stepDefs;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import utilities.RestAssuredListener;

public class ListUsers {

	public static ResponseOptions<Response> response;
	
	@Given("^I have the base URL$")
	public void i_have_the_base_URL() throws Throwable {   
	}

	@When("^I send the GET request for \"([^\"]*)\"$")
	public void i_send_the_GET_request_for(String url) throws Throwable {
	   response = RestAssuredListener.GetRequestWithoutPathParam(url);
	}

	@Then("^I should receive the correct response code \"([^\"]*)\"$")
	public void i_should_receive_the_correct_response_code(String arg1) throws Throwable {
		// Assert that correct status code is returned.
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);		
	}

	@Then("^I should receive the correct response with one userName as \"([^\"]*)\"$")
	public void i_should_receive_the_correct_response_with_one_userName_as(String arg1) throws Throwable {
		// Assert that from the list of user one of the username is "Antonette".
		assertThat(response.getBody().jsonPath().get("username"), hasItem("Antonette"));
	}
	
}
