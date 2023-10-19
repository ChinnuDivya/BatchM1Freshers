package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOfSpiceJet 
{
public WebDriver driver;
	
	// Initialing of all the Web Elements
	public LoginPageOfSpiceJet(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Declaration of Web Elements
	
	@FindBy(xpath="//input[@type='number' and @data-testid='user-mobileno-input-box']")
	private WebElement MobileNumber;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	private WebElement loginButton;
	
	//getter Method
	public  WebElement getMobileNumber()
	{
		return MobileNumber;
	}
	public WebElement getpasswordTextField()
	{
		return passwordTextField;
	}
	public WebElement getloginButton()
	{
		return loginButton;
	}

}


