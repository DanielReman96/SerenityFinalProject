package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest{


    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);

    }


    @Test
    public void invalidUsernameLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername("dani_e@yahoo.com");
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.invalidUsernameLogin();

    }


    @Test
    public void invalidPasswordLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword("reman12345...");
        loginSteps.clickLogin();
        loginSteps.invalidPasswordLogin(Constants.USER_EMAIL);

    }







} 