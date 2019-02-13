package Demows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
  WebDriver driver;
	
	@Test
  public void f() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
		  driver = new ChromeDriver();   
		  driver.manage().window().maximize();
		  driver.get("http://uitestpractice.com/");
		  Thread.sleep(2000);
//		WebElement dclick = driver.findElement(By.name("dblClick"));
//		Actions act = new Actions(driver);
//		act.doubleClick(dclick).click().perform();
//		
//		driver.switchTo().alert().accept();
//		driver.quit();
//		
		  
		  WebElement drag=driver.findElement(By.id("draggable"));
		  WebElement drop=driver.findElement(By.id("droppable"));
		  
		  Actions act = new Actions(driver);
		  act.clickAndHold(drag).perform();
		  act.moveToElement(drop).build().perform();
		//  act.dragAndDrop(source, target);
		  Thread.sleep(10000);
		  driver.close();
	  
  }
}
