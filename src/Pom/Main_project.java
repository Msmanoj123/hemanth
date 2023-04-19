package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Main_project {

	@Test(priority=1,dataProvider="signup")
	public void mb (String str1,String str2,String str3,String str4,String str5,String str6) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedrivernew.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		Signup s1=new Signup(driver);
		
     	s1.signinbutton();
		s1.signupbutton();
		s1.fname(str1.toUpperCase());
		s1.lname(str2.toUpperCase());
		s1.email(str3);
		s1.password(str4);
		s1.date();
		s1.radio();
		s1.phone(str5);
		s1.bio(str6);
		s1.register();
		driver.quit();
	}
	@DataProvider
	public Object signup()
	{
		return new Object[][] {{"tester1","12","tester1@gmail.com","tester1@123","1243567890","i am tester1"},
			{"tester2","13","tester2@gmail.com","tester2@123","1243567890","i am tester2"}};
		}
	
	@Test(priority=2,dataProvider="Signin",enabled=false)
	public void mb1(String str1,String str2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		 Signin s2=new Signin(driver);
		 s2.signinbutton();
		   s2.uname(str1);
		   s2.password(str2);
		   s2.chbox();
		   s2.login();
		   driver.quit();
	}
	@DataProvider
	public Object Signin()
	{
		return new Object[][] {{"tester","tester@123"},{"tester2","tester2@123"}};
	}


	@Test(priority=3,dataProvider="getAllmobiles",enabled=false)
	public void allmobiles(String str1) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		All_Mobiles os=new All_Mobiles(driver);
		os.allmobiles();
		os.textfield(str1);	
		driver.quit();
	}
	@DataProvider
	public Object getAllmobiles()
	{
		return new Object[][] {{"samsung"},{"apple"}};
	}

	
	@Test(priority=4,dataProvider="getSupport",enabled=false)
	public void support(String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		Order order=new Order(driver);
		order.support();
		order.firstname(str1.toUpperCase());
		order.lastname(str2.toUpperCase());
		order.email(str3);
		order.password(str4);
		order.male();
		order.phnumber(str5);
		order.adrees1(str6);
		order.adrees2(str7);
		order.inputcity(str8);
		order.inputstate();
		order.inputzip(str9);
		order.checkbox();
		order.no_of_mob(str10);
		order.bought();
		order.correct();
		order.order();
		order.text();
		order.close1();
		driver.quit();
	}
	@DataProvider
	public Object getSupport(){
		return new Object [][] {{"tester","ms","test@gmail.com","test@123","1234567891","bengaluru","bengaluru","benagaluru","57121","2"},
			                 {"tester1","ms","test1@gmail.com","test1@123","8747078588","malavalli","malavalli","mandya","571430","1"}};
				                 
		}

		
	
	@Test(priority=5,dataProvider="getContactUs",enabled=false)
	public void contact_us(String str1,String str2,String str3,String str4) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedrivernew.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		Contact_us contact=new Contact_us(driver);
		contact.support();
		contact.contact_us();
		contact.username(str1);
		contact.email(str2);
		contact.phone(str3);
		contact.message(str4);	
		contact.submit();
		driver.quit();
	}
	@AfterMethod
	@DataProvider
	public Object getContactUs()
	{
		return new Object[][] {{"tester1","tester1@gmail.com","876543567","hi guyss"},
		{"tester2","tester2@gmail.com","871345543567","hello guyss"}};
		
	}
}
	
	