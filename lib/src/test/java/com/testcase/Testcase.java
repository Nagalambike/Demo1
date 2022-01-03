package com.testcase;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Iterator;

	import javax.swing.Scrollable;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.emulation.model.UserAgentBrandVersion;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Testpage;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Testcase extends Testbase{
		Testpage lp;
		
		@BeforeSuite
		public void setup()
		{
			initialisation();
			 lp = new Testpage(); 
		}
		@Test(priority = 1)
		public void Titletestcase()
		{
			lp.Electronictest();
			String expectedtitle = driver.getTitle();
			System.out.println(expectedtitle);
			String actaultitle=sheet.getRow(4).getCell(3).getStringCellValue();
			Assert.assertEquals(actaultitle, expectedtitle);
		}
		@Test(priority = 2)
		public void specificationtest()
		{
			String brname = lp.producttest();
			String actualprod = sheet.getRow(9).getCell(3).getStringCellValue();
			Assert.assertEquals(actualprod, brname);
		}
	
	////third tc/////////////////
@Test(priority = 3)
void linkoftab()
{
	double linksoftv=lp.links();
	double expectlink = linksoftv;
	double actuallinks = sheet.getRow(12).getCell(3).getNumericCellValue();
	
   Assert.assertEquals(expectlink, actuallinks);
}
//4th testcase/////////////
@Test(priority = 4)
void camera()
{
	String prodres = lp.camproducts();
	String expectcount=prodres;
	String actualcount=sheet.getRow(16).getCell(3).getStringCellValue();
	Assert.assertEquals(expectcount, actualcount);
	
}
////5th testcase/////////////
//select musical instruments and click on guitar and select one product add to cat and check item in cart
@Test(priority = 5)
public void musicalinstruments()
{
	String guit = lp.guitar();
	 String actualsize = guit;
	String expectedsize = sheet.getRow(22).getCell(3).getStringCellValue();
	Assert.assertEquals(expectedsize, actualsize);
			
}
//6th tc
@Test(priority = 6)
public void testvalidation()
{
String textcheck = lp.texttest();
String expecttext=sheet.getRow(26).getCell(3).getStringCellValue();
Assert.assertEquals(textcheck, expecttext);
//String pricecheck = lp.Priceitem();
//double expectprice1=sheet.getRow(25).getCell(3).getNumericCellValue();
//System.out.println(expectprice1);
//String expectprice2 = Double.toString(expectprice1);
//Assert.assertEquals(pricecheck, expectprice2);

}










}