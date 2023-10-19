package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass5;

public class TestNGPrg7 extends BaseClass5
{
	@Test(groups="SanityTest")
	public void TC_Login_006() 
	{
		System.out.println("The sixth test case");		
	}
	@Test(groups="RegressionTest")
	public void TC_Login_007() 
	{
		System.out.println("The seventh test case");		
	}
	@Test(groups="SmokeTest")
	public void TC_Login_008() 
	{
		System.out.println("The eighth test case");		
	}

}

