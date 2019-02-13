package Demows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excel2 {
	
//	@BeforeTest
//	
//	public void f1() throws InterruptedException
//	{
//	
//	}
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  File src = new File("C:\\Users\\TRAINING_H1B.06.15\\Desktop\\Customer1.xlsx");
		
	  FileInputStream fls = new FileInputStream(src);
	  XSSFWorkbook wb1 = new XSSFWorkbook(fls);
	  
	  XSSFSheet Sh1 = wb1.getSheetAt(0);
	  
	  int rowcount = Sh1.getLastRowNum();
	  rowcount = rowcount+1;
	  
	  System.out.println("RowCount"+rowcount);
	  for(int i=0;i<rowcount;i++)
	  {
		  String uid = Sh1.getRow(i).getCell(0).getStringCellValue();
		  String pwd = (String)Sh1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(i+"Row-User id"+uid);
		  System.out.println(i+"Row-User id"+pwd);
		  
		  Excel3.TestloginMethod(uid, pwd);
				  
	  }
  }
//	  @AfterTest
//	  public void  after()
//	  {
//	 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe"); 
//     ChromeDriver driver = new ChromeDriver();   
//	
//	  driver.close();
//	  
//	  
//  }
}
