package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTitleLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_1")
    WebElement processorDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_2")
    WebElement ramDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_3_7")
    WebElement hddRadioButtonLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_4_9")
    WebElement osRadioButtonLocator;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_attribute_5_10'])[1]")
    WebElement msOfficeCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_attribute_5_12'])[1]")
    WebElement totalCommanderCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//span[@id='price-value-1'])[1]")
    WebElement priceTotalLocator;

    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;

    @CacheLookup
    @FindBy(css=".content")
    WebElement messageConfirmationLocator;

    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement crossToCloseLocator;


    public String getTextFromBuildYourOwnComputer() {
        return getTextFromElement(buildYourOwnComputerTitleLocator);

    }

    public void selectProcessor(){
        selectByIndexFromDropDown(processorDropdownLocator, 1);

    }
    public void selectRAM(){
        selectByIndexFromDropDown(ramDropdownLocator, 3);

    }
    public void selectHDD()
    {
        clickOnElement(hddRadioButtonLocator);
    }

    public void selectOS()
    {
        clickOnElement(osRadioButtonLocator);
    }

    public void selectMicrosoftOffice() {
        WebElement element = driver.findElement(By.cssSelector("#product_attribute_5_10"));
        if (!element.isSelected()) {
            clickOnElement(msOfficeCheckBoxLocator);
        }
    }
    public void selectTotalCommander(){
        clickOnElement(totalCommanderCheckBoxLocator);
    }

    public String checkTotalPrice(){
        return getTextFromElement(priceTotalLocator);
    }

    public void addToCartButtonClick(){
        clickOnElement(addToCartButton1Locator);

    }

    public String shoppingCartMessage(){
        return getTextFromElement(messageConfirmationLocator);

    }

    public void crossBarClick(){
        clickOnElement(crossToCloseLocator);
    }
}
