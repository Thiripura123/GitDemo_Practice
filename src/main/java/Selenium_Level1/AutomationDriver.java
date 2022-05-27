package Selenium_Level1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationDriver {

 public static void main(String[] args) {
  
  String browsertype="chrome";
  WebDriver driver;
  String suggestionclass="United States Minor Outlying Islands";
  boolean dropdownoption1 =true;
  boolean dropdownoption2 =false;
  boolean dropdownoption3 =false;
  boolean radiooption1=false;
  boolean radiooption2=true;
  boolean radiooption3=true;
  boolean ChkOption1 =false;
  boolean ChkOption2 =false;
  boolean chkOption3=false;
  String text ="Thiripura";
  String AlertConfirmation;
  boolean mouseh=true;
 
   
  //Define webdriver
  driver=Utilities.DriverFactory.open(browsertype);
  //Open the browser
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  
  //Define the webelement 
  
    WebElement Radio1 = driver.findElement(By.cssSelector("input[value='radio1'][name='radioButton']" ));
    WebElement Radio2 = driver.findElement(By.cssSelector("input[value='radio2'][name='radioButton']" ));
    WebElement Radio3 = driver.findElement(By.cssSelector("input[value='radio3'][name='radioButton']" ));
    WebElement Suggestion =driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
    WebElement CheckboxOpt1 =driver.findElement(By.id("checkBoxOption1"));
    WebElement CheckboxOpt2 =driver.findElement(By.id("checkBoxOption2"));
    WebElement CheckboxOpt3 =driver.findElement(By.id("checkBoxOption3"));
    WebElement DropOption =driver.findElement(By.id("dropdown-class-example"));
   // WebElement mousehoverTop = driver.findElement(By.linkText("Top"));
   // WebElement mousehoverreload = driver.findElement(By.linkText("Reload"));  
    
  //Exercise #1 -Radio Button Example
    
   if(radiooption1)
   {
    if(!Radio1.isSelected())
    {
     Radio1.click();  
     System.out.println("Radio Option1  is selected") ;
    }
    else 
    {
     Radio1.click();
    }
   }
   else if(radiooption2)
   {
    if(!Radio2.isSelected())
    {
     Radio2.click();  
     System.out.println("Radio Option2  is selected") ;
    }
    else 
    {
     Radio2.click();
    }
   }
  
   else if(radiooption3)
   {
    if(!Radio3.isSelected())
    {
     Radio3.click();  
     System.out.println("Radio Option3  is selected") ;
    }
    else 
    {
     Radio3.click();
    }
   }
  
    
 // Exercise #2 -  Suggestion Class Example
 
  Suggestion.sendKeys(suggestionclass);
  driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);

// Exercise #3 - Dropdown Example
  
  Select Options= new Select(DropOption);
  Options.selectByVisibleText("Option1");
  Options.selectByVisibleText("Option2");
  Options.selectByVisibleText("Option3");
  
  /*if(dropdownoption1)
  {
new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"))).selectByIndex(0);
System.out.println("Dropdown box Option1 is selected");
driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
  }
  else if(dropdownoption2)
  {
new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"))).selectByIndex(1);
System.out.println("Dropdown box Option2 is selected");  
driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
  }
  else if(dropdownoption3)
  {
new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"))).selectByIndex(2);
System.out.println("Dropdown box Option3 is selected");  
driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
  } */

//Exercise #4
 
 if (ChkOption1) 
 {
  if (!CheckboxOpt1.isSelected())
  {
  CheckboxOpt1.click(); 
  } 
  else
 {
    CheckboxOpt1.click(); 
  } 
 }
 
 else if (ChkOption2) 
 {
  if (!CheckboxOpt2.isSelected())
  {
  CheckboxOpt2.click(); 
  }  
 else
 {
  CheckboxOpt2.click(); 
  } 
 }
 
 else if(chkOption3) 
 {
  if (!CheckboxOpt3.isSelected())
  {
  CheckboxOpt3.click(); 
  } 
 else
 {
   CheckboxOpt3.click(); 
  } 
 }
 else
 {
  CheckboxOpt1.click(); 
  CheckboxOpt2.click();
  CheckboxOpt3.click();
  
 }
 
 //Exercise #5
  driver.findElement(By.id("openwindow")).click();
  ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
  driver.switchTo().window(windows.get(1));
  driver.switchTo().defaultContent();
  driver.close();
 
 /* //Exercise #6
 driver.findElement(By.id("opentab")).click();
 ArrayList<String> windows1 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(windows1.get(1)); 
    
    //Exercise #7
    
  driver.findElement(By.id("name")).sendKeys(text);
   driver.findElement(By.id("alertbtn")).click();
   Alert alert1 = driver.switchTo().alert();
   String Alertmessage1 = driver.switchTo().alert().getText();
  System.out.println("Alert message is " + Alertmessage1); 
  driver.switchTo().alert().dismiss();
  
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
 
 //Exercise #9

driver.findElement(By.id("mousehover")).click();
if(mouseh)
{
 if(mousehoverTop.isSelected())
 {
  Actions action2 = new Actions(driver);
  action2.moveToElement(mousehoverTop).click();
 }
}
else
{
 if(mousehoverreload.isSelected())
 {
  Actions action3 = new Actions(driver);
  action3.moveToElement(mousehoverreload).click();
 }
}
 
driver.close(); */
}

}
