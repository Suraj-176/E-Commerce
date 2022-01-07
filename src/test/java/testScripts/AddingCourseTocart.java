package testScripts;




import org.testng.annotations.Test;

import pomPages.AddtoCartPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoLoginPage;

public class AddingCourseTocart extends BaseClass {
	
	@Test
	public void tc1() {
	LoginPage l=new LoginPage(driver);
	l.gearsButton();
	l.skillrrayDemoAppbtn();
	
	utilies.switchTabs(driver);
	
	SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
	utilies.mouseHover(driver,d.getCourse());
	d.seleniumTrainingTab();
	
	AddtoCartPage a=new AddtoCartPage(driver);
	utilies.doubleClick(driver,a.getAddbtn());
	a.addTocartButton();
	
	
	
		
	}

}
