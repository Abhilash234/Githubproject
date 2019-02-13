package TEST10;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions1 {
	
	WebDriver driver;

  @Test
  	  public void f1(){
		  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
		  driver = new ChromeDriver();   
		  driver.manage().window().maximize();
		  
		  driver.get("http://10.188.144.28:8083/TestMeApp/fetchcat.htm");
		  WebElement allact = driver.findElement(By.xpath("//body/header[@id='header']/div[@class='header-middle']/div[@class='container']/div[@class='row']/ul[@id='menu3']/li[3]/a[1]"));
		  WebElement Ellect = driver.findElement(By.xpath("//span[contains(text(),'Our Offices')]"));
		  WebElement obj3 = driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
Actions sat = new Actions(driver);
		 sat.moveToElement(allact).moveToElement(Ellect).click();
		 
	  
  }
}
