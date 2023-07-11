package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityInCart = By.xpath("//input[starts-with(@id,'itemquantity')]");
    By productSubtotalInCart = By.cssSelector(".product-subtotal");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkoutBtn = By.xpath("//button[@id='checkout']");

    public void moveToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }

    public void moveToGoToCartAndClick(){
        scrollDown(driver, goToCart);
        clickOnElement(goToCart);
    }
    public String getShoppingCartTextFromElement(){
        return getTextFromElement(shoppingCartText);
    }

    public String getQuantityInCartWebElementText(){
        waitUntilVisibilityOfElementLocated(quantityInCart,30);
        return getTextFromElement(quantityInCart);
    }

    public String getProductSubtotalInCartWebElementText(){
        return getTextFromElement(productSubtotalInCart);
    }

    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfService);
    }

    public void clickOnCheckoutButton(){
        clickOnElement(checkoutBtn);
    }

}
