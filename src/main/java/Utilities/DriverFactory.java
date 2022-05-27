package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver open(String browsertype) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiripura.sundari\\Selenium\\chromedriver.exe");
		 return new ChromeDriver(); 
	} 
	/*public WebDriver driver;
	public WebDriver WebDrivermanager() throws FileNotFoundException
	
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\Resources\\global.properties");
		Properties pro= new Properties();
		pro.load(fis);
		String Url=pro.getProperty("QAURL");
		if (driver==null)
			
		{
			if(pro.getProperty("browser"))=="chrome"
					
				{
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiripura.sundari\\Selenium\\chromedriver.exe");
						driver =new ChromeDriver();
						driver.get(Url);
				}
		}
		
		return driver;		
	}*/

}
