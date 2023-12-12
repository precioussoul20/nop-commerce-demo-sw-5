package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath="//select[@id='products-orderby']")
    WebElement sortDesktopsPage;
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourComputer;

    public void desktopClick() {
        clickOnElement(desktop);
    }
    public void clickOnBuildYourComputer(){
        clickOnElement(buildYourComputer);
    }
}
