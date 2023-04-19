package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Travel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//input[@id='form-field-travel_from']")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//input[@id='form-field-travel_to']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		while(!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("June"))
		{
			driver.findElement(By.xpath("(//span[@class='flatpickr-next-month'])[1]")).click();
		}

		int count = driver.findElements(By.cssSelector(".flatpickr-day")).size();
		for(int i=0;i<=count;i++)
		{
			String txt = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
			if(txt.equals("25"))
			{
				driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
				break;
			}
		}
		WebElement weekdropdown = driver.findElement(By.xpath("//select[@id='form-field-travel_comp_date_between']"));
		Select drop=new Select(weekdropdown);
		Thread.sleep(2000);
		drop.selectByIndex(1);
		Thread.sleep(2000);
		WebElement airlinedropdown = driver.findElement(By.xpath("//select[@id='form-field-travel_comp_airline']"));
		Select airdrop=new Select(airlinedropdown);
		Thread.sleep(2000);
		airdrop.selectByIndex(2);
		Thread.sleep(2000);
		WebElement languagedropdown = driver.findElement(By.xpath("//select[@id='form-field-travel_comp_language']"));
		Select langdrop=new Select(languagedropdown);
		Thread.sleep(2000);
		langdrop.selectByIndex(7);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='elementor-button-text']")).click();
	}
}
