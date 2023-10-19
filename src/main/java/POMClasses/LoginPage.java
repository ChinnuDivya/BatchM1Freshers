package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver driver;
	
	// Initialing of all the Web Elements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Declaration of Web Elements
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	//getter Method
	public WebElement getemailTextField()
	{
		return emailTextField;
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


