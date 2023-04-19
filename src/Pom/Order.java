package Pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Order {
	WebDriver driver;
	@FindBy(xpath="//div[@id='navbarSupportedContent']/ul/li[4]")
	WebElement support;
	@FindBy(xpath="//a[.='Order']")
	WebElement orderdrop;
	@FindBy(id="inputFirstName")
	WebElement firstname;
	@FindBy(xpath="(//input[@id=\"inputFirstName\"])[2]")
	WebElement lastname;
	@FindBy(id="inputEmail")
	WebElement email;
	@FindBy(id="inputPassword")
	WebElement password;
	@FindBy(id="flexRadioDefault1")
	WebElement gender;
	@FindBy(xpath="//input[@min='0']")
	WebElement phnumb;
	@FindBy(xpath="//input[@id=' address1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='address2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='inputCity']")
	WebElement inputcity;
	@FindBy(xpath="//select[@id='inputState']")
	WebElement dropdown;
	@FindBy(xpath="//input[@id='inputZip']")
	WebElement inputzip;
	@FindBy(xpath="//input[@rel='apple']")
	WebElement apple;
	@FindBy(xpath="//input[@rel='samsung']")
	WebElement samsung;
	@FindBy(xpath="//option[.='Apple 12']")
	WebElement samsung12;
	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	WebElement number;
	@FindBy(xpath="//select[@id='bought']")
	WebElement bought;
	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	WebElement addresscorrect;
	@FindBy(xpath="(//input[@id='gridCheck1'])[2]")
	WebElement numbercorrect;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement orderbutton;
	@FindBy(xpath="//div[@class='modal-body']")
	WebElement text;
	@FindBy(xpath="//a[.='Close']")
	WebElement close;
	 Order(WebDriver driver2) {
		 driver=driver2;
		 PageFactory.initElements(driver2,this);
	}
	
	public void support() throws InterruptedException
	{
		support.click();
		 Thread.sleep(2000);
		orderdrop.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent_Id = it.next();
		String child_Id = it.next();
		driver.switchTo().window(child_Id);
		 Thread.sleep(1000);
	}
	public void firstname(String fname) throws InterruptedException
	{
		firstname.sendKeys(fname);
		 Thread.sleep(1000);
	}
	public void lastname(String lname) throws InterruptedException
	{
		lastname.sendKeys(lname);
		 Thread.sleep(1000);
	}
	public void email(String EMAIL) throws InterruptedException
	{
		email.sendKeys(EMAIL);
		 Thread.sleep(1000);
	}
	public void password(String pwd) throws InterruptedException
	{
		password.sendKeys(pwd);
		 Thread.sleep(2000);
	}
	public void male() throws InterruptedException
	{
		gender.click();
		System.out.println(gender.isSelected());
		 Thread.sleep(1000);
	}
	public void phnumber(String pnum) throws InterruptedException
	{
		phnumb.sendKeys(pnum);
		 Thread.sleep(2000);
	}
	public void adrees1(String add1) throws InterruptedException
	{
		address1.sendKeys(add1);
		 Thread.sleep(2000);
		
	}
	public void adrees2(String add2) throws InterruptedException
	{
		address2.sendKeys(add2);
		 Thread.sleep(2000);
	}
	public void inputcity(String city) throws InterruptedException
	{
		inputcity.sendKeys(city);
		 Thread.sleep(2000);
	}
	public void inputstate() throws InterruptedException
	{
		Select drop=new Select(dropdown);
		 Thread.sleep(2000);
		drop.selectByIndex(2);
		 Thread.sleep(2000);
	}
	public void inputzip(String zip) throws InterruptedException
	{
		inputzip.sendKeys(zip);
		 Thread.sleep(2000);
	}
	public void checkbox() throws InterruptedException
	{
		apple.click();
		 Thread.sleep(2000);
		System.out.println(apple.isSelected());
		samsung.click();
		 Thread.sleep(5000);
		System.out.println(samsung.isSelected());
		samsung12.click();
		 Thread.sleep(1000);
		System.out.println(samsung12.isSelected());
	}
	public void no_of_mob(String num) throws InterruptedException
	{
		number.sendKeys(num);
		 Thread.sleep(2000);
	}
	public void bought() throws InterruptedException
	{
		Select drop1=new Select(bought);
		 Thread.sleep(2000);
		drop1.selectByIndex(1);
	}
	public void correct() throws InterruptedException
	{
		addresscorrect.click();
		 Thread.sleep(2000);
		System.out.println(addresscorrect.isSelected());
		numbercorrect.click();
		 Thread.sleep(2000);
		System.out.println(numbercorrect.isSelected());
	}
	public void order() throws InterruptedException
	{
		orderbutton.click();
		 Thread.sleep(2000);
	}
	public void text() throws InterruptedException
	{
		System.out.println(text.getText());
		 Thread.sleep(2000);
	}
	public void close1() throws InterruptedException
	{
		close.click();
		 Thread.sleep(2000);
	}
	
}