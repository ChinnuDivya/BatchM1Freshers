package ShopperLogin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass4;
import POMClasses.Homepage;

public class TestNGPrg4 extends BaseClass4
{
	Homepage homepage=new Homepage(driver);
	@Test
	public void TC_Login_001()throws Throwable
	{
		System.out.println("The first test cases");
		homepage.getMenLink().click();
		if(driver.getCurrentUrl().equals("https://www.shoppersstack.com/men"));
		{
			System.out.println("Men page is Displayed");
			System.out.println("The first test case is passed");
		}
	}
	@Test
	public void TC_Login_002()
	{
		System.out.println("The second test cases");
		homepage.getWomenLink().click();
		driver.findElement(By.xpath("//a[@href='/women' and @id='women']")).click();
		if(driver.getCurrentUrl().equals("https://www.shoppersstack.com/women"));
		{
			System.out.println("Women page is Displayed");
			System.out.println("The second test case is passed");
		}
	}
	

}

