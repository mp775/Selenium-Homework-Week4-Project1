package com.nopcommerce.testsuit;

import com.nopcommerce.pages.computer.BuildComputerPage;
import com.nopcommerce.pages.computer.CheckoutPage;
import com.nopcommerce.pages.computer.ComputerDesktopPage;
import com.nopcommerce.pages.computer.WelComeSignInPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ComputerTest extends BaseTest {
    ComputerDesktopPage computerDesktopPage = new ComputerDesktopPage();
    BuildComputerPage buildComputerPage = new BuildComputerPage();
    ArrayList<String> beforeFilterProductNameList;
    ArrayList<String> afterFilterProductNameList;
    CheckoutPage checkoutPage = new CheckoutPage();
    WelComeSignInPage welComeSignInPage = new WelComeSignInPage();

    @Test
    public void verifyProductArrangeInAlphaBeticalOrder() {
        computerDesktopPage.clickOnComputerTab();
        computerDesktopPage.clickOnDesktopTab();
        beforeFilterProductNameList = computerDesktopPage.desktopProductListBeforeFilter();
        computerDesktopPage.selectShortByPositionZtoA();
        driver.navigate().refresh();
        afterFilterProductNameList = computerDesktopPage.desktopProductListAfterFilter();
        Assert.assertEquals(afterFilterProductNameList, beforeFilterProductNameList, "Product not displaying in alphabetical order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerDesktopPage.clickOnComputerTab();
        computerDesktopPage.clickOnDesktopTab();
        computerDesktopPage.selectShortByPositionAtoZ();
        Thread.sleep(3000);
        computerDesktopPage.addToCart();
        String expectedText = "Build your own computer";
        String actualText = buildComputerPage.getBuildOnYourComputerText();
        Assert.assertEquals(actualText, expectedText, "Build on your computer is not displayed");
        buildComputerPage.selectProcessorOption();
        buildComputerPage.selectRAMOption();
        buildComputerPage.selectHDDOption();
        buildComputerPage.selectOSOption();
        Thread.sleep(5000);
        buildComputerPage.selectSoftwareOption();
        Thread.sleep(3000);
        String expectedPrice = "$1,475.00";
        String actualPrice = buildComputerPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Price displayed incorrectly");
        buildComputerPage.clickOnAddToCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildComputerPage.getMessageProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage, "Message is not displayed");
        buildComputerPage.setClose();
        buildComputerPage.mouseHoverOnShoppingCartAndClick();
        String expectedShoppingCartText = "Shopping cart";
        String actualShoppingCartText = checkoutPage.getMessageShoppingCart();
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText, "Shopping cart text is not displayed");
        checkoutPage.changeQtyNumber();
        checkoutPage.clickOnUpdateShoppingCart();
        String expectedTotalPrice = "$2,950.00";
        String actualTotalPrice = checkoutPage.getTotalPrice();
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price is incorrect");
        checkoutPage.clickOnTermsOfServiceCheckBox();
        checkoutPage.clickOnCheckout();
        String expectedWelcomeMsg = "Welcome, Please Sign In!";
        String actualWelcomeMsg = welComeSignInPage.getWelcomeSignInText();
        Assert.assertEquals(actualWelcomeMsg, expectedWelcomeMsg, "Welcome Sign In message not displayed correctly");
        welComeSignInPage.clickOnCheckOutAsGuestButton();
        welComeSignInPage.fillCheckoutForm();
        welComeSignInPage.clickOnContinueButton();
        checkoutPage.clickOnShippingNextDayRadioButton();
        checkoutPage.clickOnContinueButtonShippingSection();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueButtonCreditCardSection();
        checkoutPage.selectCardTypeFromDropdown();
        checkoutPage.enterPaymentDetails();
        checkoutPage.clickOnContinueButtonOnPaymentInfoPage();
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = checkoutPage.getPaymentMethodTextFromWebElement();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Payment option text is incorrect");
        String expectedShippingMethod = "Next Day Air";
        String actualShippingMethod = checkoutPage.getShippingMethodTextFromWebElement();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Shipping option text is incorrect");
        String actualTotalPriceAtCheckout = checkoutPage.getTotalPriceAtCheckout();
        Assert.assertEquals(actualTotalPriceAtCheckout, "$2,950.00", "Total Price at Checkout displayed incorrectly");
        checkoutPage.clickOnConfirmButton();
        String actualThankYouMessage = checkoutPage.getThankYouTextFromWebElement();
        Assert.assertEquals(actualThankYouMessage, "Thank you", "Thank you text is not displayed");
        String expectedOrderNotification = "Your order has been successfully processed!";
        String actualOrderNotification = checkoutPage.getOrderNotification();
        Assert.assertEquals(actualOrderNotification, expectedOrderNotification, "Order notification is not displayed");
        checkoutPage.clickOnContinueButtonOnOrderCompletion();
        String expectedWelcomeToStoreNotification = "Welcome to our store";
        String actualWelcomeToStoreNotification = checkoutPage.getWelcomeToStoreTextFromWebElement();
        Assert.assertEquals(actualWelcomeToStoreNotification, expectedWelcomeToStoreNotification, "Welcome to Our Store notification is not displayed");
    }
}
