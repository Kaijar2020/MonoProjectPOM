package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage {
	
	public String HOME_PAGE_URL = "https://www.daraz.com.bd/?spm=a2a0e.login_signup.header.dhome.69a32829RcBCVB";
	//The Traveled path for Login Button : //body/div[1]/div/div/div[1]/div/div/div[1]/div/div[6]/a
	public By SIGNUP_LOGIN_BUTTON = By.xpath("//a[contains(text(),'Signup / Login')]");
	public By CUSTOMER_CARE_BUTTON = By.xpath("//span[contains(text(),'CUSTOMER CARE')]");
	public By HELP_CENTER_BUTTON = By.xpath("//a[contains(text(),'Help Center')]");
	public By csCare = By.xpath("//h3[normalize-space()='Customer Care']");

}
