package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
@FindBy(xpath="//i[@class='fa fa-plus']")
private WebElement plustbtn;

@FindBy(xpath="//button[@ondblclick=\"addtocart()\"]")
private WebElement Addtocart;

public AddToCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getPlustbtn() {
	return plustbtn;
}
public void Addtocart() {
	Addtocart.click();
}
}
