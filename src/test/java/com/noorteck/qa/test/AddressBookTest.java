package com.noorteck.qa.test;

import java.util.concurrent.TimeUnit;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://a.testaddressbook.com/sign_up";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddressBookTest.signUpTest();
		CommonUI.quitBrowser();
		
		String url1 = "http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url1);
		initializeClassObj();
		AddressBookTest.signInTest();
		CommonUI.quitBrowser();
		
		String url3 = "http://a.testaddressbook.com/";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url3);
		initializeClassObj();
		AddressBookTest.homePageTest();
		CommonUI.quitBrowser();
		
		String url2 = "http://a.testaddressbook.com/addresses";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url2);
		initializeClassObj();
		AddressBookTest.addressPageTest();
		CommonUI.quitBrowser();
		
		
	}

	public static void signUpTest() {
		signUpObj.enterEmail("JohnCena123@gmail.com");
		signUpObj.enterPassword("Cena123");
		signUpObj.clickSignUp();
	}

	public static void signInTest() {
		signInObj.clickSignIn();
		signInObj.enterEmail("JohnCe123@gmail.com");
		signInObj.enterPassword("Cena@123");
		signInObj.clickSignIn();
	}

	public static void homePageTest() {

		homePageObj.clickHomeButton();
		homePageObj.clickSignOut();
		homePageObj.clickAddresses();
		homePageObj.welcomeTitle();

	}

	public static void addressPageTest() {
		
		addressPageObj.clickAddress();
		addressPageObj.enterNewAddress("2415 java street");
		addressPageObj.enterFirstName("John");
		addressPageObj.enterLastName("Cena");
		addressPageObj.enterAddress1("1215 Selenium rd");
		addressPageObj.enterAddress2("unit 1213");
		addressPageObj.enterCity("Ashburn");
		addressPageObj.chooseState("value", "VA");
		addressPageObj.enterCountry("US");
		addressPageObj.enterAge("25");
		addressPageObj.enterWebsite("addressBook.com");
		addressPageObj.enterPhone("234.765.8765");
		addressPageObj.enterInterest("dancing");
		addressPageObj.enterNote("Hello");
		addressPageObj.clickCreateAddress();
	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
