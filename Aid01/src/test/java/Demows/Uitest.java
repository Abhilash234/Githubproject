package Demows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Uitest {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/Students/Actions");
	  Thread.sleep(2000);
	  WebElement n1 = driver.findElement(By.name("one"));
	  WebElement n2 = driver.findElement(By.name("seven"));
	  WebElement n3 = driver.findElement(By.name("ten"));
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).click(n1).click(n2).click(n3).keyUp(Keys.CONTROL).build().perform();
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
