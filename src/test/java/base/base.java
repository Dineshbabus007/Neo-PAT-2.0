package base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
public static WebDriver driver;
    
	public static void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
		
	}
    
    public static void closeBrowser() {
		driver.quit();
	}
 
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
 
	public static void launchUrl(String url) {
		driver.get(url);
	}
 
	public static String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
 
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
 
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
 
	public static void closeEntireBrowser() {
		driver.quit();
	}
 
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
 
	public static void Dropdown_selection(List<WebElement> ele, String value) 
	{
		for (WebElement element : ele) {
			 String str = element.getText();
			if (str.equalsIgnoreCase(value)) {
				element.click();
				break;
			}
		}
	}
	
	
	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}
	
 
	public static Actions a;
 
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
 
	public static void moveToTwoElement(WebDriver driver, WebElement ele, WebElement ele1) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).moveToElement(ele1).click().perform();
	}	
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
 
	public static JavascriptExecutor js;
 
	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
 
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public static void select(WebElement dropdown) {
		Select select= new Select(dropdown);
		select.selectByIndex(2);
	}
	
	
	//Waits
	public static void elementToBeClickable(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
 
	public static void elementToVisibility(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void visibilityAllelements(WebDriver driver, List<WebElement> ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}
	
	public static void alertIsPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
