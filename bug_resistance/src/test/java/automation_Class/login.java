package automation_Class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
	    
		String actualTitle ="Swag Labs";
		String expectedTitle =driver.getTitle();

		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
	
		Assert.assertEquals(actualTitle,expectedTitle, "conditions true");
		
		String actualUrl="https://www.saucedemo.com/";
		String expectedUrl=driver.getCurrentUrl();
	
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("URL Matched");
			}
			else {
				System.out.println("URL not matched");
			}
	
		
		Assert.assertEquals(actualUrl, expectedUrl,"conditions true");
		
	}

}
