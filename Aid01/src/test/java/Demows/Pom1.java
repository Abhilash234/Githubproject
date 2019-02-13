package Demows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pom1 {

	WebDriver driver;
	By username=By.id("use");
	By password =By.name("pass");
	By signin=By.name("gin");
	
  public  Pom1(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void typeusername(String uname)
  {	  
	driver.findElement(username).sendKeys(uname);  
  }
  public void typepassword(String pwd)
  {	  
	driver.findElement(password).sendKeys(pwd);  
  }
  
  public void clicksign()
  {	  
	driver.findElement(signin).click();
  }
  
  
 
  
}
