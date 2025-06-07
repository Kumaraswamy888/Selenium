package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicLink() {
		return electronicLink;
	}

	public WebElement getApparelLink() {
		return apparelLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
}
