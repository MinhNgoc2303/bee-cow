package com.beecow.actions;

import org.openqa.selenium.WebDriver;

import com.beecow.ui.CreateBeeCowPageUI;

import common.CommonFunctions;

public class CreateProductBeeCow extends CommonFunctions{

	public CreateProductBeeCow(WebDriver driver) {
		super(driver);
	}
	public void navigateToCreateProduct(String url ) {
		navigateToUrl(url);
	}
	
	public void clickSalerLabel() {
		waitForElementVisible(CreateBeeCowPageUI.SELLER_LBL);
		clickToElement(CreateBeeCowPageUI.SELLER_LBL);
	}
	
	public String getCurrentSalerPage() {
		return getCurrentUrl();
	}
	
	public void closePopUp( ) {
		waitForElementVisible(CreateBeeCowPageUI.POPUP);
		waitForElementVisible(CreateBeeCowPageUI.CLOSEPOPUP_BTN);
		clickToElement(CreateBeeCowPageUI.CLOSEPOPUP_BTN);
		
	}
	public void clickPostWithAllFieldsEmpty() {
		waitForElementVisible(CreateBeeCowPageUI.POST_BTN);
		clickToElement(CreateBeeCowPageUI.POST_BTN);
	}

	
	public void clickContentUp() {
		waitForElementVisible(CreateBeeCowPageUI.CONTENTUP_LBL);
		clickToElement(CreateBeeCowPageUI.CONTENTUP_LBL);
	}
	
	public String getMessageEmptyImage() {
		waitForElementVisible(CreateBeeCowPageUI.SELECTIMAGE_MSG);
		return getTextElement(CreateBeeCowPageUI.SELECTIMAGE_MSG);
	}
	
	public String getMessageEmptyName() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYNAME_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYNAME_MSG);
	}
	
	public String getMessageEmptyCategory() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYCATEGORY_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYCATEGORY_MSG);
	}
	
	public String getMessageEmptyDescription() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYDESCRIPTION_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYDESCRIPTION_MSG);
	}
	
	public String getMessageEmptyNumber() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYNUMBER_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYNUMBER_MSG);
	}
	
	public String getMessageEmptyPrice() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYPRICE_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYPRICE_MSG);
	}
	
	public String getMessageEmptyWeight() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYWEIGHT_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYWEIGHT_MSG);
	}
	
	public String getMessageEmptyWidth() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYWIDTH_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYWIDTH_MSG);
	}
	
	public String getMessageEmptyLength() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYLENGTH_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYLENGTH_MSG);
	}
	
	public String getMessageEmptyHigh() {
		waitForElementVisible(CreateBeeCowPageUI.EMPTYHIGH_MSG);
		return getTextElement(CreateBeeCowPageUI.EMPTYHIGH_MSG);
	}
	
	public void uploadImage(String value) {
//		waitForElementVisible(CreateBeeCowPageUI.UPLOADIMAGE);
		uploadBySendKeys(CreateBeeCowPageUI.UPLOADIMAGE, value);
	}
	
	public void inputRandomProductName(String value) {
		waitForElementVisible(CreateBeeCowPageUI.PRODUCTNAME_TXT);
		inputElement(CreateBeeCowPageUI.PRODUCTNAME_TXT, value);
	}

	
	
	public void inputDescription(String value) {
		waitForElementVisible(CreateBeeCowPageUI.DESCRIPTION_TXT);
		inputElement(CreateBeeCowPageUI.DESCRIPTION_TXT, value);
	}
	
	public void inputQuanlity(String value) {
		waitForElementVisible(CreateBeeCowPageUI.QUANLITY_TXT);
		inputElement(CreateBeeCowPageUI.QUANLITY_TXT, value);
	}
	
	public void inputPrice(String value) {
		waitForElementVisible(CreateBeeCowPageUI.PRICE_TXT);
		inputElement(CreateBeeCowPageUI.PRICE_TXT, value);
	}
	
	public void inputWeight(String value) {
		waitForElementVisible(CreateBeeCowPageUI.WEIGHT_TXT);
		inputElement(CreateBeeCowPageUI.WEIGHT_TXT, value);
	}
	public void inputWidth(String value) {
		waitForElementVisible(CreateBeeCowPageUI.WIDTH_TXT);
		inputElement(CreateBeeCowPageUI.WIDTH_TXT, value);
	}
	
	public void inputLength(String value) {
		waitForElementVisible(CreateBeeCowPageUI.LENGTH_TXT);
		inputElement(CreateBeeCowPageUI.LENGTH_TXT, value);
	}
	
	public void inputHeght(String value) {
		waitForElementVisible(CreateBeeCowPageUI.HIGHT_TXT);
		inputElement(CreateBeeCowPageUI.HIGHT_TXT, value);
	}
	
	public void selectCategory01(String valueSelect) {
		waitForElementVisible(CreateBeeCowPageUI.DROPDOWN_CATEGORY01);
		selectComboboxSpecial(CreateBeeCowPageUI.DROPDOWN_CATEGORY01, CreateBeeCowPageUI.LISTCATEGORY01_LBL, valueSelect);
	}
	
	public void selectCategory02(String valueSelect) {
		waitForElementVisible(CreateBeeCowPageUI.DROPDOWN_CATEGORY02);
		selectComboboxSpecial(CreateBeeCowPageUI.DROPDOWN_CATEGORY02, CreateBeeCowPageUI.LISTCATEGORY02_LBL, valueSelect);
	}
	
	public void selectCategory03(String valueSelect) {
		waitForElementVisible(CreateBeeCowPageUI.DROPDOWN_CATEGORY03);
		selectComboboxSpecial(CreateBeeCowPageUI.DROPDOWN_CATEGORY03, CreateBeeCowPageUI.LISTCATEGORY03_LBL, valueSelect);
	}
	
	public String getMessageInvalidWidth() {
		waitForElementVisible(CreateBeeCowPageUI.EXPECTEDINVALIDWIDTH_MSG);
		return getTextElement(CreateBeeCowPageUI.EXPECTEDINVALIDWIDTH_MSG);
	}
	
	public String getMessageInvalidLength() {
		waitForElementVisible(CreateBeeCowPageUI.EXPECTEDINVALIDLENGHT_MSG);
		return getTextElement(CreateBeeCowPageUI.EXPECTEDINVALIDLENGHT_MSG);
	}
	
	public String getMessageInvalidHeight() {
		waitForElementVisible(CreateBeeCowPageUI.EXPECTEDINVALIDHEIGHT_MSG);
		return getTextElement(CreateBeeCowPageUI.EXPECTEDINVALIDHEIGHT_MSG);
	}
	
	public void clickViewProduct( ) {
		waitForElementVisible(CreateBeeCowPageUI.VIEWLISTPRODUCT_BTN);
		clickToElement(CreateBeeCowPageUI.VIEWLISTPRODUCT_BTN);
	}
	
	public String getMessageCreateSuccess() {
		waitForElementVisible(CreateBeeCowPageUI.SUBMITSUCCESS_LBL);
		return getTextElement(CreateBeeCowPageUI.SUBMITSUCCESS_LBL);
	}
	
	public void inputSUK(String value) {
		waitForElementVisible(CreateBeeCowPageUI.SKU_TXT);
		inputElement(CreateBeeCowPageUI.SKU_TXT, value);
	}
	
	public void clickEditProduct(String dynamic) {
		waitForDynamicElementVisible(CreateBeeCowPageUI.EDIT_BTN, dynamic);
		clickToDynamicElement(CreateBeeCowPageUI.EDIT_BTN, dynamic);
	}
	
	public String getProductName(String dynamic) {
		waitForDynamicElementVisible(CreateBeeCowPageUI.EXPECTEDNAMEPRODUCT, dynamic);
		return getTextDynamicElement(CreateBeeCowPageUI.EXPECTEDNAMEPRODUCT, dynamic);
	}
	
	public String getPriceProduct(String dynamic) {
		waitForDynamicElementVisible(CreateBeeCowPageUI.EXPECTEDPRICE, dynamic);
		return getTextDynamicElement(CreateBeeCowPageUI.EXPECTEDPRICE, dynamic);
	}
	
	public void clearName() {
		waitForElementVisible(CreateBeeCowPageUI.PRODUCTNAME_TXT);
		clearElement(CreateBeeCowPageUI.PRODUCTNAME_TXT);
	}
	
	public void clearDescription () {
		waitForElementVisible(CreateBeeCowPageUI.DESCRIPTION_TXT);
		clearElement(CreateBeeCowPageUI.DESCRIPTION_TXT);
	}
	
	public void clearWeight() {
		waitForElementVisible(CreateBeeCowPageUI.WEIGHT_TXT);
		clearElement(CreateBeeCowPageUI.WEIGHT_TXT);
	}
	public void clearWidth() {
		waitForElementVisible(CreateBeeCowPageUI.WIDTH_TXT);
		clearElement(CreateBeeCowPageUI.WIDTH_TXT);
	}
	
	public void clearLength() {
		waitForElementVisible(CreateBeeCowPageUI.LENGTH_TXT);
		clearElement(CreateBeeCowPageUI.LENGTH_TXT);
	}
	
	public void clearHeght() {
		waitForElementVisible(CreateBeeCowPageUI.HIGHT_TXT);
		clearElement(CreateBeeCowPageUI.HIGHT_TXT);
	}
	
	public void clearSUK() {
		waitForElementVisible(CreateBeeCowPageUI.SKU_TXT);
		clearElement(CreateBeeCowPageUI.SKU_TXT);
	}
	
	public void editQuanlity() {
		waitForElementVisible(CreateBeeCowPageUI.EDITPEN_ICON);
		clickToElement(CreateBeeCowPageUI.EDITPEN_ICON);
	}
	 
	public void clickUpdate() {
		waitForElementVisible(CreateBeeCowPageUI.EDITEDSUBMIT_BTN);
		clickToElement(CreateBeeCowPageUI.EDITEDSUBMIT_BTN);
	}
	
	public void clickViewAfterEdit() {
		waitForElementVisible(CreateBeeCowPageUI.VIEWAFTEREDIT_BTN);
		clickToElement(CreateBeeCowPageUI.VIEWAFTEREDIT_BTN);
	}
	
	public void clickEdit_02() {
		waitForElementVisible(CreateBeeCowPageUI.EDIT02_BTN);
		clickToElement(CreateBeeCowPageUI.EDIT02_BTN);
	}
	
	public String getEditedSKU() {
		waitForElementVisible(CreateBeeCowPageUI.EDIT02_BTN);
		return null;
	
	}
	
}