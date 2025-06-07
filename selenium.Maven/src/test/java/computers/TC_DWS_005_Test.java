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
public class TC_DWS_005_Test extends BaseClass {
	@Test
	public void clickOnNotebooks() {
		test.log(Status.INFO, "Excution Started");
		hp=new HomePage(driver);
		hp.getComputerLink().click();
		cp=new ComputerPage(driver);
		cp.getNoteBookLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Notebooks");
		test.log(Status.PASS, "Excution Completed");
	}
}
