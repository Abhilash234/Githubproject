package Demows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UPtoLp {
	WebDriver driver;
	
 
	@Test
  public void f() throws InterruptedException {
	  
		 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
		  driver = new ChromeDriver();   
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  
	      Actions act = new Actions(driver);
	   WebElement obj1= driver.findElement(By.name("q"));
	   driver.findElement(By.name("q")).sendKeys("abc");
	      act.keyDown(Keys.CONTROL).click(obj1).keyUp(Keys.CONTROL).build().perform();
		 
		 
		  Thread.sleep(3000);
		 }
		  
		  
		  
		  
		  
		  
		  
  }

