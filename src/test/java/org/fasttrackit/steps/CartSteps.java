package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{


    @Step
    public void navigateToShop(){
        homePage.clickShopLink();

    }


    @Step
    public void clickOnSearchButton(){
        homePage.clickSearchButton();
    }

    @Step
    public void goToProductPage(String productName){
//        productName = "“" + productName + "”";
        homePage.searchForProductName(productName);
        homePage.clickSecondSearchIcon();

    }
    @Step
    public void clickOnAddToCart(){
        productPage.clickAddToCart();
    }

    @Step
    public void productIsAdded(){
        Assert.assertEquals("VIEW CART",productPage.getSuccessMessageProductAddedToCart());
    }


    @Step
    public void goToCart(){
        homePage.clickCartLink();
    }

    @Step
    public void deleteProduct(){
        cartPage.deleteProductFromCart();
    }

    @Step
    public void productIsDeleted(){
        Assert.assertEquals("Your cart is currently empty.",cartPage.getDeleteSuccessMessages());
    }


}
