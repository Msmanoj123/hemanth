package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class demoqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver123.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofMinutes(3));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]")))).click();
}
}
