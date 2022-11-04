package Scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Scenario2 extends BaseClass {
	
		@Test
		public void tc2() throws IOException {
			SkillraryLoginPage sl=new SkillraryLoginPage(driver);
			sl.gearsbtn();
			sl.DemoSkill();
			driverutilities.switchtabs(driver);
			
			SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
			driverutilities.dropdown(sd.getCoursedd(),pdata.getdata("dropdownopt"));
			
			TestingPage tp=new TestingPage(driver);
			driverutilities.draganddrop(driver,tp.getSeleniumTraining(),tp.getCartArea());
			
			Point loc = tp.getTwitter().getLocation();
			int X = loc.getX();
			int Y = loc.getY();
			driverutilities.scrollBar(driver, X, Y);
			
			tp.twitterlg();
		}
	}
	
