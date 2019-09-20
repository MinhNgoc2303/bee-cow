package com.beecow.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.LoginBeeCowPageUI;

import common.CommonFunctions;

public class LoginBeeCowPage extends CommonFunctions{

	public LoginBeeCowPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickToLoginHome() {
		waitForElementVisible(LoginBeeCowPageUI.LOGINHOME_BTN);
		clickToElement(LoginBeeCowPageUI.LOGINHOME_BTN);
	}
	
	public void inputToUsername(String value) {
		waitForElementVisible(LoginBeeCowPageUI.USERNAME_TXT);
		inputElement(LoginBeeCowPageUI.USERNAME_TXT, value);
	}

	public void inputToPassword(String value) {
		waitForElementVisible(LoginBeeCowPageUI.PASSWORD_TXT);
		inputElement(LoginBeeCowPageUI.PASSWORD_TXT, value);
	}
	
	public void pressToUsernameField(Keys key) {
		waitForElementVisible(LoginBeeCowPageUI.USERNAME_TXT);
		sendKeyPress(LoginBeeCowPageUI.USERNAME_TXT, key);
	}
	
	public void pressToPasswordField(Keys key) {
		waitForElementVisible(LoginBeeCowPageUI.PASSWORD_TXT);
		sendKeyPress(LoginBeeCowPageUI.PASSWORD_TXT, key);
	}
	
	public CreateProductBeeCow clickToLogin() {
		waitForElementVisible(LoginBeeCowPageUI.LOGIN_BTN);
		clickToElement(LoginBeeCowPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, CreateProductBeeCow.class);
	}
	
	public String getMessageEmptyCase() {
		waitForElementVisible(LoginBeeCowPageUI.EMPTYALLFIELDS_MSG);
		return getTextElement(LoginBeeCowPageUI.EMPTYALLFIELDS_MSG);
	}
	
	public String getMessageNumericCase() {
		waitForElementVisible(LoginBeeCowPageUI.INCORRECTMOBILE_MSG);
		return getTextElement(LoginBeeCowPageUI.INCORRECTMOBILE_MSG);
	}
	
	public String getMessageInvalidEmailCase() {
		waitForElementVisible(LoginBeeCowPageUI.INVALIDEMAIL_MSG);
		return getTextElement(LoginBeeCowPageUI.INVALIDEMAIL_MSG);
	}
	
	public String getMessageInvalidPasswordCase() {
		waitForElementVisible(LoginBeeCowPageUI.INVALIDPASSWORD_MSG);
		return getTextElement(LoginBeeCowPageUI.INVALIDPASSWORD_MSG);
	}
	
	public String getMessageWrongPasswordCase() {
		waitForElementVisible(LoginBeeCowPageUI.WRONGPASSWORD_MSG);
		return getTextElement(LoginBeeCowPageUI.WRONGPASSWORD_MSG);
	}
	
	public String getTitle() {
		waitForElementVisible(LoginBeeCowPageUI.TITLE_LBL);
		return getTextElement(LoginBeeCowPageUI.TITLE_LBL);
	}
	
//	public EditCustomerPage clickEditCustomer() {
//		 waitForElementVisible(HomePageUI.EDITCUSTOMER_LBL);
//		 clickToElement(HomePageUI.EDITCUSTOMER_LBL);
//		 return PageFactory.initElements(driver, EditCustomerPage.class);
//	 }
}
