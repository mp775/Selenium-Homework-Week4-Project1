package com.nopcommerce.pages.computer;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class WelComeSignInPage extends Utility {
    By welcomeSignIn = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutGuestBtn = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By firstNameWebEle = By.cssSelector("#BillingNewAddress_FirstName");
    By lastNameWebEle = By.cssSelector("#BillingNewAddress_LastName");
    By emailWebEle = By.cssSelector("#BillingNewAddress_Email");
    By countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityTextField = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressTextField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCodeTextField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberTextField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueBtn = By.xpath("//button[@onclick='Billing.save()']");
    String firstName;
    String lastName;
    String email;

    public String getWelcomeSignInText(){
        return getTextFromElement(welcomeSignIn);
    }

    public void clickOnCheckOutAsGuestButton(){
        clickOnElement(checkoutGuestBtn);
    }

    public String getFirstName(){
        firstName = getRandomString(4);
        return firstName;
    }

    public String getLastName(){
        lastName = getRandomString(8);
        return lastName ;
    }

    public String getEmail(){
        email = getRandomString(8)+"@gmail.com";
        return email;
    }

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

    public void fillCheckoutForm(){
        sendTextToElement(firstNameWebEle, getFirstName());
        sendTextToElement(lastNameWebEle, getLastName());
        sendTextToElement(emailWebEle, getEmail());
        selectCounrtyFromDropdown();
        enterCityName();
        enterAddress();
        enterPostcode();
        enterPhoneNumber();
    }

    public void clickOnContinueButton(){
        clickOnElement(continueBtn);
    }


}