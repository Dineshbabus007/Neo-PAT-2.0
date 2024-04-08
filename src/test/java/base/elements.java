package base;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elements extends base {
	
public elements() {

	PageFactory.initElements(driver, this);
}


@FindBy(id="mail-input-id")
public WebElement email;

@FindBy(id="password-input-id")
public WebElement password;

@FindBy(id="sign-in-id")
public WebElement loginbutton;

@FindBy(xpath="//div[@class='sidebar-icons']/button[1]")
public WebElement studentmenu;

@FindBy(xpath="//button[@class='p-element p-splitbutton-defaultbutton p-button p-component ng-star-inserted']")
public WebElement singleinvitebutton;

@FindBy(xpath="//div[@class='admission-department']/div/p-dropdown/div")
public WebElement Campus;

@FindBy(xpath="//ul[@role='listbox']//p-dropdownitem")
public List<WebElement> campusList;

@FindBy(xpath="(//span[contains(text(),'empty')])[1]")
public WebElement Admissionyear;

@FindBy(xpath="//ul[@role='listbox']//p-dropdownitem")
public List<WebElement> admissionList;

@FindBy(xpath="(//span[contains(text(),'empty')])[1]")
public WebElement Passoutyear;

@FindBy(xpath="//ul[@role='listbox']//p-dropdownitem")
public List<WebElement> passoutList;

@FindBy(xpath="(//span[contains(text(),'empty')])[1]")
public WebElement Department;

@FindBy(xpath="//ul[@role='listbox']//p-dropdownitem")
public List<WebElement> departmentList;

@FindBy(xpath="(//span[contains(text(),'empty')])[1]")
public WebElement DegreeSpec;

@FindBy(xpath="//ul[@role='listbox']//p-dropdownitem")
public List<WebElement> degreeList;

@FindBy(xpath=("//li[@class='p-chips-input-token']/input[@type='text']"))
public WebElement Emailinputfield;

@FindBy(xpath=("//button[contains(text(),'Invite')]"))
public WebElement invitebutton;

public WebElement getInvitebutton() {
	return invitebutton;
}





@FindBy(xpath=("//button[@class='p-element p-splitbutton-menubutton p-button-icon-only p-button p-component']"))
public WebElement dropdown;

public WebElement getDropdown() {
	return dropdown;
}
@FindBy(xpath=("//span[contains(text(),'Bulk Invite')]"))
public WebElement bulkinvite;

public WebElement getBulkinvite() {
	return bulkinvite;
}
@FindBy(xpath=("//div[@class='bulkUpload-dropzone ng-star-inserted']"))
public WebElement uploadicon;

public WebElement getUploadicon() {
	return uploadicon;
}

@FindBy(xpath=("//span[@class='flex gap-5 align-center ng-star-inserted'][2]"))
public WebElement savefile;

public WebElement getSavefile() {
	return savefile;
}

@FindBy(xpath=("//button[@class='p-button-create blue-filled-btn']"))
public WebElement clickbulkinvite;

public WebElement getClickbulkinvite() {
	return clickbulkinvite;
}




public WebElement getCampus() {
	return Campus;
}

public List<WebElement> getCampusList() {
	return campusList;
}

public WebElement getAdmissionyear() {
	return Admissionyear;
}

public List<WebElement> getAdmissionList() {
	return admissionList;
}

public WebElement getPassoutyear() {
	return Passoutyear;
}

public List<WebElement> getPassoutList() {
	return passoutList;
}

public WebElement getDepartment() {
	return Department;
}

public List<WebElement> getDepartmentList() {
	return departmentList;
}

public WebElement getDegreeSpec() {
	return DegreeSpec;
}

public List<WebElement> getDegreeList() {
	return degreeList;
}

public WebElement getEmailinputfield() {
	return Emailinputfield;
}

public WebElement getSingleinvitebutton() {
	return singleinvitebutton;
}

public WebElement getStudentmenu() {
	return studentmenu;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbutton() {
	return loginbutton;
}
public void sendKeys(String filePath) {
	// TODO Auto-generated method stub
	
}

}
