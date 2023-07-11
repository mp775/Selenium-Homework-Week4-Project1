package com.nopcommerce.pages.computer;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class BuildComputerPage extends Utility {

    By buildOnYourComputer = (By.xpath("//h1[contains(text(),'Build your own computer')]"));
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By software = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.cssSelector("#price-value-1");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By prodAddMessage = By.xpath("//p[@class='content']");
    By close = By.xpath("//span[@title='Close']");
    By shoppingCart1 = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");


    public String getBuildOnYourComputerText() {
        return getTextFromElement(buildOnYourComputer);
    }

    public void selectProcessorOption() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");

    }

    public void selectRAMOption() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");

    }

    public void selectHDDOption() {
        clickOnElement(hdd);
    }

    public void selectOSOption() {
        clickOnElement(os);
    }

    public void selectSoftwareOption() {
        clickOnElement(software);
    }

    public String getPrice() {
        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getMessageProductHasBeenAddedToYourShoppingCart() {
        return getTextFromElement(prodAddMessage);

    }

    public void setClose() {
        clickOnElement(close);
    }

    public void mouseHoverOnShoppingCartAndClick() {
        mouseHoverToElement(shoppingCart1);
        scrollDown(driver, goToCart);
        clickOnElement(goToCart);
    }
}



