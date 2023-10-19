package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;

public class TestNGPrg1 extends BaseClass
{
@Test(priority=3, enabled=false)
	public void TC_Login_001() throws Throwable
	{
	DataUtility data = new DataUtility();
	String BrowserRef = data.fetchingPropertiesFileData("browser");
	System.out.println("The first test case");
	BaseClass.lanchTheBrowser(BrowserRef);
	String URL = data.fetchingPropertiesFileData("url");
	driver.get(URL);	
	}
@Test(dependsOnMethods = "TC_Login_003" ,alwaysRun=true )
	public void TC_Login_002() throws Throwable
	{
	DataUtility data = new DataUtility();
	String BrowserRef = data.fetchingPropertiesFileData("browser");
	System.out.println("The second test case");
	BaseClass.lanchTheBrowser(BrowserRef);
	String URL = data.fetchingPropertiesFileData("url");
	driver.get(URL);
	}
	@Test(priority=1)
	public void TC_Login_003() throws Throwable
	{
	DataUtility data = new DataUtility();
	String BrowserRef = data.fetchingPropertiesFileData("browser");
	System.out.println("The third test case");
	BaseClass.lanchTheBrowser(BrowserRef);
	String URL = data.fetchingPropertiesFileData("url");
	driver.get(URL);
	}
}
