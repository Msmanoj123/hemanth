package selenium;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Etsy {
  public static void main(String[] args) throws IOException {
	  System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
	   WebDriver driver = new EdgeDriver();
	   driver.get("https://www.ebay.com/");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	   Actions a=new Actions(driver);
	   //driver.navigate().refresh();
	   //
	   //
	   //driver.navigate().back();
	   //
	   //
	   WebElement stdrop = driver.findElement(By.xpath("//select[@id='gh-cat']"));
	   Select drop=new Select(stdrop);
	   drop.selectByValue("11450");
	   driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("lenovo");
	   driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	   driver.navigate().back();
	   driver.findElement(By.xpath("//h3[normalize-space()='Shoes']")).click();
	   driver.findElement(By.xpath("//div[.=\"Men's Boots\"]")).click();
	   driver.findElement(By.xpath("//p[.='Timberland']")).click();
	   driver.findElement(By.xpath("//p[normalize-space()='Black']")).click();
	   driver.findElement(By.xpath("(//button[@id='s0-28-9-0-1[0]-0-1[0]-0-12-next'])[1]")).click();
	   driver.findElement(By.xpath("//p[normalize-space()='10']")).click();
	   driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Blue']")).click();
	   driver.findElement(By.xpath("//h3[normalize-space()='Mens Timberland Edge World Hiker TB0A2KM8CY3']")).click();
	   java.util.Set<String> window = driver.getWindowHandles();
	   Iterator<String> it = window.iterator();
	   String pId = it.next();
	   String cId = it.next();
	   driver.switchTo().window(cId);
	   //driver.switchTo().window(pId);
	   driver.findElement(By.xpath("//a[@id='isCartBtn_btn']")).click();
	   driver.findElement(By.xpath("//button[normalize-space()='Go to checkout']")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='gxo-btn']"))).click();
	   WebElement stdrop1 = driver.findElement(By.xpath("//select[@id='country']"));
	    Select drop1=new Select(stdrop1);
	   drop1.selectByValue("IN");
	   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("tester");
	   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xy");
	   driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("banglore");
	   driver.findElement(By.xpath("//input[@id='addressLine2']")).sendKeys("rajajinagar");
	   driver.findElement(By.xpath("//input[@id='city']")).sendKeys("banglore");
	   WebElement stdrop2 = driver.findElement(By.xpath("//select[@id='stateOrProvince']"));
	    Select drop2=new Select(stdrop2);
	   drop2.selectByIndex(15);

	   //driver.findElement(By.xpath("")).sendKeys("place4");
	   driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("345678");
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tester@mail.com");
	   driver.findElement(By.xpath("//input[@id='emailConfirm']")).sendKeys("tester@mail.com");
	   //driver.findElement(By.xpath("//span[@class='expand-btn__text']")).sendKeys("91");
	   driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("1324567889");
	   //JavascriptExecutor jse=(JavascriptExecutor) driver;
	   //jse.executeScript("window.scrollBy(0,20)");
	   TakesScreenshot tg=(TakesScreenshot) (driver.findElement(By.xpath("//body")));
	   File src = tg.getScreenshotAs(OutputType.FILE);
	   File trg=new File("./ss/shoe.png");
	   FileUtils.copyFile(src, trg);
	   driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
	 //select[@id='stateOrProvince']
	   //	   driver.navigate().refresh();
	   //driver.navigate().to("https://www.ebay.com/sch/11700/i.html?_from=R40&_nkw=fan&LH_TitleDesc=0&_oac=1");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");  
//		 
//		 
//			Actions a=new Actions(driver);
//		   a.click(driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"))).build().perform();
//		   assertEquals("https://www.saucedemo.com/",driver.getCurrentUrl());
//		    driver.close();
}
}
