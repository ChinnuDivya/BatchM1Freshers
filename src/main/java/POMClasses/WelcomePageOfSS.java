package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class WelcomePageOfSS 
{
	public WebDriver driver;
	

	//Initialing of all the Web Elements
	public WelcomePageOfSS(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration of Web Elements
	
	@FindBy(id="loginBtn")
	private WebElement MainloginButton;
	
	//getter Method
	
	public WebElement getMainloginButton()
	{
		return MainloginButton;
	}
}
