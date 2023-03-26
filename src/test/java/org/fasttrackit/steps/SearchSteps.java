package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends  BaseSteps{


    @Step
    public void setSearchField(String value){
        homePage.searchForProductName(value);

    }

    @Step
    public void clickSearchIcon(){
        homePage.clickSecondSearchIcon();
    }

    @Step
    public void verifyIsProductInList(String value){
        Assert.assertTrue(searchResultPage.isProductInList(value));

    }

    @Step
    public void verifyIsNotProductInList(String value){
        Assert.assertTrue(searchResultPage.isNotProductInList(value));
    }

    @Step
    public void verifyIsProductInShop(String value){
        Assert.assertEquals("T-SHIRT NEW GREEN", searchResultPage.isProductInShop(value));
    }

    @Step
    public void orderProductsByAscendingPrice(){
        searchResultPage.selectAscendingPriceFromDropdown();
    }

    @Step
    public void productsIsSortedByAscendingPrice(){
        Assert.assertTrue("The price is not sorted ascending.",searchResultPage.isPriceAscending());
    }

    @Step
    public void orderProductsByDescendingPrice(){
        searchResultPage.selectDescendingPriceFromDropdown();
    }

    @Step
    public void productsIsSortedByDescendingPrice(){
        Assert.assertTrue(searchResultPage.isPriceDescending());
    }

}
