package Demows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rbuplod {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("http://uitestpractice.com/Students/Widgets");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("image_file")).click();
	  Thread.sleep(2000);
	  Robot robot = new Robot();
	  
	  robot.setAutoDelay(2000);
	  
	  StringSelection ssel = new StringSelection("C:\\Users\\TRAINING_H1B.06.15\\Desktop\\image.jpg");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel,null);
	  
	  robot.setAutoDelay(2000);
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.setAutoDelay(2000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.setAutoDelay(2000);
	  
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
	 
  
  
  
  
  
  }
  
  
  
}
