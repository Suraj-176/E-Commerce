package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;

	public WebElement getFb() {
		return fb;
	}
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
