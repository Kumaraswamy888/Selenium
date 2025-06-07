package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	@FindBy(id = "products-orderby")
	private WebElement bookSort;
	
	@FindBy(xpath = "//div[@class='product-page-size']")
	private WebElement displayPerPage;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewAs;
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getBookSort() {
		return bookSort;
	}
	public WebElement getDisplayPerPage() {
		return displayPerPage;
	}
	public WebElement getViewAs() {
		return viewAs;
	}
}
