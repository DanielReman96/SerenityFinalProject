package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{


    @Test
    public void addToCartTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.clickOnSearchButton();
        cartSteps.goToProductPage("ALBUM");
        cartSteps.clickOnAddToCart();
        cartSteps.productIsAdded();

    }

    @Test
    public void deleteFromCartTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.goToCart();
        cartSteps.deleteProduct();
        cartSteps.productIsDeleted();

    }



}
