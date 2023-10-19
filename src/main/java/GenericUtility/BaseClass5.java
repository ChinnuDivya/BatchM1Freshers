package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMClasses.HomePageOfSpiceJet;
import POMClasses.LoginPageOfSpiceJet;
import POMClasses.WelcomePageOfSpiceJet;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass5 
{
	public static WebDriver driver;
	DataUtility data=new DataUtility();
	//  @Parameters("Browser")
	@BeforeClass
	// public void lanchTheBrowser(String Browser) throws Throwable
	public void lanchTheBrowser() throws Throwable
	{
		System.out.println("-----Launching the Browser----");
		String Browser=data.fetchingPropertiesFileData("browser");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		if(Browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
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
		 WelcomePageOfSpiceJet welcomePage = new WelcomePageOfSpiceJet(driver);
		welcomePage.LoginButton().click();
		
		String MOBILENUMBER = data.fetchingPropertiesFileData("phonenumber");
		String PASSWORD = data.fetchingPropertiesFileData("password");
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 200);
		 LoginPageOfSpiceJet loginpageofspicejet = new LoginPageOfSpiceJet(driver);
		 loginpageofspicejet.getMobileNumber().sendKeys(MOBILENUMBER);
		 loginpageofspicejet.getpasswordTextField().sendKeys(PASSWORD);
		
		 loginpageofspicejet.getloginButton().click();
	}		
		
	@AfterMethod
	public void logoutApplication()
	{
		HomePageOfSpiceJet homepageofspicejet = new HomePageOfSpiceJet(driver);
		homepageofspicejet.getProfileButton().click();
		homepageofspicejet.getLogoutButton().click();		
	}
	@AfterClass
	public void closeTheBrowser() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
	

		
	


