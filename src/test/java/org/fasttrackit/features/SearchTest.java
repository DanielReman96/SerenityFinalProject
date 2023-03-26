package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void searchForProductTest(){

        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("HOODIE");
        searchSteps.clickSearchIcon();
        searchSteps.verifyIsProductInList("HOODIE WITH LOGO");

    }

    @Test
    public void searchForProductTest2(){

        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("T-SHIRT");
        searchSteps.clickSearchIcon();
        searchSteps.verifyIsProductInList("T-SHIRT NEW GREEN");

    }

    @Test
    public void searchForFullNameProductTest(){

        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("T-SHIRT NEW GREEN");
        searchSteps.clickSearchIcon();
        searchSteps.verifyIsProductInShop("T-SHIRT NEW GREEN");

    }


    @Test
    public void searchForNotExistProductTest(){

        loginSteps.navigateToLoginPage();
        loginSteps.typeUsername(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("T-SHIRT");
        searchSteps.clickSearchIcon();
        searchSteps.verifyIsNotProductInList("T-SHIRT NEW@@@ GREEN");

    }

    @Test
    public void verifyPriceIsAscending(){
        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("T-SHIRT");
        searchSteps.clickSearchIcon();
        searchSteps.orderProductsByAscendingPrice();
        searchSteps.productsIsSortedByAscendingPrice();

    }

    @Test
    public void verifyPriceIsDescending() {
        cartSteps.clickOnSearchButton();
        searchSteps.setSearchField("T-SHIRT");
        searchSteps.clickSearchIcon();
        searchSteps.orderProductsByDescendingPrice();
        searchSteps.productsIsSortedByDescendingPrice();

    }

















}
