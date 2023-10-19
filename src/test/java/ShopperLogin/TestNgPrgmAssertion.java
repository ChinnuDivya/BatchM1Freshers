package ShopperLogin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import GenericUtility.BaseClass5;
import GenericUtility.DataUtility;
import POMClasses.HomePageOfSpiceJet;
import POMClasses.HotelPage;

public class TestNgPrgmAssertion extends BaseClass5
{
	@Test
	public void TC_Login_001()throws Throwable
	{
		HomePageOfSpiceJet homepage = new HomePageOfSpiceJet(driver);
		HotelPage hotelpage=new HotelPage(driver);
		DataUtility data = new DataUtility();
		System.out.println("The first test cases");
		Thread.sleep(10000);
		homepage.getHotelButton().click();
		
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("https://www.spicejet.com/",driver.getCurrentUrl() );
		
		Thread.sleep(5000);
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);
		Set<String> allWindowId = driver.getWindowHandles();		                      
		allWindowId.remove(MainWindow);
		for(String wind:allWindowId)
		{
			driver.switchTo().window(wind);
		}
		Thread.sleep(5000);
		String CITY = data.fetchingExelFileDataString("Sheet1", 1, 0);
		hotelpage.getCityInputTextField().sendKeys(CITY);
		
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	//	hotelpage.getFromDate().click();		
	//	long FromDate = data.fetchingExelFileDataNumeric("Sheet1",1, 1);
	//	long ToDate = data.fetchingExelFileDataNumeric("Sheet1",1, 2);		
	//	hotelpage.selectDatesForHotels(driver,FromDate,ToDate);
	//	Thread.sleep(5000);
	//	hotelpage.getSearchNowForHotelsButtons().click();
	//	Thread.sleep(5000);
		
		driver.switchTo().window(MainWindow);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://www.spicejet.com/");
		softAssert.assertAll();
	}
	@Test	
	public void TC_Login_002() throws Throwable
	{
		System.out.println("The second test cases");		
	}
}
