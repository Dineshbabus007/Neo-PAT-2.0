package stepdef;

import base.base;
import base.elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends base {

	elements l;

	@Given("the user should login into to the application")
	public void the_user_should_login_into_to_the_application() {
		
		System.out.println("Initialized process");
	    launchBrowser();
	    windowMaximize();
	    System.out.println("Finished launching browser");
	}

	@When("User clicks on the login link")
	public void user_clicks_on_the_login_link() {

		launchUrl("https://pat.dev.iamneo.ai/login");

	}

	@When("User enter the email id")
	public void user_enter_the_email_id() {

		l = new elements();
		passText("dinesh@iamneo.ai", l.getEmail());
	}

	@When("User enter the password")
	public void user_enter_the_password() {

		l = new elements();
		passText("dinesh", l.getPassword());

	}

	@When("User clicks the Login button")
	public void user_clicks_the_login_button() {

		l = new elements();
		clickBtn(l.loginbutton);

	}

	@Then("Login should happen successfully")
	public void login_should_happen_successfully() {

		pageUrl();

	}
	
}
