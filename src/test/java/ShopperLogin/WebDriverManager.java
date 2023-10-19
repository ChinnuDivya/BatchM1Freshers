package ShopperLogin;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;

public class WebDriverManager extends BaseClass
{

	public static void main(String[] args) throws Throwable 
	{
		DataUtility data = new DataUtility();
		String BrowserRef = data.fetchingPropertiesFileData("browser");
		BaseClass.lanchTheBrowser(BrowserRef);
		String URL = data.fetchingPropertiesFileData("url");
		driver.get(URL);
	}
}
