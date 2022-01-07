package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.crypt.temp.EncryptedTempData;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pomPages.CorejavaPage;
import pomPages.LoginPage;
import pomPages.SeleniumPage;
import pomPages.TakeThiscoursePage;

public class ShareViatwitter extends BaseClass
{	
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException {
	LoginPage l=new LoginPage(driver);
	SeleniumPage s=new SeleniumPage(driver);
	l.serachtextbox(pfile.getPropertyData("courseName"));
	
	s.closePopup();
	
	l.serachutton();
	
	
	Thread.sleep(10000);
	


//	utilies.mouseHover(driver,s.getTesting());
//	s.automationTestingtab();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.corejavacourse();
	
	TakeThiscoursePage t=new TakeThiscoursePage(driver);
	utilies.switchFrame(driver);
	t.playbutton();
	Thread.sleep(10000);
	t.pausebutton();
	utilies.switchBackFrame(driver);
	t.twitter();
	
	
	
	
}

}
