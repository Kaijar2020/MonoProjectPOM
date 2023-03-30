package testcases;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilites.DriverSetup;

public class DarazHomepageTest extends DriverSetup {
	
	DarazHomePage darazHomePage = new DarazHomePage();
	@Test
	public void scrollTestOnHomepage() {
		getDriver().get(darazHomePage.HOME_PAGE_URL);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		darazHomePage.ScrollElement(darazHomePage.csCare);
		try {
			Thread.sleep(000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
