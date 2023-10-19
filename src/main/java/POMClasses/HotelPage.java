package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage 
{
	public WebDriver driver;
	
	// Initialing of all the Web Elements
		public HotelPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Declaration of Web Elements
		@FindBy(id="txtHotelCity")
	//	@FindBys({@FindBy(id="txtHotelCity"),@FindBy(xpath="//input[@ng-model='txthotelcity']")});
	//	@FindByAll({@FindBy(id="txtHotelCity"),@FindBy(xpath="//input[@ng-model='txthotelcity']")});
		private WebElement CityInputTextField;
		
		@FindBy(id="from")
		private WebElement FromDate;
		
		@FindBy(xpath="//a[text()='Search Now']")
		private WebElement SearchNowForHotelsButtons;
			
		//getter Method
		public WebElement getCityInputTextField()
		{
			return CityInputTextField;
		}
		public WebElement getFromDate()
		{
			return FromDate;
		}
		public WebElement getSearchNowForHotelsButtons()
		{
			return SearchNowForHotelsButtons;
		}
		public void selectDatesForHotels(WebDriver driver,long FromDate,long ToDate) throws Throwable
		{
			driver.findElement(By.xpath("//a[text()='"+FromDate+"']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='"+ToDate+"']")).click();
		}

	}

