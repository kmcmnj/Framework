package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearsbtn;

@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
private WebElement DemoSkill;

@FindBy(name="q")
private WebElement searchbox;

@FindBy(xpath="(//input[@value='go'])")
private WebElement searchbtn;

public SkillraryLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void gearsbtn() {
	gearsbtn.click();
}
public void DemoSkill() {
	DemoSkill.click();
}
public void searchbox(String coursename) {
	searchbox.sendKeys(coursename);
}
public void searchbtn() {
	searchbtn.click();
}
}
