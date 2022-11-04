package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishLiast {
@FindBy(xpath="//button[@aria-label='Play']")
private WebElement playbtn;

@FindBy(xpath="//button[@aria-label='Pause']")
private WebElement pausebtn;

@FindBy(xpath="//span[text()='Add To Wishlist']")
private WebElement wishlist;

public WishLiast(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void playbtn() {
	playbtn.click();
}
public void pausebtn() {
	pausebtn.click();
}

public void addtowishlist() {
	wishlist.click();
}
}
