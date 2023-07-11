package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    RegistrationPage registrationPage = new RegistrationPage();
    By welcomeSignIn = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerBtn = By.cssSelector(".button-1.register-button");
    By loginBtnHeader = By.cssSelector(".ico-login");
    By emailTextField = By.cssSelector("#Email");
    By passwordTextField = By.cssSelector("#Password");
    By loginBtn = By.cssSelector("button[class='button-1 login-button']");

    public String getWelcomeSignInText(){
        return getTextFromElement(welcomeSignIn);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerBtn);
    }

    public void clickOnLoginLinkButton(){
        clickOnElement(loginBtnHeader);
    }

    public void enterEmail(){
        sendTextToElement(emailTextField,registrationPage.email);
    }

    public void enterPassword(){
        sendTextToElement(passwordTextField,registrationPage.password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

}
