package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {

	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User enters valid username (.+)$")
	public void user_enters_valid_username(String string) {
		System.out.println(" username is:"+string);
	}

	@When("^User enters valid password (.+)$")
	public void user_enters_valid_password(String string) {
		System.out.println(" password is:"+string);
	}

	@When("User Clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User enters invalid username {string}")
	public void user_enters_invalid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should get propert error message")
	public void user_should_get_propert_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
