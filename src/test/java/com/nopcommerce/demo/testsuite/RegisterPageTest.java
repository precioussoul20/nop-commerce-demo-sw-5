package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Verify "Register" text
        Assert.assertEquals(registerPage.getRegisterText(),"Register", "Error");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        //Click on Register Link
        homePage.clickOnLoginLink();
        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //Verify the error message "First name is required."
        Assert.assertEquals(registerPage.getTextFromFirstName(), "First name is required.", "Error");
        //Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.getTextFromLastName(), "Last name is required.", "Error");
        //Verify the error message "Email is required."
        Assert.assertEquals(registerPage.getTextFromEmail(), "Email is required.", "Error");
        //Verify the error message "Password is required."
        Assert.assertEquals(registerPage.getTextFromPassword(), "Password is required.", "Error");
        //Verify the error message "Password is required
        Assert.assertEquals(registerPage.getTextFromConfirmPassword(), "Password is required.", "Error");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        //Click on Register Link
        homePage.clickOnLoginLink();
        //Select gender "Female"
        registerPage.genderRadioButton();
        //Enter firstname
        registerPage.enterFirstName("Priya");
        //Enter lastname
        registerPage.enterLastName("Shah");
        //Select day
        //Select month
        //Select year
        //Enter email
        registerPage.enterEmail("priya123@gmail.com");
        //Enter password
        registerPage.enterPassword("priya321");
        //Enter Confirm Password
        registerPage.enterConfirmPassword("priya321");
        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //Verify message "Your registration completed"
        Assert.assertEquals(registerPage.getRegisterText(), "Your registration completed", "Error");
    }
}
