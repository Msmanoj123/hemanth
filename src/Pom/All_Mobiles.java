package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Mobiles {
	WebDriver driver;
	
	@FindBy(xpath="//a[.='All Mobiles']")
	WebElement allmobiles;
	@FindBy(xpath="//input[@id='myInput']")
	WebElement textfield;
	@FindBy(xpath="//a[@class='btn btn-primary  waves-effect waves-light' and .='Order']")
	WebElement order;
	 All_Mobiles(WebDriver driver2) {
		 driver=driver2;
		 PageFactory.initElements(driver2,this);	
	}
   public void allmobiles() throws InterruptedException
   {
	   allmobiles.click();
	   //Thread.sleep(2000);
   }
   public void textfield(String tname) throws InterruptedException
   {
	   textfield.sendKeys(tname);
	   //Thread.sleep(2000);
   }
   public void order() throws InterruptedException
   {
	   order.click();
	   //Thread.sleep(2000);
   }  
}
