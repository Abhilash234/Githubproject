package Demows;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkjs {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/about/privacy/update");
	  
//	  ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=read]')[0].click()");
//	  ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=cricket]')[0].click()");
	  Thread.sleep(2000);
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,140)");
	  
	  Thread.sleep(3000);
	  driver.quit();
	  
  }
}
