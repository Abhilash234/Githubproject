package TEST10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebooklogin {
	WebDriver driver;
	
  @Test

  public void f() throws InterruptedException {      
  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
 driver = new ChromeDriver();   
 driver.get("https://www.facebook.com"); 
 Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
 driver.findElement(By.name("firstname")).sendKeys("Ram");
 driver.findElement(By.id("u_0_l")).sendKeys("Krisna");
 
 WebElement obj1 = driver.findElement(By.name("reg_email__"));
 obj1.sendKeys("5698745698");
 driver.findElement(By.name("reg_passwd__")).sendKeys("5987456");
 Select day = new Select(driver.findElement(By.name("birthday_day")));
 day.selectByVisibleText("9");
 Select month= new Select(driver.findElement(By.name("birthday_month")));
 month.selectByValue("2");
 Select year = new Select(driver.findElement(By.name("birthday_year")));
 year.selectByValue("2019");
 driver.manage().window().maximize();
  driver.findElement(By.xpath("//*[text()='Create a Page']")).click();
  Thread.sleep(3000);
//  
// 
// driver.findElement(By.id("u_0_11")).click();
// Thread.sleep(3000);
//  
  driver.findElement(By.xpath("//*[text()='Male']")).click();
 Thread.sleep(9000);
 
  driver.close();
  }    
  
 
  }

