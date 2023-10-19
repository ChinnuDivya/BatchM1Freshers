package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Login1Test {

	public static void main(String[] args) throws Throwable 
	{
		 File file = new File("C:\\Oopsconcept\\ShopperStackM1\\src\\test\\resources\\TestData\\Propertyfile.properties");
		 FileInputStream fis = new FileInputStream(file);
		 Properties pro = new Properties();
		 pro.load(fis);
		 String url = pro.getProperty("url");
		 System.out.println(url);
		 String US = pro.getProperty("username");
		 System.out.println(US);
	}
	}


