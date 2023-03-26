package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{


    @Test
    public void validCheckoutTest() throws InterruptedException {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.clickOnSearchButton();
        cartSteps.goToProductPage("ALBUM");
        cartSteps.clickOnAddToCart();
        checkoutSteps.clickOnCheckoutLink();
        checkoutSteps.setFirstNameAndLastNameField("Reman", "Daniel");
        checkoutSteps.setStreetAddress("Principala");
        checkoutSteps.setTownName("Dej");
        checkoutSteps.setPostCode("123456");
        checkoutSteps.setTelephoneNumber("1234567890");
        checkoutSteps.setEmailAddress("dani_re@yahoo.com");
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.orderIsReceived();

    }

    @Test
    public void inValidCheckoutTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.clickOnSearchButton();
        cartSteps.goToProductPage("ALBUM");
        cartSteps.clickOnAddToCart();
        checkoutSteps.clickOnCheckoutLink();
        checkoutSteps.setFirstNameAndLastNameField("Reman", "Daniel");
        checkoutSteps.setStreetAddress("Principala");
        checkoutSteps.setTownName("Dej");
        checkoutSteps.setPostCode("123456");
        checkoutSteps.setTelephoneNumber("1234567890");
        checkoutSteps.setEmailAddress(Constants.USER_NAME);
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.orderIsNotReceived();



    }




}
