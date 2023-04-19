package selenium;

//import java.time.Duration;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		   WebDriver driver = new EdgeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
		   driver.manage().window().maximize();
		   //WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
//		   driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("in");
//		   driver.findElement(By.xpath("//div[@id='ui-id-55']")).click();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		 //April 23
		   driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


		   while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		   {
		   driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		   }


		   //List<WebElement> dates= driver.findElements(By.className("day"));
		   //Grab common attribute//Put into list and iterate
		   int count=driver.findElements(By.className("day")).size();

		   for(int i=0;i<count;i++)
		   {
		   String text=driver.findElements(By.className("day")).get(i).getText();
		   if(text.equalsIgnoreCase("21"))
		   {
		   driver.findElements(By.className("day")).get(i).click();
		   break;
	}

		   }
	}
}

