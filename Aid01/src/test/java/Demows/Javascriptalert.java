package Demows;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptalert {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumhq.org/");
  JavascriptExecutor js =(JavascriptExecutor)driver;
//  js.executeScript("alert('Welcome to java script')");
  Thread.sleep(2000);
  
	  String DomainName = js.executeScript("return document.domain;").toString();
	  System.out.println("Domain name of the site="+DomainName);
	  
	  Thread.sleep(2000);
  
	  String url = js.executeScript("return document.URL;").toString();
	  System.out.println("URL of the site ="+url);
	  Thread.sleep(2000);
	  
	  String TitleName =js.executeScript("return document.title;").toString();
	  System.out.println("Title fo the page="+TitleName);
	  
	  Thread.sleep(3000);
  
	  js.executeScript("window.location= 'https://www.google.com/'");
	  Thread.sleep(2000);
	 
	  driver.quit();
	  
	
  
 
  
  
  
  
  
  
  
  }
}
