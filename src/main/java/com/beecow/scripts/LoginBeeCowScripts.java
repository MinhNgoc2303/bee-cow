package com.beecow.scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.LoginBeeCowPage;

import common.CommonTestCase;

public class LoginBeeCowScripts extends CommonTestCase {
	ObjectPageJson.JsonData data;
	WebDriver driver;
	LoginBeeCowPage loginBeeCowPage;
	String numeric, invalidEmail, email, password, incorrectPassword, invalidPassword, title;
	String actualEmpty_msg, actualNumeric_msg, actualInvalidEmail_msg, actualIncorrectPassword_msg,
			actualInvalidPassword_msg;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) {
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BeeCow.json");

		data = getDataJson(pathFileJson);

		driver = openBrowser(browser, version, url);
		loginBeeCowPage = PageFactory.initElements(driver, LoginBeeCowPage.class);
		
		
	}

	@BeforeMethod
	public void BeforeMethod() {
		driver.get("https://www.beecow.com/market");
	}

	 @Test
	public void TC01_allFieldsEmpty() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername("");
		loginBeeCowPage.inputToPassword("");
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageEmptyCase(), data.getLogInPageJson().getActualEmpty_msg());
	}

	 @Test
	public void TC02_usernameWithNumeric() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getNumeric());

		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageNumericCase(),data.getLogInPageJson().getActualNumeric_msg() );
		assertEquals(loginBeeCowPage.getMessageEmptyCase(), data.getLogInPageJson().getActualEmpty_msg());
	}

	 @Test
	public void TC03_invalidEmail() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getInvalidEmail());
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageInvalidEmailCase(), data.getLogInPageJson().getActualInvalidEmail_msg());
		assertEquals(loginBeeCowPage.getMessageEmptyCase(), data.getLogInPageJson().getActualEmpty_msg());
	}

	@Test
	public void TC04_passwordIsEmpty() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getEmail());
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageEmptyCase(), data.getLogInPageJson().getActualEmpty_msg());
	}

	@Test
	public void TC05_invalidPassword() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getEmail());
		loginBeeCowPage.inputToPassword(data.getLogInPageJson().getIncorrectPassword());
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageInvalidPasswordCase(), data.getLogInPageJson().getActualIncorrectPassword_msg());
	}

	@Test
	public void TC06_loginWithInvalidAccount() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getEmail());
		loginBeeCowPage.inputToPassword(data.getLogInPageJson().getInvalidPassword());
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getMessageWrongPasswordCase(), data.getLogInPageJson().getActualInvalidPassword_msg());
	}
		
	@Test
	public void TC07_loginSuccessfully() {
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getEmail());
		loginBeeCowPage.inputToPassword(data.getLogInPageJson().getPassword());
		loginBeeCowPage.clickToLogin();
		assertEquals(loginBeeCowPage.getTitle(), data.getLogInPageJson().getTitle());
	}
	
	
	
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}

}
