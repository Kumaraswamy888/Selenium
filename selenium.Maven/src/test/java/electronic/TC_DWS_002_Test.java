package electronic;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_002_Test extends BaseClass {
	@Test
	public void clickOnElectronics() {
		test.log(Status.INFO, "Test excution started");
		hp=new HomePage(driver);
		hp.getElectronicLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics");
		test.log(Status.PASS, "Electronic  page is displayed");
	}
}
