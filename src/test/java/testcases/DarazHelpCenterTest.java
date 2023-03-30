package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHelpCenterPage;
import utilites.DriverSetup;

public class DarazHelpCenterTest extends DriverSetup {
	
	DarazHelpCenterPage darazHelpCenterPage = new DarazHelpCenterPage();
	@Test
	public void TestHelpCenterPageTitle() {
		
		getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
		assertEquals(getDriver().getTitle(),darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		darazHelpCenterPage.takeScreenShoot("helpCenterTestSS");
	}
	
//	@Test
//	public void TestHelpCenterPageTitle2() throws InterruptedException {
//		
//		getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
//		assertEquals(getDriver().getTitle(),darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
//		Thread.sleep(9000);
//	}

}
