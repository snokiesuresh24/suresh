package logopag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpageobjects extends basepage {


	public productpageobjects() {
		PageFactory.initElements(driver, this);
	}
		
@FindBy (xpath= "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
private WebElement dress1;

public WebElement getdress1() {
	return dress1;
}
public  void clickdress1() {
	dress1.click();
}

@FindBy (xpath= "//*[@id=\"short_description_content\"]")
private WebElement dress1description;

public WebElement getdress1description() {
	return dress1description;
}
	public int dress1descriptioncount() {
		String msg = dress1description.getText();
		char[] b = msg.toCharArray();
		int charcount = b.length;
		return charcount;
	}


}
