package computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.ComputerPage;
import objectRepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_004_Test  extends BaseClass{
	@Test
	public void clickOnDesktpLink() {
		test.log(Status.INFO, "test execution started");
		hp=new HomePage(driver);
		hp.getComputerLink().click();
		cp=new ComputerPage(driver);
		cp.getDesktopLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops");
		test.log(Status.PASS, "test Excution completed");
	}
}
