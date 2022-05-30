package Qualitest_Thiri.Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	public static void main(String[] args) {
		
		String email="thiripura";
		String pwd ="krish@12345";
		String browsertype="chrome";
		//Define webdriver
		WebDriver driver ;
		driver=Utilities.DriverFactory.open(browsertype);	
		
				
			//2.Navigate to the web application
			driver.get("https://login.wordpress.org/?redirect_to=https%3A%2F%2Fwordpress.org%2F&locale=en_US");
			
			//Define web elements
			WebElement emailElement =driver.findElement(By.name("log"));
			WebElement pwdelement = driver.findElement(By.name("pwd"));
			
			//Enter form details 	
			emailElement.sendKeys(email);
			pwdelement.sendKeys(pwd);
			
			
				//5.Click login
				driver.findElement(By.name("wp-submit")).click();
				//6.Get confirmation 
				String pagetitle = driver.getTitle();
				//if(pagetitle== "wordpress.org")
				{System.out.println("Page title is " + pagetitle);	
				}
				
				String expected="Blog Tool, Publishing Platform, and CMS | WordPress.org";
						if(pagetitle.equals(expected)) {
							System.out.println("Confirmation " + pagetitle);
													}
						else {
							System.out.println("Test Failed");
						}
				//close the browser
				driver.close();					} }
