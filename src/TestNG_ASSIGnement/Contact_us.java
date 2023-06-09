package TestNG_ASSIGnement;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact_us {
	@Test
	public void contact() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("manoj");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("manoj@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9663824163");
		driver.findElement(By.name("message")).sendKeys("hello world");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
}
}