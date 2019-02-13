package TEST10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.get("http://demo.guru99.com/"); 
	  driver.findElement(By.name("emailid")).sendKeys("abc@email.com");
	  driver.findElement(By.name("btnLogin")).click();
	  Alert a1=driver.switchTo().alert();
	  a1.accept();
	  //a1.dismiss();
	  
	  Thread.sleep(2000);
  
  
  
  
  }
  
}
