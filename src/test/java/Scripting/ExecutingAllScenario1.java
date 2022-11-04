package Scripting;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class ExecutingAllScenario1 extends BaseClass{

	@Test
	public void tc1() {
		SkillraryLoginPage sl=new SkillraryLoginPage(driver);
		sl.gearsbtn();
		sl.DemoSkill();
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.SeleniumTraining();
		
		AddToCart ad=new AddToCart(driver);
		driverutilities.doubleclick(driver, ad.getPlustbtn());
		ad.Addtocart();
		driverutilities.alertpopup(driver);
	}

}
