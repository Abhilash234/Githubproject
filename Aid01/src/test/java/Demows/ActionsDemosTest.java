package Demows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemosTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("SignIn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(7000);
	  
	  Actions act = new Actions(driver);
	  Thread.sleep(6000);
	  WebElement obj1=driver.findElement(By.xpath("//*[text()='Head Phone']\""));
	  WebElement obj2=driver.findElement(By.xpath(" //span[@onclick=\"getSubCategoryList('11290')\"]"));
	  WebElement obj3=driver.findElement(By.xpath("//*[text()='Head Phone']"));
act.moveToElement(obj1).moveToElement(obj2).click().build().perform();
act.moveToElement(obj3).click().perform();
Thread.sleep(3000);
	  
	  driver.close();
	  
	 
	  
	  
  }
}
