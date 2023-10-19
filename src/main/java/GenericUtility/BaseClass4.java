package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import POMClasses.LoginPage;
import POMClasses.WelcomePageOfSS;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass4 
{
	public static WebDriver driver;
	DataUtility data=new DataUtility();
	
	@BeforeClass
	public void lanchTheBrowser() throws Throwable
	{
	System.out.println("------Launching the Browser----");
	String Browser = data.fetchingPropertiesFileData("browser");
		if(Browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		String URL = data.fetchingPropertiesFileData("url");
		driver.get(URL);
	}
	@BeforeMethod
	public void loginToApplication() throws Throwable
	{
		System.out.println("------Login to Application----");
	    WelcomePageOfSS welcomePage = new WelcomePageOfSS(driver);
	    welcomePage.getMainloginButton().click();
	    String USERNAME = data.fetchingPropertiesFileData("username");
	    String PASSWORD = data.fetchingPropertiesFileData("password");
	    
	    LoginPage loginpage = new LoginPage(driver);
	    loginpage.getemailTextField().sendKeys(USERNAME);
	    loginpage.getpasswordTextField().sendKeys(PASSWORD);
	    loginpage.getloginButton().click();
	}
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("------Logout from the Application----");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']"))));
        driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[name()='svg' and @data-testid='LogoutIcon']"))));
        driver.findElement(By.xpath("//*[name()='svg' and @data-testid='LogoutIcon']")).click();        
	}
	@AfterClass
	public void closeTheBrowser() throws Throwable
	{
	Thread.sleep(3000);
	driver.quit();
}
}



