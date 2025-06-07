package genericUtility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public Dimension captureSize(WebDriver driver) {
		 return driver.manage().window().getSize();
	}
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void selectDropdownByIndex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectDropdownByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectDropdownByText(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);
	}
	
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchBackToHome(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public Alert switchToAlert(WebDriver driver) {
		 return driver.switchTo().alert();
	}
	
	public void getScreenShot(WebDriver driver) throws IOException {
		JavaUtility jUtil=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File par=new File("./Screenshot/"+jUtil.getSystemTime()+".png");
		FileHandler.copy(temp, par);
	}
}
