package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{



    @FindBy(id = "reg_email")
    private WebElementFacade emailFieldRegister;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordFieldRegister;


    @FindBy(css = ".col-2 .button")
    private WebElementFacade registerButton;


    @FindBy(css = ".woocommerce-MyAccount-content p:nth-child(1)")
    private WebElementFacade welcomeMessageRegister;


    @FindBy(id = "username")
    private WebElementFacade usernameFieldLogin;

    @FindBy(id = "password")
    private WebElementFacade passwordFieldLogin;


    @FindBy(css = ".login .woocommerce-Button.button")
    private WebElementFacade loginButton;


    @FindBy(css = ".woocommerce-MyAccount-content p:nth-child(1)")
    private WebElementFacade welcomeMessageLogin;

    @FindBy(css = ".woocommerce li")
    private WebElementFacade errorMessageinvalidUsername;


    @FindBy(css = ".woocommerce li")
    private WebElementFacade errorMessageinvalidPassword;


    public void setEmailField(String value){
        typeInto(emailFieldRegister, value);

    }

    public void setPasswordField(String value){
        typeInto(passwordFieldRegister, value);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public String getWelcomeRegisterText(){
        return welcomeMessageRegister.getText();
    }

    public void setUsernameFieldLogin(String value){
        typeInto(usernameFieldLogin, value);
    }

    public void setPasswordFieldLogin(String value){
        typeInto(passwordFieldLogin, value);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }

    public String getWelcomeTextLogin(){
        return welcomeMessageLogin.getText();
    }

    public String getErrorMessageInvalidUsername(){
        return errorMessageinvalidUsername.getText();
    }

    public String getErrorMessageInvalidPassword(){
        return errorMessageinvalidPassword.getText();
    }

}
