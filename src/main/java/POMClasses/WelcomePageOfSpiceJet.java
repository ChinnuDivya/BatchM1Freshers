package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageOfSpiceJet 
{
	public WebDriver driver;
	
	//Initialing of all the Web Elements
		public WelcomePageOfSpiceJet(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Declaration of Web Elements
		
		@FindBy(xpath="//div[text()='Login']")
		private WebElement LoginButton;
		
		//getter Method
		
		public WebElement LoginButton()
		{
			return LoginButton;
		}
	}

