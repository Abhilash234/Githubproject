package Demows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rb {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("email")).sendKeys("ab");
	  driver.findElement(By.name("pass")).sendKeys("123");
	  Robot rb = new Robot();
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  
	  
  }
}
