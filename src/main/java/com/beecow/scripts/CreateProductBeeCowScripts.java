package com.beecow.scripts;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.CreateProductBeeCow;
import com.beecow.actions.LoginBeeCowPage;

import common.CommonTestCase;

public class CreateProductBeeCowScripts extends CommonTestCase {

	ObjectPageJson.JsonData data;
	WebDriver driver;
	LoginBeeCowPage loginBeeCowPage;
	CreateProductBeeCow createProductBeeCowPage;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) throws Exception {
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BeeCow.json");

		data = getDataJson(pathFileJson);

		driver = openBrowser(browser, version, url);
		loginBeeCowPage = PageFactory.initElements(driver, LoginBeeCowPage.class);

		loginBeeCowPage.navigateToUrl(url);
		loginBeeCowPage.clickToLoginHome();
		loginBeeCowPage.inputToUsername(data.getLogInPageJson().getEmail());
		loginBeeCowPage.inputToPassword(data.getLogInPageJson().getPassword());
		createProductBeeCowPage = loginBeeCowPage.clickToLogin();
		createProductBeeCowPage.clickSalerLabel();
		Thread.sleep(3000);
	}

	@Parameters({ "url" })
	@BeforeMethod
	public void BeforeMethod(String url) {
		createProductBeeCowPage.navigateToCreateProduct(url + "/page/upload-product");
		createProductBeeCowPage.closePopUp();

	}

	//@Test
	public void TC08_selectSaler() {

		assertEquals(createProductBeeCowPage.getCurrentSalerPage(),
				data.getCreateProduct().getExpectedCurrentURLSallerPage());
	}

	//@Test
	public void TC09_allFieldEmpty() {
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		asserEqual(createProductBeeCowPage.getMessageEmptyName(), data.getCreateProduct().getExpectedEmptyName());
		asserEqual(createProductBeeCowPage.getMessageEmptyImage(), data.getCreateProduct().getExpectedEmptyImage());
		asserEqual(createProductBeeCowPage.getMessageEmptyCategory(),
				data.getCreateProduct().getExpectedEmptyCategory());
		asserEqual(createProductBeeCowPage.getMessageEmptyDescription(),
				data.getCreateProduct().getExpectedEmptyDescription());
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());

	}
	
	//@Test
	public void TC10_uploadImage() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		asserEqual(createProductBeeCowPage.getMessageEmptyName(), data.getCreateProduct().getExpectedEmptyName());
		asserEqual(createProductBeeCowPage.getMessageEmptyCategory(),
				data.getCreateProduct().getExpectedEmptyCategory());
		asserEqual(createProductBeeCowPage.getMessageEmptyDescription(),
				data.getCreateProduct().getExpectedEmptyDescription());
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());
		
	}
	
	//@Test
	public void TC11_randomProductName() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName()+ randomemail());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		asserEqual(createProductBeeCowPage.getMessageEmptyCategory(),
				data.getCreateProduct().getExpectedEmptyCategory());
		asserEqual(createProductBeeCowPage.getMessageEmptyDescription(),
				data.getCreateProduct().getExpectedEmptyDescription());
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());
		
	}
	
	
	//@Test
	public void TC12_selectCategory01() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyCategory(),
				data.getCreateProduct().getExpectedEmptyCategory());
		asserEqual(createProductBeeCowPage.getMessageEmptyDescription(),
				data.getCreateProduct().getExpectedEmptyDescription());
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());
		
	}
	
	//@Test
	public void TC13_selectCategory02() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyDescription(),
				data.getCreateProduct().getExpectedEmptyDescription());
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());
		
	}
	
	//@Test
	public void TC14_inputDescription() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());

		createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
		
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyNumber(), data.getCreateProduct().getExpectedEmptyNumber());
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());
		
	}
	
	//@Test
	public void TC15_inputQuanlityOfproduct() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
		createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
		createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyPrice(), data.getCreateProduct().getExpectedEmptyPrice());
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
	}
	
	//@Test
	public void TC16_inputPriceOfproduct() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
		createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
		createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
		createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedEmptyWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
	}
	
	//@Test
	public void TC17_inputLessThanRequireWeight() {
		createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
		createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
		createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
		createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
		createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
		createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
		createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
		createProductBeeCowPage.inputWeight(data.getCreateProduct().getWeightLessThanRequire());
		createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
		asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedInvalidWeight());
		asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
		asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
		asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
	}
	
	//@Test
		public void TC18_inputGreaterThanRequireWeight() {
			createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
			createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
			createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
			createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
			createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
			createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
			createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
			createProductBeeCowPage.inputWeight(data.getCreateProduct().getWeightGreaterThanRequire());
			createProductBeeCowPage.clickPostWithAllFieldsEmpty();
		
			asserEqual(createProductBeeCowPage.getMessageEmptyWeight(), data.getCreateProduct().getExpectedInvalidWeight());
			asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
			asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
			asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
		}
	
		//@Test
				public void TC19_inputMinWeight() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMinWeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
		
					asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC20_inputMaxWeight() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();

					asserEqual(createProductBeeCowPage.getMessageEmptyWidth(), data.getCreateProduct().getExpectedEmptyWidth());
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC21_inputWidthLessThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getWidthLessThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					
					asserEqual(createProductBeeCowPage.getMessageInvalidWidth(), data.getCreateProduct().getExpectedInvalidWidth());
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC22_inputWidthGreaterThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getWidthGreaterThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					
					asserEqual(createProductBeeCowPage.getMessageInvalidWidth(), data.getCreateProduct().getExpectedInvalidWidth());
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}

				
				//@Test
				public void TC23_inputMinWidth() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMinWidth());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC24_inputMaxWidth() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageEmptyLength(), data.getCreateProduct().getExpectedEmptyLength());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC25_inputLengthLessThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getLenghtLessThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageInvalidLength(), data.getCreateProduct().getExpectedInvalidLenght());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC26_inputLengthGreaterThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getLenghtGreaterThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageInvalidLength(), data.getCreateProduct().getExpectedInvalidLenght());
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC27_inputMinLength() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMinLength());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC28_inputMaxLength() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageEmptyHigh(), data.getCreateProduct().getExpectedEmptyHigh());	
				}
				
				//@Test
				public void TC29_inputHeightLessThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getHeightLessThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageInvalidHeight(), data.getCreateProduct().getExpectedInvalidHight());	
				}
				
				//@Test
				public void TC30_inputHeghtGreaterThanRequire() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getHeightGreaterThanRequire());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
				
					asserEqual(createProductBeeCowPage.getMessageInvalidHeight(), data.getCreateProduct().getExpectedInvalidHight());	
				}
				

				//@Test
				public void TC31_createProductSuccessfully() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					String randomName = data.getCreateProduct().getProductName()+ randomemail();
					createProductBeeCowPage.inputRandomProductName(randomName);
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.selectCategory03(data.getCreateProduct().getValueSelect03());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getMinHeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
					asserEqual(createProductBeeCowPage.getMessageCreateSuccess(), data.getCreateProduct().getCreateProductSuccess_msg());
					createProductBeeCowPage.clickViewProduct();
					assertEquals(createProductBeeCowPage.getProductName(randomName.toLowerCase()), randomName);
					
					assertTrue(createProductBeeCowPage.getPriceProduct(randomName.toLowerCase()).contains("8"));
					
				}
				
				//@Test
				public void TC_deleteProductCreated() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName()+ randomemail());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.selectCategory03(data.getCreateProduct().getValueSelect03());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getMinHeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
					asserEqual(createProductBeeCowPage.getMessageCreateSuccess(), data.getCreateProduct().getCreateProductSuccess_msg());
					createProductBeeCowPage.clickViewProduct();
		
					
				}
				
				//@Test
				public void TC32_createProductSuccessWithMaxHeight() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					String randomName = data.getCreateProduct().getProductName()+ randomemail();
					createProductBeeCowPage.inputRandomProductName(randomName);
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.selectCategory03(data.getCreateProduct().getValueSelect03());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getMaxHeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
					asserEqual(createProductBeeCowPage.getMessageCreateSuccess(), data.getCreateProduct().getCreateProductSuccess_msg());
					createProductBeeCowPage.clickViewProduct();
					assertEquals(createProductBeeCowPage.getProductName(randomName.toLowerCase()), randomName);
					assertTrue(createProductBeeCowPage.getPriceProduct(randomName.toLowerCase()).contains("8"));
				}
				
				@Test
				public void TC33_createProductSuccessWithSKU() throws Exception {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					String randomName = data.getCreateProduct().getProductName()+ randomemail();
					createProductBeeCowPage.inputRandomProductName(randomName);
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.selectCategory03(data.getCreateProduct().getValueSelect03());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputSUK(data.getCreateProduct().getSKU());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getMaxHeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
					asserEqual(createProductBeeCowPage.getMessageCreateSuccess(), data.getCreateProduct().getCreateProductSuccess_msg());
					createProductBeeCowPage.clickViewProduct();
					assertEquals(createProductBeeCowPage.getProductName(randomName.toLowerCase()), randomName);
					assertTrue(createProductBeeCowPage.getPriceProduct(randomName.toLowerCase()).contains("8"));
					createProductBeeCowPage.clickEditProduct(randomName.toLowerCase());
					
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("$('#name').val('')");
					Thread.sleep(2000);
					
					String randomEditedName = data.getCreateProduct().getEditedName()+ randomemail();
					
					createProductBeeCowPage.inputRandomProductName(randomEditedName);
					createProductBeeCowPage.clearSUK();
					createProductBeeCowPage.inputSUK(data.getCreateProduct().getEditedSKU());
					createProductBeeCowPage.clearDescription();
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getEditedDescription());
					createProductBeeCowPage.clearWeight();
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getEditedWeight());
					createProductBeeCowPage.clearWidth();
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getEditedWidth());
					createProductBeeCowPage.clearLength();
					createProductBeeCowPage.inputLength(data.getCreateProduct().getEditedLength());
					createProductBeeCowPage.clearHeght();
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getEditedHeight());
					createProductBeeCowPage.clickUpdate();
					createProductBeeCowPage.clickViewAfterEdit();
					createProductBeeCowPage.clickEdit_02();
					Thread.sleep(10000);
					String actualEditedName_msg = js.executeScript("return $('#name').val()").toString();
					Thread.sleep(1000);
					System.out.println(actualEditedName_msg);
					assertEquals(actualEditedName_msg, randomEditedName);
					//assertEquals(actual, expected);
					
				}
				
				//@Test
				public void TC34_editPageWithEmptyQuanlity() {
					createProductBeeCowPage.uploadImage("C:\\Users\\ngoctmphan\\image\\01.png");
					createProductBeeCowPage.inputRandomProductName(data.getCreateProduct().getProductName()+ randomemail());
					createProductBeeCowPage.selectCategory01(data.getCreateProduct().getValueSelect01());
					createProductBeeCowPage.selectCategory02(data.getCreateProduct().getValueSelect02());
					createProductBeeCowPage.selectCategory03(data.getCreateProduct().getValueSelect03());
					createProductBeeCowPage.inputDescription(data.getCreateProduct().getDescriptionProduct());
					createProductBeeCowPage.inputQuanlity(data.getCreateProduct().getQuanlityProduct());
					createProductBeeCowPage.inputPrice(data.getCreateProduct().getPriceProduct());
					createProductBeeCowPage.inputWeight(data.getCreateProduct().getMaxWeight());
					createProductBeeCowPage.inputWidth(data.getCreateProduct().getMaxWidth());
					createProductBeeCowPage.inputLength(data.getCreateProduct().getMaxLength());
					createProductBeeCowPage.inputHeght(data.getCreateProduct().getMinHeight());
					createProductBeeCowPage.clickPostWithAllFieldsEmpty();
					asserEqual(createProductBeeCowPage.getMessageCreateSuccess(), data.getCreateProduct().getCreateProductSuccess_msg());
					createProductBeeCowPage.clickViewProduct();
					
					
				}
	//@AfterClass
	public void AfterClass() {
		driver.quit();

	}
	

}
