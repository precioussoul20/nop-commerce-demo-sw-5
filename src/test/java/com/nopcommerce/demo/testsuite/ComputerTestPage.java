package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerTestPage extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    }
    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        //Click on Computer tab
        homePage.clickOnLoginLink();
        //Verify "Computer" text
        Assert.assertTrue(loginPage.getWelcomeText().contains("Computer"), "Error");
        
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //Click on Computer tab
        homePage.clickOnLoginLink();
        //Click on Desktops link
        loginPage.enterEmailId("priya@123@gmail.com");
        loginPage.enterPassword("Tester");
        loginPage.clickOnLoginButton();
        //Verify "Desktops" text
        Assert.assertEquals(loginPage.getErrorMessage(), "Desktops","Error");
    }

    @Test(groups = {"regression"}, dataProvider = "DATA SET", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor,
                                                                                    String ram, String hdd, String os, String software){
        //Click on Computer tab
        homePage.clickOnLoginLink();
        //Click on Desktops link
        computerPage.desktopClick();
        //Click on product name "Build your own computer"
        computerPage.clickOnBuildYourComputer();
        //Select processor "processor"
        buildYourOwnComputerPage.selectProcessor();
        //Select RAM "ram"
        buildYourOwnComputerPage.selectRAM();
        //Select HDD "hdd"
        buildYourOwnComputerPage.selectHDD();
        //Select OS "os"
        buildYourOwnComputerPage.selectOS();
        //Select Software "software"
        buildYourOwnComputerPage.selectMicrosoftOffice();
        //Click on "ADD TO CART" Button
        buildYourOwnComputerPage.addToCartButtonClick();
        //Verify message "The product has been added to your shopping cart"
        Assert.assertTrue(buildYourOwnComputerPage.shoppingCartMessage().contains("The product has been added to your shopping cart"), "Error");
    }
}
