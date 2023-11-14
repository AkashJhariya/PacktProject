package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass  implements IPathConstant {


	public WebDriver driver;
	public FileUtility property = new FileUtility();
	public WebDriverUtility wb = new WebDriverUtility();
	Photo photo=new Photo();
	ExtentSparkReporter htmlreport;
	ExtentReports extentreport;
	ExtentTest contextTest;

	@BeforeMethod
	public void openapp(ITestContext context) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver= new ChromeDriver(co);
		driver.get(property.getPropertyKeyValue("url"));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
//		htmlreport = new ExtentSparkReporter("C:\\Users\\User\\eclipse-workspace\\qa.com.packt\\Report\\report.html");
//		extentreport = new  ExtentReports();
//		extentreport.attachReporter(htmlreport);
//		contextTest = extentreport.createTest(context.getName());
	}

	@AfterMethod
	public void closeApp() throws IOException
	{

		driver.quit();
//		extentreport.flush();
	}
}
