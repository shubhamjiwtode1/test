package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver openchromebrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe\\");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");		
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");		
		WebDriver driver1 = new ChromeDriver(opt);
		driver1.manage().window().maximize();
		return driver1;
	}
	
	public WebDriver openfirefoxbrowser() {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");			
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		
		return driver2;
	}

}
