package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Uicalender {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
	   WebDriver driver = new EdgeDriver();
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
