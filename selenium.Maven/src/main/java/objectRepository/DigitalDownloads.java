package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloads {
	@FindBy(id = "products-orderby")
	private WebElement  productOrderLink;
	
	@FindBy(id = "products-pagesize")
	private WebElement  productPAgesizeLink;
	
	@FindBy(id = "products-viewmode")
	private WebElement productViewmode;
	
	public DigitalDownloads(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductOrderLink() {
		return productOrderLink;
	}

	public WebElement getProductPAgesizeLink() {
		return productPAgesizeLink;
	}

	public WebElement getProductViewmode() {
		return productViewmode;
	}
}
