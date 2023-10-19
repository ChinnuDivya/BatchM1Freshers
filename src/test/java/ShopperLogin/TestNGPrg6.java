package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass5;

public class TestNGPrg6 extends BaseClass5
{
	@Test(groups="SmokeTest")
	public void TC_Login_003() 
	{
		System.out.println("The third test case");		
	}
	@Test(groups="RegressionTest")
	public void TC_Login_004() 
	{
		System.out.println("The fourth test case");		
	}
	@Test(groups={"RegressionTest","SmokeTest"})
	public void TC_Login_005() 
	{
		System.out.println("The fifth test case");		
	}

}
