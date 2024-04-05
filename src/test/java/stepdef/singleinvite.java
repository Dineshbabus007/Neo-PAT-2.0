package stepdef;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import base.base;
import base.elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class singleinvite extends base{
	
	elements l;

	@Given("user login to the portal")
	public void user_login_to_the_portal() {
	    
		launchBrowser();
	    windowMaximize();
	    launchUrl("https://pat.dev.iamneo.ai/login");
	    System.out.println("URL Launched");
	     String exurl =driver.getCurrentUrl();
	    String url = "https://pat.dev.iamneo.ai/dashboard";
	    
	}

	@Given("User enter the email id and User enter the password")
	public void user_enter_the_email_id_and_user_enter_the_password() {
		
		l = new elements();
		passText("dinesh@iamneo.ai", l.getEmail());
		passText("dinesh", l.getPassword());
	    
	}

	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() {
		
		l = new elements();
		clickBtn(l.loginbutton);
	    
	}
	@Given("The user should go to the manage students page")
	public void the_user_should_go_to_the_manage_students_page() throws InterruptedException {
	    
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.studentmenu);
		
	}
	@When("The user should click the single invite button")
	public void the_user_should_click_the_single_invite_button() throws InterruptedException {
	    
		Thread.sleep(10000);
		l = new elements();
		clickBtn(l.singleinvitebutton);
	}

	@Then("User should select campus")
	public void user_should_select_campus() throws InterruptedException {
	    
		Thread.sleep(4000);
		l = new elements();
		clickBtn(l.Campus);
		
		System.out.println("Campus dropdown clicked");
		Reusability.Dropdown_Selection.Dropdown_selection(l.campusList, "Dinesh");
		System.out.println("Campus selected");
	}

	
	  @Then("User should select Admission year") public void
	  user_should_select_admission_year() throws InterruptedException 
	  {
	  
		  Thread.sleep(4000);
	   l=new elements();
	   Reusability.JS_Executor.ClickElement(driver,l.Admissionyear);
	  System.out.println("Admission dropdown clicked");
	  Reusability.Dropdown_Selection.Dropdown_selection(l.admissionList, "2017");
	  }
	  
	  @Then("User should select Pass out year") public void
		 user_should_select_pass_out_year() throws InterruptedException {
		  
		  Thread.sleep(4000);
		   l=new elements();
		   Reusability.JS_Executor.ClickElement(driver,l.Passoutyear);
		  Reusability.Dropdown_Selection.Dropdown_selection(l.passoutList, "2021");
		  System.out.println("Passout year selected");
	  }
	  @Then("User should select Department") public void
		 user_should_select_department() throws InterruptedException {
		  
		  Thread.sleep(4000);
		   l=new elements();
		   Reusability.JS_Executor.ClickElement(driver,l.Department);
		  Reusability.Dropdown_Selection.Dropdown_selection(l.departmentList, "CSE");
		  System.out.println("Department selected");
		  }
		  
		  @Then("User should select Degree & Spec") public void
		  user_should_select_degree_spec() throws InterruptedException {
		  
			  Thread.sleep(4000);
			   l=new elements();
			   Reusability.JS_Executor.ClickElement(driver,l.DegreeSpec);
			  Reusability.Dropdown_Selection.Dropdown_selection(l.degreeList, "B. Tech - Computer Science and Engineering (Information Security)");
			  System.out.println("DegreeSpec selected");
		  }

@Then("User should enter email ids") public void
user_should_enter_email_ids() throws InterruptedException {
Thread.sleep(4000);
	 l=new elements();
	   passText("dineshautomation2@examly.in", l.getEmailinputfield());
	   l.getEmailinputfield().sendKeys(Keys.ENTER);
	   System.out.println("Emails are added");
 }

@When("Invite button is clicked")
public void invite_button_is_clicked() throws InterruptedException {
	Thread.sleep(4000);
	   l=new elements();
	   Reusability.JS_Executor.ClickElement(driver,l.invitebutton);
	   System.out.println("Invite button clicked");
}
}