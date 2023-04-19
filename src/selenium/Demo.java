package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver123.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("tester".toUpperCase());
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("TESTER202@GMAIL.COM".toLowerCase());
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("manayata emabassy, h2 building secondfloor");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("banglore,vijayanagara");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	driver.close();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
//	driver.findElement(By.xpath(""));
//	Thread.sleep(1000);
}
}
//driver.findElement(By.xpath(""));
//Thread.sleep(1000);