
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenShotIntoReport {
	@Test
	public void addScreenshot() {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot sc=(TakesScreenshot) driver;
		String tem = sc.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ScreenShotReport_"+time+".html");
		ExtentReports eReport=new ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test = eReport.createTest("addScreenshot");
		test.log(Status.PASS, "added ScreenShot");
		test.addScreenCaptureFromBase64String(tem);
		eReport.flush();
		
	}
}
