package Selenium_Level1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opentab {

	public static void main(String[] args) {
		
		 //Exercise #6
		  String browsertype="chrome";
		  WebDriver driver;
		  
		  //Define webdriver
		  driver=Utilities.DriverFactory.open(browsertype);
		  //Open the browser
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("opentab")).click();
		 ArrayList<String> windows1 = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(windows1.get(1));
	}
}
