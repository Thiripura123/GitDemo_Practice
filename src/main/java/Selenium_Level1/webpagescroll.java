package Selenium_Level1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webpagescroll {
	public static void main(String[] args) {
		 //Exercise #8 -Table Example
		  String browsertype="chrome";
		  WebDriver driver;
		   
		  //Define webdriver
		  driver=Utilities.DriverFactory.open(browsertype);
		
		  //Open the browser
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  WebElement scroll = driver.findElement(By.xpath("//*[@id=\"product\"]"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;	
		 js.executeScript("arguments[0].scrollIntoView();",scroll);
	}
}
