package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
     Signin(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2,this);
     }
		  @FindBy(xpath="//input[@id='username']")
		  WebElement username;

		    @FindBy(xpath="//button[.='SIGN IN']")
		    WebElement signinbutton1;
		    @FindBy(xpath="//input[@id='password']")
			  WebElement password;
		    @FindBy(xpath="//label[@for='remember-me']")
			  WebElement checkbox;
		    @FindBy(xpath="//a[.='Log In']")
			  WebElement login;
		  void uname(String uname) throws InterruptedException
		  {
			  username.sendKeys(uname);
			
		  }
		  public void signinbutton() throws InterruptedException
			{
			  signinbutton1.click();
			
			}
		  void password(String pwd) throws InterruptedException
		  {
			  password.sendKeys(pwd);
			  
		  }
		  void chbox() throws InterruptedException
		  {
			  checkbox.click();
			 
			  
		  }
		  void login() throws InterruptedException
		  {
			  login.click();
			 
		  }
}
