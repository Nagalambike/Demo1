package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.Testbase;

public class Testpage  extends Testbase
{
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_electronics']")
	WebElement electronics ;
	
	public Testpage()//initialisation
	{
		PageFactory.initElements(driver, this);
	}
	public void Electronictest()
	{
		electronics.click();
		
	}
@FindBy(xpath="//img[@alt='Shop now']")
WebElement img;
@FindBy(xpath="//a[@class='style__overlay__2qYgu ProductGridItem__overlay__1ncmn']/self::a")
WebElement product;

@FindBy(xpath="(//span[@class='a-size-base'])[16]")
WebElement brand;
public  String producttest()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)");
	img.click();
	product.click();
	String bname=brand.getText();
	return bname;
}
//3rd tc
@FindBy(tagName="a")
List<WebElement> link;
public double  links()
{
     for (WebElement webElement : link) {
         //System.out.println(webElement);
         
     }    System.out.println(link.size());
    double l=link.size();
     return l;
	
	

}
//4th tc/
@FindBy(xpath="(//span[@class='nav-a-content'])[6]")
WebElement camprod;
@FindBy(xpath="//a[@id='100 8ad55777-announce']")
WebElement viewdeal;
@FindBy(xpath="//div[@class='a-cardui-body _octopus-search-result-card_style_apbBrowseSearchResultsRibText__3NqJw']")
WebElement  result;
public String camproducts()
{
	camprod.click();
	viewdeal.click();
	String res = result.getText();
	return res;
}
	@FindBy(xpath="(//span[@class='nav-a-content'])[9]")
	WebElement instrument;
	@FindBy(xpath="(//img[@alt='a'])[1]")
	WebElement music;
	@FindBy(xpath="(//img[@class='s-image'])[2]")
	WebElement guitars;
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement addtocart;
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	WebElement cart;
	@FindBy(xpath="//img[@class='sc-product-image']")
	WebElement cartsize;
	
	public String guitar() {
		
		instrument.click();
		music.click();
		guitars.click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		addtocart.click();
		cart.click();
		 String size = cartsize.getTagName();
		 System.out.println(size);
		return size;
		
	}
	//6th 
	@FindBy(xpath="//span[@class='a-truncate-cut']")
	WebElement check;
@FindBy(xpath="(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold'])[1]")
WebElement  price;
	public String texttest()
	{
		 System.out.println("text is"+check.getText());
		 return check.getText();
		 
	}
//	public String Priceitem()
//	{
//		String priceitem = price.getText();
//		
//		return priceitem;
//			
//		
//	
//	}
	
}
