package logopag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends basepage {

	public homepageobjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "*//div/ul/li[2]//a[@title='Dresses']")
	private WebElement dresstab;

	public WebElement getdresstab() {
		return dresstab;
	}
		
	public void clickdresstab() {
		dresstab.click();

	}
	
		@FindBy(xpath = "*//a[@title='Women']")
	private WebElement womenstab;

	public WebElement getWomenstab() {
		return womenstab;
	}

	public void clickwomens() {
		womenstab.click();
	}

	@FindBy(xpath = "*//ul/li[3]/a[@title='T-shirts']")
	private WebElement Tshirtstab;

	public WebElement getTshirtstab() {
		return Tshirtstab;
	}

	public void clickTshirts() {
		Tshirtstab.click();
	}

	@FindBy(id = "newsletter-input")
	private WebElement newsletter;

	public WebElement newslettertab() {
		return newsletter;
	}

	@FindBy(name = "submitNewsletter")
	private WebElement submit;

	public WebElement submitemailbutton() {
		return submit;
	}

	public void getsubscription() {
		settext(newsletter, "snokiesuresh@gmail.com");
		submit.click();
	}

	@FindBy(xpath = "//*[@id=\"columns\"]/p")
	private WebElement msg;

	public WebElement confirmationmsg() {
		return msg;
	}

	public String getconfirmationmsg() {
		return msg.getText();

	}


}
