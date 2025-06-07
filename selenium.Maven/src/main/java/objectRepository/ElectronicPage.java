package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage {
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraLink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhoneLink;
	
	public ElectronicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCameraLink() {
		return cameraLink;
	}
	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}
	
}
