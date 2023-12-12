package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleGenderRadioButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement registerPageEmailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement registerPagePasswordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement registerPageConfirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "Your registration completed")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameText;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameText;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailText;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordText;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordText;


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void genderRadioButton() {
        clickOnElement(femaleGenderRadioButton);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(registerPageEmailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(registerPagePasswordField, password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(registerPageConfirmPasswordField, password);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterText() {
        String actualText = getRegisterText();
        return actualText;
    }
    public String getTextFromFirstName() {
        return getTextFromElement(firstNameText);
    }
    public String getTextFromLastName() {
        return getTextFromElement(lastNameText);
    }
    public String getTextFromEmail() {
        return getTextFromElement(emailText);
    }
    public String getTextFromPassword() {
        return getTextFromElement(passwordText);
    }
    public String getTextFromConfirmPassword() {
        return getTextFromElement(confirmPasswordText);
    }
}
