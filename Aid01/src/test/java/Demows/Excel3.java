package Demows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Excel3 {
	

	
	
	
  @Test
  public static void TestloginMethod(String uid,String pwd ) throws InterruptedException {	
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("http://10.188.144.28:8083/TestMeApp");
	  Thread.sleep(4000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys(uid);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("Login")).click();
	  WebElement obj1 = driver.findElement(By.linkText("SignOut"));
	  Assert.assertFalse(obj1==null);
	
	  Thread.sleep(2000);
	  driver.close();
	  	 	  
	   
  }
}
