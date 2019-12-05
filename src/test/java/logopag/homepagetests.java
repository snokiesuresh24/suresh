package logopag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetests {

	homepageobjects hp;

	public homepagetests() {
		hp = new homepageobjects();

	}

	@Test
	public void verifytabs() {
		Assert.assertTrue(hp.elementFound(hp.getdresstab()));
		
		
		
		
		
		Assert.assertTrue(hp.elementFound(hp.getdresstab()));
		Assert.assertTrue(hp.elementFound(hp.getTshirtstab()));

	}
	
	@Test
	public void verifywomen() {
		hp.clickwomens();
		Assert.assertTrue(hp.gettittle().equals("Women - My Store"));
	}

	@Test
	public void verifydress() {
		hp.clickdresstab();
		Assert.assertTrue(hp.gettittle().equals("Dresses - My Store"));

	}
	
	@Test
	public void verifytshirt() {
		hp.clickTshirts();
		Assert.assertTrue(hp.gettittle().equals("T-shirts - My Store"));
	}

	@Test
	public void verifyemailsub() {
		hp.getsubscription();
		Assert.assertTrue(hp.getconfirmationmsg().contains("already registered"));

	}
	@Test
	public void verifyemail() {
		hp.getsubscription();
		Assert.assertTrue(hp.getconfirmationmsg().contains("already registered"));

	

}
