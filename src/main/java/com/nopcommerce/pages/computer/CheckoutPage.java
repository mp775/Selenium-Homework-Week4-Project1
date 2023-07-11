package com.nopcommerce.pages.computer;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By shoppingCartText = (By.xpath("//h1[normalize-space()='Shopping cart']"));
    By quantity = By.xpath("//td[@class='quantity']/input");
    By update = By.xpath("//button[@id='updatecart']");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By checkBoxAgree = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By shippingNexDayRadioBtn = By.cssSelector("#shippingoption_1");
    By continueBtnShippingMethod = By.cssSelector(".button-1.shipping-method-next-step-button");
    By creditCardRatioBtn = By.cssSelector("#paymentmethod_1");
    By continueBtnCreditCardMethod = By.cssSelector("button[class='button-1 payment-method-next-step-button']");
    By creditCardDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameTextField = By.xpath("//input[@id='CardholderName']");
    By cardNumberTextField = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueBtnPaymentInfo = By.cssSelector(".button-1.payment-info-next-step-button");
    By paymentMethodWebEle = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodWebEle = By.xpath("//span[normalize-space()='Next Day Air']");
    By totalPriceAtCheckout = By.cssSelector(".product-subtotal");
    By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouWebEle = By.xpath("//h1[normalize-space()='Thank you']");
    By orderNotification = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueBtnOrderCompleted = By.cssSelector(".button-1.order-completed-continue-button");
    By welcomeToStoreWebEle = By.cssSelector("div[class='topic-block-title'] h2");

    public String getMessageShoppingCart() {
        return getTextFromElement(shoppingCartText);

    }

    public void changeQtyNumber(){
        clearWebElementText(quantity);
        sendTextToElement(quantity,"2");
    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(update);
    }
    public String getTotalPrice(){
       return getTextFromElement(totalPrice);

    }
    public void clickOnCheckout(){
        clickOnElement(checkOut);
    }

    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(checkBoxAgree);
    }

    public void clickOnShippingNextDayRadioButton(){
        clickOnElement(shippingNexDayRadioBtn);
    }

    public void clickOnContinueButtonShippingSection(){
        clickOnElement(continueBtnShippingMethod);
    }

    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRatioBtn);
    }

    public void clickOnContinueButtonCreditCardSection(){
        clickOnElement(continueBtnCreditCardMethod);
    }

    public void selectCardTypeFromDropdown(){
        selectByVisibleTextFromDropDown(creditCardDropdown, "Master card");
    }

    public void enterCardHolderName(){
        sendTextToElement(cardHolderNameTextField, "Raj Patel");
    }

    public void enterCardNumber(){
        sendTextToElement(cardNumberTextField, "5555555555554444");
    }

    public void selectExpireMonth(){
        selectByVisibleTextFromDropDown(expireMonth, "09");
    }

    public void selectExpireYear(){
        selectByVisibleTextFromDropDown(expireYear, "2025");
    }

    public void enterCardCode(){
        sendTextToElement(cardCode, "123");
    }

    public void enterPaymentDetails(){
        enterCardHolderName();
        enterCardNumber();
        selectExpireMonth();
        selectExpireYear();
        enterCardCode();
    }

    public void clickOnContinueButtonOnPaymentInfoPage(){
        clickOnElement(continueBtnPaymentInfo);
    }

    public String getPaymentMethodTextFromWebElement(){
        return getTextFromElement(paymentMethodWebEle);
    }

    public String getShippingMethodTextFromWebElement(){
        return getTextFromElement(shippingMethodWebEle);
    }

    public String getTotalPriceAtCheckout(){
        return getTextFromElement(totalPriceAtCheckout);
    }

    public void clickOnConfirmButton(){
        clickOnElement(confirmBtn);
    }
    public String getThankYouTextFromWebElement(){
        return getTextFromElement(thankYouWebEle);
    }

    public String getOrderNotification(){
        return getTextFromElement(orderNotification);
    }

    public void clickOnContinueButtonOnOrderCompletion(){
        clickOnElement(continueBtnOrderCompleted);
    }

    public String getWelcomeToStoreTextFromWebElement(){
        return getTextFromElement(welcomeToStoreWebEle);
    }
}
