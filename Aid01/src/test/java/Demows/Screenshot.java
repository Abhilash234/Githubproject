package Demows;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	
	
WebDriver driver;
 @Test
  public void ScreenshotReusable( ) throws InterruptedException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
	  driver = new ChromeDriver();   
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  
//	  TakesScreenshot tst =(TakesScreenshot)driver;
//	  File fls=tst.getScreenshotAs(OutputType.FILE);
//	  FileHandler.copy(fls,new File("C:\\Users\\TRAINING_H1B.06.15\\eclipse-workspace\\Aid01\\src\\test\\java\\Demows\\Screenshot.java"));
//	 
	  
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File fls=ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(fls, new File("./Screenshots/Test1.png"));
	  System.out.println("SCREENSHOTTAKEN");
  }
  
//  public static String timeStamp()
//  {
//	  return new SimpleDateFormat("yyyy+mm+dd").format(new Date(0));
//  }


	  
	  
  }	