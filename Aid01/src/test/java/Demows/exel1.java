package Demows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exel1 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, IOException {
//	  
//	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
//	  driver = new ChromeDriver();   
//	  driver.manage().window().maximize();
//	  driver.get("http://uitestpractice.com/Students/Widgets");
//	  Thread.sleep(2000);
//	  driver.manage().window().maximize(); 
	  File src = new File("C:\\Users\\TRAINING_H1B.06.15\\Desktop\\Customer1.xlsx");
	
	  FileInputStream fls = new FileInputStream(src);
	  XSSFWorkbook wb1 = new XSSFWorkbook(fls);
	  
	  XSSFSheet Sheet1 = wb1.getSheetAt(0);
	  String data00= Sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println(data00);
	  String data01= Sheet1.getRow(0).getCell(2).getStringCellValue();
	  System.out.println(data01);
	  wb1.close();
	  
	  
	  
	  
	  
	 
	  
  }
}
