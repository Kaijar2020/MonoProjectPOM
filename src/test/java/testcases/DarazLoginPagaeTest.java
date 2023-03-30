package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilites.DataSet;
import utilites.DriverSetup;

public class DarazLoginPagaeTest extends DriverSetup {
	
	DarazLoginPage darazLoginPage = new DarazLoginPage();
	DarazHomePage darazHomePage = new DarazHomePage();
	
	@Test (description = "Test Login Finctionality",dataProvider = "InvalidCredential",dataProviderClass = DataSet.class)
	@Description("Test Daraz Login Page")
	public void testDarazLoginPagewithInvalidData(String userName,String passWord, String ErrorMessage) throws InterruptedException {
		
		getDriver().get(darazHomePage.HOME_PAGE_URL);
		darazHomePage.clickOnElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
		darazLoginPage.writeText(darazLoginPage.EMAIL_OR_PHONE_INPUT_FIELD, userName);
		darazLoginPage.writeText(darazLoginPage.PASSWORD_INPUT_FIELD, passWord);
		darazLoginPage.clickOnElement(darazLoginPage.LOGIN_BUTTON);
		assertEquals(darazLoginPage.getElement(darazLoginPage.ERROR_MESSAGE).getText(), ErrorMessage);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		darazLoginPage.takeScreenShoot("loginTestSS");
		
	}
	

}
