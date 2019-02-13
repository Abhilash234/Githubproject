package Demows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dpfil {
	
	 FileInputStream fls;
	  XSSFWorkbook wb;
	  XSSFSheet sh;
	  
  @Test
  public void f() throws IOException, InterruptedException {
	  
	 
	  
	  
	  File src = new File("C:\\Users\\TRAINING_H1B.06.15\\Desktop\\Customer1.xlsx");
		
	  fls = new FileInputStream(src);
	   wb = new XSSFWorkbook(fls);
	  
	  XSSFSheet Sh1 = wb.getSheetAt(0);
	  
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
    @DataProvider(name="Sampledata")
 
  public Object[][] TestData() throws IOException{
	  File src = new File("C:\\Users\\TRAINING_H1B.06.15\\Desktop\\Customer1.xlsx");
	  fls=new FileInputStream(src);
	  wb= new XSSFWorkbook(fls);
	  sh1=
	  
	  
	  int rows = wb.getSheetAt(0).getLastRowNum();
	  
	  int totalcnt = rows+1;
	  Object[][] data=new Object[totalcnt][2];
	  
	  for(int i=0;i<totalcnt;i++)
	  {
		  data[i][0]=sh.getRow(i).getCell(0).getStringCellValue();
		  data[i][0]=sh.getRow(i).getCell(0).getStringCellValue();
	  }
	  return data;
	   
  
  }
	  
  }

