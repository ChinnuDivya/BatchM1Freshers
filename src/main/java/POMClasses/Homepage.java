package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	// Initialing of all the Web Elements
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Declaration of Web Elements
	@FindBy(xpath="//a[@href='/men' and @id='men']")
	private WebElement MenLink;
	
	@FindBy(xpath="//a[@href='/women' and @id='women']")
	private WebElement WomenLink;
	
	//getter Method
	public WebElement getMenLink()
	{
		return MenLink;
	}
	public WebElement getWomenLink()
	{
		return WomenLink;
	}

}
