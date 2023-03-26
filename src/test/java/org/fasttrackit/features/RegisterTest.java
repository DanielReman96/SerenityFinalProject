package org.fasttrackit.features;

import org.junit.Test;

public class RegisterTest extends BaseTest{


    @Test
    public void validRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.typeUserEmail("dani_re@yahoo.com");
        registerSteps.typePassword("reman123456...");
        registerSteps.clickRegister();
        registerSteps.userIsRegisterSuccesfull("dani_re");

    }





}
