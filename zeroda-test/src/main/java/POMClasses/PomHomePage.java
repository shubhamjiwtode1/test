package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomePage 
{
	
	private WebDriver driver;
	
	@FindBy (xpath="//div [@class='vddl-draggable instrument down index0']")
	 private WebElement stockList;
	
	public PomHomePage(WebDriver driver)
	{   
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 public void selectStock()
	 {
		Actions act = new Actions(driver);
		act.moveToElement(stockList).perform();;
	 }

}
 