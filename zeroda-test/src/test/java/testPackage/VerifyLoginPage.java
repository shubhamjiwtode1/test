package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMClasses.PomHomePage;
import POMClasses.PomLoginPage;
import basePackage.BaseClass;

public class VerifyLoginPage extends BaseClass 
{
	
	private WebDriver driver;
	private PomLoginPage login;
	private PomHomePage homePage;
	
	@BeforeTest
	@Parameters("browser")
	public void crossBrowser(String browser) 
	{
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openchromebrowser();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = openfirefoxbrowser();
		}
		
	}
	
	@BeforeClass
	public void beforeClass() 
	{	
		System.out.println("beforeClass");
		login = new PomLoginPage(driver);
		homePage = new PomHomePage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("beforeMethod");
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.sendUserName();
		login.sendPassword();
		login.clickloginbutton();
		login.PIN();
		login.clickcontinuebutton();	
	}
	
	
	@Test
	public void toVerifyLoginPage() 
	{
		homePage.selectStock();
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("afterClass");
		driver.quit();	
	}

}