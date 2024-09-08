package org.cbs.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static org.cbs.qa.pages.Locators.*;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void goToLoginPage() throws IOException {
        driver.get(EndPoints.URL_LOGIN);
    }

    public void userEnterInEmailAdressField(String emailUser) {
        driver.findElement(LOGIN_FIELD).sendKeys(emailUser);
    }

    public void userEnterInPasswordField(String pass) {
        driver.findElement(PASSWORD_FIELD).sendKeys(pass);
    }

    public void userClickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void userClickOnForgotPasswordLink() {
        driver.findElement(FORGOT_PASSWORD_LINK).click();
    }

    public void userEnterForgotPasswordEmail(String forgotPswdEmail) {
        driver.findElement(FORGOT_PSWD_EMAIL_FIELD).sendKeys(forgotPswdEmail);
    }

    public void userClickOnResetPasswordButton() {
        driver.findElement(RESET_PASSWORD_BUTTON).click();
    }

    public boolean yourUsernameOrPasswordWasIncorrectAlertIsDisplayed() {
        return driver.findElement(ERROR_MESSAGE_PSWD_OR_USRNAME_INCORRECT).isDisplayed();
    }

    public String userIsResetPassword(){
        return driver.findElement(ERROR_FINAL_MESSAGE_RESETED_PASWORD).getText();
    }

    public boolean pleaseEnterAValidEmailAlertIsDisplayed() {
        return driver.findElement(ERROR_MESSAGE_ENTER_VALID_EMAIL).getText().equalsIgnoreCase("Please enter a valid email");
    }

    public boolean myAccountLinkIsDisplayed() {
        return driver.findElement(MY_ACCOUNT_LINK).isDisplayed();
    }

}
