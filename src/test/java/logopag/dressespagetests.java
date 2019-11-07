package logopag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dressespagetests {
	dressespageobjects dp;
	
	homepageobjects hp;
	public dressespagetests() {
		dp = new dressespageobjects();
		
		hp = new homepageobjects();
		
	}
	@Test
	public void dresstab() {
		hp.clickdresstab();
		Assert.assertTrue(hp.gettittle().contains("Dresses"));
	}
	@Test
	public void verificationsizes() {
		Assert.assertTrue(hp.elementFound(dp.smallsize()));
		Assert.assertTrue(hp.elementFound(dp.mediumsize()));
		Assert.assertTrue(hp.elementFound(dp.largesize()));
	}
	@Test
	public void verifycount() {
		int tablecount = dp.gettablecount();
		int headcount = dp.getheadcount();
		Assert.assertTrue(tablecount==headcount);
		
	}
	@Test
	public void verifyaddedtocart() {
		hp.clickdresstab();
		dp.clickdress1();
		dp.clickaddtocartbutton();
	Assert.assertTrue(hp.elementFound(dp.getsuccessmessage()));
	
	}
	

}
