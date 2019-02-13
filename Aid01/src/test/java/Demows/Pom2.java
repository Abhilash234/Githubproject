package Demows;

import java.lang.reflect.Method;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pom2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	 
	  driver.get("http://uitestpractice.com/");
	  Thread.sleep(2000);
	  Pom1 loginobj = new Pom1(driver);
	  
	  loginobj.typeusername("admin");
	  loginobj.typepassword("password1234");
	  loginobj.clicksign();
	  Thread.sleep(2000);
	  
	  
	  
  }
}
