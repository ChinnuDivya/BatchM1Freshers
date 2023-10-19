package ShopperLogin;

import GenericUtility.DataUtility;

public class FetchingGenericDataUtility {

	public static void main(String[] args) throws Throwable 
	{
		DataUtility data = new DataUtility();
		String URL = data.fetchingPropertiesFileData("url");
		System.out.println(URL);
		String value = data.fetchingExelFileDataString("Sheet1", 1,2);
		// long value = data.fetchingExelFileDataNumeric("Sheet1", 1,2);
		// double value = data.fetchingExelFileDataNumeric("Sheet1", 1,2);
		// boolean value = data.fetchingExelFileDataBoolean("Sheet1", 1,2);
		// date value = data.fetchingExelFileDataDate("Sheet1", 1,2);
		System.out.println(value);
		

	}

}
