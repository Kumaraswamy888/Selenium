package electronic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepository.ElectronicPage;
import objectRepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_003_Test extends BaseClass{
	@Test
	public void ClickOnCemaraAndPhotos() {
		test.log(Status.INFO, "Test Excution Started");
		hp=new HomePage(driver);
		hp.getElectronicLink().click();
		el=new ElectronicPage(driver);
		el.getCameraLink().click();
		assertEquals(driver.getTitle(), "Demo Web Shop. Camera, photo");
		test.log(Status.PASS, "CemaraAndPhotos is displayed");
	}
}
