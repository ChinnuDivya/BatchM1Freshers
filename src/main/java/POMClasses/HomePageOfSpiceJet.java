package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOfSpiceJet 
{
public WebDriver driver;
	
	// Initialing of all the Web Elements
		public HomePageOfSpiceJet(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Declaration of Web Elements
		@FindBy(xpath="//div[text()='Hi Divya']")
		private WebElement ProfileButton;
		
		@FindBy(xpath="//div[text()='Log Out']")
		private WebElement LogoutButton;
		
		@FindBy(xpath="//div[text()='Hotels']")
		private WebElement HotelButton;
			
		//getter Method
		public WebElement getProfileButton()
		{
			return ProfileButton;
		}
		public WebElement getLogoutButton()
		{
			return LogoutButton;
		}
		public WebElement getHotelButton()
		{
			return HotelButton;
		}

	}

