package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage {
	@FindBy(linkText = "Register")
	private WebElement registerLink; 
	
	@FindBy(linkText = "Log in")
	public WebElement loginLink;
	
	public WelComePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	
}
