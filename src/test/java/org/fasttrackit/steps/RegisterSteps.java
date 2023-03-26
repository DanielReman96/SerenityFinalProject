package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{


    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();

    }

    @Step
    public void typeUserEmail(String value){
        accountPage.setEmailField(value);
    }

    @Step
    public void typePassword(String value){
        accountPage.setPasswordField(value);
    }

    @Step
    public void clickRegister(){
        accountPage.clickOnRegisterButton();
    }


    public void userIsRegisterSuccesfull(String username){
      Assert.assertEquals("Hello " + username + " (not " + username + "? Log out)", accountPage.getWelcomeRegisterText());

    }


}
