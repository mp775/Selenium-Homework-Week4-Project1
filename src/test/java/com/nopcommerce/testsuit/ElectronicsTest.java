package com.nopcommerce.testsuit;

import com.nopcommerce.pages.electronics.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    HomePage homePage = new HomePage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        cellPhonesPage.mouseHoverOnElectronicsTab();
        cellPhonesPage.mouseHoverAndClickOnCellPhonesTab();
        String expectedProductCategoryText = "Cell phones";
        String actualProductCategoryText = cellPhonesPage.getCellPhonesText();
        Assert.assertEquals(actualProductCategoryText, expectedProductCategoryText, "Cell phones text is not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        cellPhonesPage.mouseHoverOnElectronicsTab();
        cellPhonesPage.mouseHoverAndClickOnCellPhonesTab();
        String expectedProductCategoryText = "Cell phones";
        String actualProductCategoryText = cellPhonesPage.getCellPhonesText();
        Assert.assertEquals(actualProductCategoryText, expectedProductCategoryText, "Cell phones text is not displayed");
        cellPhonesPage.clickOnListViewTab();
        cellPhonesPage.clickOnSpecificProduct();
        String expectedProductName = "Nokia Lumia 1020";
        String actualProductName = cellPhonesPage.getProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name is not displayed");
        String actualProductPrice = cellPhonesPage.getProductPrice();
        Assert.assertEquals(actualProductPrice, "$349.00", "Product price displayed incorrectly");
        cellPhonesPage.changeQuantity();
        cellPhonesPage.clickOnAddToCartButton();
        String expectedProductAddedNotificationMsg = "The product has been added to your shopping cart";
        String actualProductAddedNotificationMsg = cellPhonesPage.getProductAddedNotification();
        Assert.assertEquals(actualProductAddedNotificationMsg, expectedProductAddedNotificationMsg, "Product added message not displayed correctly");
        cellPhonesPage.clickOnCloseButton();
        shoppingCartPage.moveToShoppingCart();
        shoppingCartPage.moveToGoToCartAndClick();
        String expectedCartTitle = "Shopping cart";
        String actualCartTitle = shoppingCartPage.getShoppingCartTextFromElement();
        Assert.assertEquals(actualCartTitle, expectedCartTitle, "Cart title is not displayed correctly");
        String actualQuantityInCart = shoppingCartPage.getQuantityInCartWebElementText();
        Assert.assertEquals(actualQuantityInCart, "2", "Quantity displayed incorrectly in the Cart");
        String actualProductSubtotalInCart = shoppingCartPage.getProductSubtotalInCartWebElementText();
        Assert.assertEquals(actualProductSubtotalInCart, "$698.00", "Product Subtotal displayed incorrectly");
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckoutButton();
        String expectedWelcomeMsg = "Welcome, Please Sign In!";
        String actualWelcomeMsg = loginPage.getWelcomeSignInText();
        Assert.assertEquals(actualWelcomeMsg, expectedWelcomeMsg, "Welcome Sign In message not displayed correctly");
        loginPage.clickOnRegisterButton();
        String actualRegisterText = registrationPage.getRegisterTextFromWebElement();
        Assert.assertEquals(actualRegisterText, "Register", "Register text is not displayed");
        registrationPage.fillRegistrationForm();
        registrationPage.clickOnRegisterButton();
        String expectedRegCompletedMsg = "Your registration completed";
        String actualRegCompletedMsg = registrationPage.getRegistrationCompletedWebEleText();
        Assert.assertEquals(actualRegCompletedMsg, expectedRegCompletedMsg, "Register Completed message is not displayed");
        registrationPage.clickOnContinueButton();
        loginPage.clickOnLoginLinkButton();
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckoutButton();
        checkoutPage.selectCounrtyFromDropdown();
        checkoutPage.enterCityName();
        checkoutPage.enterAddress();
        checkoutPage.enterPostcode();
        checkoutPage.enterPhoneNumber();
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnSecondDayShippingRadioButton();
        checkoutPage.clickOnContinueButtonOnShippingSection();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueButtonOnPaymentSection();
        checkoutPage.selectCardTypeFromDropdown();
        checkoutPage.enterPaymentDetails();
        checkoutPage.clickOnContinueButtonOnPaymentInfoPage();
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = checkoutPage.getPaymentMethodTextFromWebElement();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Payment option text is incorrect");
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = checkoutPage.getShippingMethodTextFromWebElement();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Shipping option text is incorrect");
        String actualTotalPriceAtCheckout = checkoutPage.getTotalPriceAtCheckout();
        Assert.assertEquals(actualTotalPriceAtCheckout, "$698.00", "Total Price at Checkout displayed incorrectly");
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
        checkoutPage.clickOnLogOutButton();
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = homePage.getUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Wrong URL displayed");
    }
}
