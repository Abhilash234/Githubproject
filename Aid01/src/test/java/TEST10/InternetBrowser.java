package TEST10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetBrowser {
	WebDriver driver;
	
  @Test
  public void f() {
  System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe\\");
 driver = new InternetExplorerDriver();
 driver.get("http://newtours.demoaut.com/");
  driver.close();
  }
  
}
