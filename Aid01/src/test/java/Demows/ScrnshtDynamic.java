package Demows;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrnshtDynamic {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/Students/Actions");
	  Thread.sleep(2000);
	  
  }
}
