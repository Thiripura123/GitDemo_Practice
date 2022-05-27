package Selenium_Level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		
		 //Exercise #9 -Mouse Hover Example
		  String browsertype="chrome";
		  WebDriver driver;
				  
		  //Define webdriver
		  driver=Utilities.DriverFactory.open(browsertype);
		  //Open the browser
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  Actions action = new Actions(driver);
		  WebElement mousehover = driver.findElement(By.id("mousehover"));
		  action.moveToElement(mousehover).build().perform();
		  
		 //Move to top of the page
		  WebElement top =driver.findElement(By.linkText("Top"));
		  action.moveToElement(top);
		  action.click().build().perform(); 
		  
		  //Reload the page 
		  WebElement reload =driver.findElement(By.linkText("Reload"));
		  action.moveToElement(reload);
		  action.click().build().perform();
			  
		}

}
