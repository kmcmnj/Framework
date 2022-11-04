package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement SeleniumTraining;
	
	@FindBy(id="cartArea")
	private WebElement CartArea;
	
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumTraining() {
		return SeleniumTraining;
	}

	public WebElement getCartArea() {
		return CartArea;
	}

	public WebElement getTwitter() {
		return twitter;
	}
	public void twitterlg() {
		twitter.click();
	}

}
