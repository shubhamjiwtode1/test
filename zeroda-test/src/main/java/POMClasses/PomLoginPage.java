package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
	
	 private WebDriver driver;
	 
	 @FindBy (xpath="//input[@id='userid']")
	 private WebElement Username;
	 
	 @FindBy (xpath="//input[@id='password']")
	 private WebElement Password;
	 
	 @FindBy (xpath="//button[@class='button-orange wide']")
	 private WebElement Loginbutton;
	 
	 @FindBy (xpath="//input[@id='pin']")
	 private WebElement PIN;
	 
	 @FindBy (xpath="//button[@type='submit']")
	 private WebElement Continue;
	 
	 public PomLoginPage(WebDriver driver){   
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void sendUserName() {
		 Username.sendKeys("DV1510");
	 }
	 
	 public void sendPassword(){
		Password.sendKeys("Pass@123"); 
	 }

	 public void clickloginbutton(){
		 Loginbutton.click(); 
	 } 
	 
	 public void PIN() {   
	 PIN.sendKeys("959594");
	 }
	 
	 public void clickcontinuebutton(){
		 Continue.click();
	 }
	 
 
	 
}
