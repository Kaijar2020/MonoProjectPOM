package pages;

import org.openqa.selenium.By;

public class DarazLoginPage extends BasePage {
	
	public String LOGIN_PAGE_URL = "https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7r5FFiA&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F%23";
	public By EMAIL_OR_PHONE_INPUT_FIELD = By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@placeholder=\"Please enter your password\"]");
	public By LOGIN_BUTTON = By.xpath("//button[contains(text(),'LOGIN')]");
	public By ERROR_MESSAGE = By.xpath("//div[@class='next-feedback-content']");
	
	public void doLogin(String username, String password) {
		
		writeText(EMAIL_OR_PHONE_INPUT_FIELD, username);
		writeText(PASSWORD_INPUT_FIELD, password);
		clickOnElement(LOGIN_BUTTON);
		
	}
}
