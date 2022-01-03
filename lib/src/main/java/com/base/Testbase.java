package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public static XSSFSheet sheet;
	
	public  Testbase() 
	{
		prop=new Properties();;
		FileInputStream fis;
		XSSFWorkbook workbook;
		try {
			
			fis=new FileInputStream("C:\\Users\\nagalambikeb\\Documents\\gradledata1.xlsx");
			 workbook=new XSSFWorkbook(fis);
			  sheet = workbook.getSheetAt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public static void initialisation()
	{
		String browser = sheet.getRow(0).getCell(1).getStringCellValue();
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(sheet.getRow(2).getCell(3).getStringCellValue());
		
	}
	}

