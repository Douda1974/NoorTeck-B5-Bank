package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressPage extends CommonUI {

	@FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[2]")
	WebElement addressesField;

	@FindBy(css = "a[data-test='create']")
	WebElement newAddressField;

	@FindBy(id = "address_first_name")
	WebElement firstNameField;

	@FindBy(id = "address_last_name")
	WebElement lastNameField;

	@FindBy(id = "address_street_address")
	WebElement address1Field;

	@FindBy(id = "address_secondary_address")
	WebElement address2Field;

	@FindBy(id = "address_city")
	WebElement cityField;

	@FindBy(id = "address_state")
	WebElement stateDropDown;

	@FindBy(id = "address_zip_code")
	WebElement zipCodeField;

	@FindBy(id = "address_country_us")
	WebElement countryRadioButton;

	@FindBy(id = "address_age")
	WebElement ageField;

	@FindBy(id = "address_website")
	WebElement websiteField;

	@FindBy(id = "address_phone")
	WebElement phoneField;

	@FindBy(id = "address_interest_dance")
	WebElement danceCheckBox;

	@FindBy(id ="address_note")
	WebElement noteField;
	
	@FindBy(name="commit")
	WebElement createAddressField;

	public AddressPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddress() {
		click(addressesField);
	}

	public void enterNewAddress(String address) {
		enter(newAddressField, address);
	}

	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterAddress1(String address1) {
		enter(address1Field, address1);
	}

	public void enterAddress2(String address2) {
		enter(address2Field, address2);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void chooseState(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropDown, methodName, indexTextValue);
	}

	public void enterZipCode(String zipCode) {
		enter(zipCodeField, zipCode);
	}

	public void enterCountry(String country) {
		enter(countryRadioButton, country);
	}

	public void enterAge(String age) {
		enter(ageField, age);
	}

	public void enterWebsite(String website) {
		enter(websiteField, website);
	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}

	public void enterInterest(String interest) {
		enter(danceCheckBox, interest);
	}

	public void enterNote(String note) {
		enter(noteField, note);
	}
	public void clickCreateAddress() {
		click(createAddressField);
	}
}
