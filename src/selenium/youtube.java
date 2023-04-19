package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class youtube {

	public static void main(String[] args) throws IOException {
      ExtentReports report = new ExtentReports("./ss/exreport.html");
      ExtentTest test = report.startTest("extentreprtexample");
      report.flush();    
		System.setProperty("webdriver.chrome.driver","./softwares/chromedrivernew.exe");
		 WebDriver driver=new ChromeDriver();
       driver.get("https://www.path2usa.com/travel-companion/");
	   driver.manage().window().maximize();
	   //jan26
	   driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
	   System.out.println(driver.findElement(By.xpath("//span[@class='cur-month']")).getText());
	   while(!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("August"))
	   {
		   driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
    }
	   
	   
	   int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
	   for(int i=0;i<=count;i++)
	   {
		   String txt = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
		   if(txt.equals("25"))
		   {
			   driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
			   break;
		   }
	   }

}
}
