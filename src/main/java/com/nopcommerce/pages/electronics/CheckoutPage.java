package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityTextField = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressTextField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCodeTextField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberTextField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueBtn = By.xpath("//button[@onclick='Billing.save()']");
    By secondDayShippingRadioBtn = By.cssSelector("#shippingoption_2");
    By continueBtnShipping = By.cssSelector(".button-1.shipping-method-next-step-button");
    By creditCardRadioBtn = By.cssSelector("#paymentmethod_1");
    By continueBtnPayment = By.cssSelector("button[class='button-1 payment-method-next-step-button']");
    By creditCardDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameTextField = By.xpath("//input[@id='CardholderName']");
    By cardNumberTextField = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueBtnPaymentInfo = By.cssSelector(".button-1.payment-info-next-step-button");
    By paymentMethodWebEle = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodWebEle = By.xpath("//span[normalize-space()='2nd Day Air']");
    By totalPriceAtCheckout = By.cssSelector(".product-subtotal");
    By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouWebEle = By.xpath("//h1[normalize-space()='Thank you']");
    By orderNotification = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueBtnOrderCompleted = By.cssSelector(".button-1.order-completed-continue-button");
    By welcomeToStoreWebEle = By.cssSelector("div[class='topic-block-title'] h2");
    By logOutBtn = By.cssSelector(".ico-logout");




    public void selectCounrtyFromDropdown(){
        selectByVisibleTextFromDropDown(countryDropdown, "United Kingdom");
    }

    public void enterCityName(){
        sendTextToElement(cityTextField, "London");
    }

    public void enterAddress(){
        sendTextToElement(addressTextField, "101 Repton Street");
    }

    public void enterPostcode(){
        sendTextToElement(postCodeTextField, "BR5 1AB");
    }

    public void enterPhoneNumber(){
        sendTextToElement(phoneNumberTextField, "07122234554");
    }

    public void clickOnContinueButton(){
        clickOnElement(continueBtn);
    }

    public void clickOnSecondDayShippingRadioButton(){
        clickOnElement(secondDayShippingRadioBtn);
    }

    public void clickOnContinueButtonOnShippingSection(){
        clickOnElement(continueBtnShipping);
    }

    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioBtn);
    }

    public void clickOnContinueButtonOnPaymentSection(){
        clickOnElement(continueBtnPayment);
    }

    public void selectCardTypeFromDropdown(){
        selectByVisibleTextFromDropDown(creditCardDropdown, "Visa");
    }

    public void enterCardHolderName(){
        sendTextToElement(cardHolderNameTextField, "Raj Patel");
    }

    public void enterCardNumber(){
        sendTextToElement(cardNumberTextField, "4111 1111 1111 1111");
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

    public void clickOnLogOutButton(){
        clickOnElement(logOutBtn);
    }

}
