package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {
    By registerWebElementText = By.cssSelector("div[class='page-title'] h1");
    By firstNameWebEle = By.cssSelector("#FirstName");
    By lastNameWebEle = By.cssSelector("#LastName");
    By emailWebEle = By.cssSelector("#Email");
    By passwordWebEle = By.cssSelector("#Password");
    By confirmPasswordWebEle = By.cssSelector("#ConfirmPassword");
    By registerBtn = By.cssSelector("#register-button");
    By registrationCompletedMsgWebEel = By.cssSelector(".result");
    By continueBtn = By.cssSelector(".button-1.register-continue-button");


    String firstName;
    String lastName;
    String email;
    String password;

    public String getRegisterTextFromWebElement(){
        return getTextFromElement(registerWebElementText);
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

    public String getPassword(){
        password = getRandomString(8);
        return password ;
    }

    public void fillRegistrationForm(){
        sendTextToElement(firstNameWebEle, getFirstName());
        sendTextToElement(lastNameWebEle, getLastName());
        sendTextToElement(emailWebEle, getEmail());
        sendTextToElement(passwordWebEle, getPassword());
        sendTextToElement(confirmPasswordWebEle, password);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerBtn);
    }

    public String getRegistrationCompletedWebEleText(){
        return getTextFromElement(registrationCompletedMsgWebEel);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueBtn);
    }

}
