package SmokeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
public class PageTitleJunit {
	//Declare variables and objects at CLASS level in order to access in multiple methods through Program
	WebDriver driver;
	String webURL="https://login.wordpress.org/?redirect_to=https%3A%2F%2Fwordpress.org%2F&locale=en_US";
	@Test
		public void PageTitleTest()
	{ System.out.println("Running the test");
		driver.get(webURL);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "WordPress.org Login | WordPress.org English";
		//Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.fail("We failed this test");
		}
	@Before
	public void setup()
	{
		System.out.println("Setting up the driver");
	 	System.out.println("Initializing the driver");
	 	  driver=Utilities.DriverFactory.open("Chrome");}
@After
	public void teardown()
	{
		System.out.println("Closing  the test");
		driver.close();
		System.out.println("Closing the driver");
	}}
