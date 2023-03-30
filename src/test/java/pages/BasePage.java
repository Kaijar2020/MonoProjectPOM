package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;

import  static utilites.DriverSetup.getDriver;

import java.io.ByteArrayInputStream;

public class BasePage {
	
	public WebElement getElement(By locator) {
		
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator,String text) {
		
		getElement(locator).sendKeys(text);
		
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	public void takeScreenShoot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
		
	}
	
	public void ScrollElement(By locator) {
		
		WebElement el = getElement(locator);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);	}

	
}
