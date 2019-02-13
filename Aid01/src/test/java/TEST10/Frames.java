package TEST10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.get("https://www.toolsqa.com/iframe-practice-page/"); 
	  Thread.sleep(5000);
	  driver.switchTo().frame("iframe1");
	  System.out.println(driver.getTitle());
	  Thread.sleep(3000);
	  System.out.println("innerframehom");
	  driver.findElement(By.linkText("Home")).click();
//	  Thread.sleep(3000);
	  
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	 System.out.println( driver.getTitle());
	  System.out.println("cameout");
	  Thread.sleep(5000);
	 	  	  driver.close();
  }
}
