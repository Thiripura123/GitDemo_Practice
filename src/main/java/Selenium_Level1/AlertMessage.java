package Selenium_Level1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertMessage {

	public static void main(String[] args) {
		//Exercise #7 - Switch To Alert Example
		  String browsertype="chrome";
		  WebDriver driver;
		  String text ="Thiripura";
		  
		  //Define webdriver
		  driver=Utilities.DriverFactory.open(browsertype);
		  //Open the browser
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  driver.findElement(By.id("name")).sendKeys(text);
		  driver.findElement(By.id("confirmbtn")).click();
		  Alert alert2 = driver.switchTo().alert();
		  String Alertmessage2 = driver.switchTo().alert().getText();
		 System.out.println("Alert message is " + Alertmessage2);
		//Accept the alert message
		 driver.switchTo().alert().accept();
		 System.out.println("Alert message is accepted" );
		 
		//Dismiss the Alert message
		 
		driver.switchTo().alert().dismiss(); 
	} }
