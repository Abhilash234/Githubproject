package TEST10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browserlaunch {
	WebDriver driver;
	
  @Test

  public void f() {      
  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
 driver = new ChromeDriver();   
 driver.get("http://newtours.demoaut.com/");   
  driver.close();
  }    
  
  
  }


