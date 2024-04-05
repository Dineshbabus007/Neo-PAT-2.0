package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import base.base;
import base.elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bulkinvite extends base {
	
	elements l;
	
	@Given("Admin login to the site")
	public void admin_login_to_the_site() {
		
		launchBrowser();
	    windowMaximize();
	    launchUrl("https://pat.dev.iamneo.ai/login");
	    System.out.println("URL Launched");
	    l = new elements();
		passText("dinesh@iamneo.ai", l.getEmail());
		passText("dinesh", l.getPassword());
		clickBtn(l.loginbutton);
		
		System.out.println("Login successful");
	    
	}

	@Given("User should go to the manage students page")
	public void user_should_go_to_the_manage_students_page() throws InterruptedException {
		
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.studentmenu);
		
		System.out.println("Student menu clicked");
	    
	}

	@When("User click the dropdown icon")
	public void user_click_the_dropdown_icon() throws InterruptedException {
		
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.dropdown);
		
		System.out.println("dropdown clicked");
	}

	@When("User should click the Bulk invite button")
	public void user_should_click_the_Bulk_invite_button() throws InterruptedException {
	   
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.bulkinvite);
		
		System.out.println("bulkinvite clicked");
	}

	@When("Click the Upload icon")
	public void click_the_Upload_icon() throws InterruptedException, AWTException {
	    
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.uploadicon);
		
		Thread.sleep(5000);
		
		String file = "C:\\Users\\Dinesh\\Desktop\\Automation Excel Upload\\bulkinvite.xlsx";
		StringSelection selection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//l.sendKeys(filePath);
		
		System.out.println("file uploaded");
	}

	@Then("Save the uploaded file")
	public void save_the_uploaded_file() throws InterruptedException {
		
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.savefile);
	    
		System.out.println("Clicked save");
	}

	@Then("Click the bulk invite button.")
	public void click_the_bulk_invite_button() throws InterruptedException {
	    
		Thread.sleep(7000);
		l = new elements();
		clickBtn(l.clickbulkinvite);
		
		System.out.println("bulkinvite button clicked");
	}
}
