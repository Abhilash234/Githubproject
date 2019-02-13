package TEST10;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	WebDriver driver;
	
  @Test
  public void f() {
  System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
 driver = new FirefoxDriver();
 driver.get("http://newtours.demoaut.com/");  
  driver.close();
  }
    
}

