package ShopperLogin;

import org.testng.annotations.Test;


import GenericUtility.BaseClass2;
import GenericUtility.DataUtility;

public class TestNGPrg2 extends BaseClass2 
	{
		@Test(priority=3, enabled=true)
			public void TC_Login_001() throws Throwable
			{
			System.out.println("The first test case");
			DataUtility data = new DataUtility();
			String URL = data.fetchingPropertiesFileData("url");
			driver.get(URL);		
			}
		
		@Test(dependsOnMethods = "TC_Login_003" ,alwaysRun=true )
			public void TC_Login_002() throws Throwable
			{
			DataUtility data = new DataUtility();
			System.out.println("The second test case");
			String URL = data.fetchingPropertiesFileData("url");
			driver.get(URL);
			}
			@Test(priority=1)
			public void TC_Login_003() throws Throwable
			{
			DataUtility data = new DataUtility();
			System.out.println("The third test case");
			String URL = data.fetchingPropertiesFileData("url");
			driver.get(URL);
			}
		}





