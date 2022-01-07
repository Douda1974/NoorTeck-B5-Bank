package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(id = "user_email")
	WebElement userEmail;
	@FindBy(id = "user_password")
	WebElement passwordField;
	@FindBy(css = ".btn.btn-primary")
	WebElement signUpButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	    }
		public void enterEmail(String email) {	
		enter(userEmail, email);
		}
		public void enterPassword(String userPassword) {
		enter(passwordField, userPassword);
		}
		public void clickSignUp() {
		click(signUpButton);
		
		}
		
	}


