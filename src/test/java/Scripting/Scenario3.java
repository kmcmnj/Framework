package Scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishLiast;

public class Scenario3 extends BaseClass{
@Test
public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage sl=new SkillraryLoginPage(driver);
	sl.searchbox(pdata.getdata("coursename"));
	sl.searchbtn();
	
	CoreJavaPage cjp=new CoreJavaPage(driver);
	cjp.java();
	
	WishLiast w=new WishLiast(driver);
	driverutilities.switchFrame(driver);
	w.playbtn();
	Thread.sleep(10000);
	w.pausebtn();
	driverutilities.switchbackframe(driver);
	w.addtowishlist();
	}
}
