package logopag;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dressespageobjects extends basepage{
	public dressespageobjects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement sml;

	public WebElement smallsize() {
		return sml;
	}

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement mdm;

	public WebElement mediumsize() {
		return mdm;
	}

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement lrg;

	public WebElement largesize() {
		return lrg;
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li")

	private List<WebElement> tablecount;

	public int gettablecount() {
		return tablecount.size();
	}

	@FindBy(xpath = "//*[@class=\"heading-counter\"]")
	private WebElement headcount;

	public int getheadcount() {
		String text = headcount.getText();
		String[] arr = text.split(" ");
		String textcount = arr[2];
		int count = Integer.parseInt(textcount);
		return count;
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement dress1;

	public void clickdress1() {
		dress1.click();
	}

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement cartbutton;

	public void clickaddtocartbutton() {
		cartbutton.click();

	}

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	private WebElement cartverify;
	
	public WebElement addtocartverification() {
		return cartverify;
	}
	
	@FindBy(xpath = "*//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement product;
	
	public WebElement getProduct() {
		return product;
	}
	
	public void clickproduct() {
		product.click();
	}
	
	@FindBy(xpath = "*//button[@class='exclusive']")
	private WebElement addtocart;
	
	public WebElement addproductTocart() {
		return addtocart;
	}
	
	public void clickaddtocart() {
		addtocart.click();
	}
	
	@FindBy(xpath = "*//i[@class='icon-ok']")
	private WebElement successfulmessage;
	
	public WebElement getsuccessmessage() {
		return successfulmessage;
	}
	

}
