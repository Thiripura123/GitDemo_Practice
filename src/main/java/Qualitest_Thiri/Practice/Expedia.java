package Qualitest_Thiri.Practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Expedia {

	WebDriver driver;
	String browsertype="Chrome";
	String Goingto ="Bengaluru";
	String checkin="25 May";
	
			
		@Test
		public void hotelReservation()
		{
			//driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div[2]/div[1]/button")).clear();
		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div[2]/div[1]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).sendKeys(checkin);
		} 
  @Before

	public void setup()
	{
		driver =Utilities.DriverFactory.open(browsertype);
		driver.get("https://www.expedia.com/Hotels");
	}


/*@After

	public void teardown()
	{
		driver.close();
			}*/
	}


