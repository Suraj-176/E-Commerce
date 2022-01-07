package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gerasBtn;

	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement go;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void gearsButton() {
		gerasBtn.click();
	}
	
	public void skillrrayDemoAppbtn() {
		skillrarydemoapp.click();
	}

	public void serachtextbox(String coursename) {
		serachtb.sendKeys(coursename);
	}
	
	public void serachutton() {
		go.click();
	}
	
}
