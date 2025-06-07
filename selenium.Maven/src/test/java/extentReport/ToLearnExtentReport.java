package extentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void createReport() {
		String time = LocalDateTime.now().toString().replace(":", "-");
		//Step 1 Create ExtentSparkReporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/ExtentReport_"+time+".html");
		//Step 2 create  ExtentReports object
		ExtentReports eReport=new ExtentReports();
		//Step 3 attach ExtentSparkReporter to ExtentReports
		eReport.attachReporter(spark);
		//Step 4 create ExtentTest Object
		ExtentTest test=eReport.createTest("createReport");
		//Step 5  call log(status,message)
		test.log(Status.PASS, "log message added int report");
		//Step 6 call flush()
		eReport.flush();
	}
}
