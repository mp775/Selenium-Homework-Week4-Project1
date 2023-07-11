package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class CellPhonesPage extends Utility {
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhonesTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellPhoneProductCategory = (By.xpath("//h1[normalize-space()='Cell phones']"));
    By listViewTab = By.cssSelector("a[title='List']");
    By specificProduct = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By productName = By.cssSelector("div[class='product-name'] h1");
    By price = By.cssSelector("#price-value-20");
    By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartBtn = By.cssSelector("#add-to-cart-button-20");
    By productAddedNotification = By.cssSelector(".content");
    By closeBtn = By.cssSelector("span[title='Close']");


    public void mouseHoverOnElectronicsTab() {
        mouseHoverToElement(electronicsTab);
    }

    public void mouseHoverAndClickOnCellPhonesTab() {
        mouseHoverToElementAndClick(cellPhonesTab);
    }

    public String getCellPhonesText() {
        return getTextFromElement(cellPhoneProductCategory);
    }

    public void clickOnListViewTab(){
        waitUntilVisibilityOfElementLocated(listViewTab,30);
        clickOnElement(listViewTab);
    }

    public void clickOnSpecificProduct(){
        for (int retry = 0; retry < 3; retry++) {
            try {
                clickOnElement(specificProduct);
            } catch (StaleElementReferenceException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public String getProductName(){
        return getTextFromElement(productName);
    }

    public String getProductPrice(){
        return getTextFromElement(price);
    }

    public void changeQuantity(){
        waitUntilVisibilityOfElementLocated(quantity,30);
        clearWebElementText(quantity);
        sendTextToElement(quantity,"2");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartBtn);
    }

    public String getProductAddedNotification(){
        return getTextFromElement(productAddedNotification);
    }

    public void clickOnCloseButton(){
        clickOnElement(closeBtn);
    }


}
