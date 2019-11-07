package logopag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class productpagetests {


	dressespageobjects dp;
	homepageobjects hp;
	productpageobjects pp;
	
	
	public productpagetests() {
		dp = new dressespageobjects();
		pp = new productpageobjects();
		hp = new homepageobjects();
	}
	
	@Test
	public void verifydescriptionmsgcount () {
		hp.clickdresstab();
		pp.clickdress1();
		int count = pp.dress1descriptioncount();
		Assert.assertTrue(count <300);
	}
	
	

	
}
