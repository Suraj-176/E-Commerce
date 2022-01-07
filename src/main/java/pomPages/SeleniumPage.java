package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	@FindBy(xpath="//a[text()='Testing']")
    private WebElement testing;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement close;
	
	public WebElement getTesting() {
		return testing;
	}

	@FindBy(xpath="//a[text()='Automation Testing']")
	private WebElement automationTesting;
	
	public SeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void automationTestingtab() {
		automationTesting.click();
	}
	
	public void closePopup() {
		close.click();
	}

	public boolean getClose() {
		return false;
		
	}
	
	
}
