package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass5 implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String FailedMethod = result.getMethod().getMethodName().toString();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String name = FailedMethod+timeStamp;
		File permanentFile = new File("./Screenshots"+name+".png");
		try
		{
			FileHandler.copy(tempFile, permanentFile);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
