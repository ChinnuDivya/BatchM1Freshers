package ShopperLogin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass3;

public class TestNGPrg3 extends BaseClass3
{
	@Test
	public void TC_Login_001()
	{
		System.out.println("The first test cases");
		driver.findElement(By.xpath("//a[@href='/men' and @id='men']")).click();
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
		driver.findElement(By.xpath("//a[@href='/women' and @id='women']")).click();
		if(driver.getCurrentUrl().equals("https://www.shoppersstack.com/women"));
		{
			System.out.println("Women page is Displayed");
			System.out.println("The second test case is passed");
		}
	}
	

}
