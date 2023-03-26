package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void typeUsername(String value){
        accountPage.setUsernameFieldLogin(value);
    }

    @Step
    public void typePassword(String value){
        accountPage.setPasswordFieldLogin(value);
    }

    @Step
    public void clickLogin(){
        accountPage.clickOnLoginButton();
    }

    public void doLogin(String username, String password){
        accountPage.setUsernameFieldLogin(username);
        accountPage.setPasswordFieldLogin(password);
    }



    public void userIsLoggedIn(String username){
    Assert.assertEquals("Hello " + username + " (not " + username + "? Log out)", accountPage.getWelcomeTextLogin());
}

    public void invalidUsernameLogin(){
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?", accountPage.getErrorMessageInvalidUsername());

}

    public void invalidPasswordLogin(String userEmail){
        Assert.assertEquals("ERROR: The password you entered for the email address " + userEmail + " is incorrect. Lost your password?", accountPage.getErrorMessageInvalidPassword());
    }



}