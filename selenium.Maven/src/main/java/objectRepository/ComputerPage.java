package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	@FindBy(partialLinkText = "Desktops")
	public WebElement desktopLink;
	
	@FindBy(partialLinkText = "Notebooks")
	public WebElement noteBookLink;
	
	@FindBy(partialLinkText = "Accessories")
	public WebElement accessoriesLink;
	
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDesktopLink() {
		return desktopLink;
	}

	public WebElement getNoteBookLink() {
		return noteBookLink;
	}

	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}
	
}
