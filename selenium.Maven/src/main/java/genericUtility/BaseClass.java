package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.ComputerPage;
import objectRepository.ElectronicPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelComePage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports eReport;
	public static ExtentTest test;
	public static WebDriverUtility wUtil=new WebDriverUtility();
	
	public FileUtility util=new FileUtility();
	public ExcelUtility ex=new ExcelUtility();
	public JavaUtility jUtil=new JavaUtility();
	
	public WelComePage wp;
	public LoginPage lp;
	public HomePage hp;
	public ElectronicPage el;
	public ComputerPage cp;
	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/"+jUtil.getSystemTime()+".png");
		eReport=new ExtentReports();
		eReport.attachReporter(spark);
	}
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(util.getDataFromProperty("url"));
	}
	
	@BeforeMethod
	public void launch() throws EncryptedDocumentException, IOException {
		wp=new WelComePage(driver);
		lp=new LoginPage(driver);
		wp.getLoginLink().click();
		lp.getEmailTextField().sendKeys(util.getDataFromProperty("username"));
		lp.getPasswordTextField().sendKeys(util.getDataFromProperty("password"));
		lp.getLoginButton().click();		
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogoutButton().click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}
}
