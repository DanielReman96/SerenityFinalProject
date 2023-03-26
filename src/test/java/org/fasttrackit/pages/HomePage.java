package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends BasePage {


    @FindBy(id = "menu-item-122")
    private WebElementFacade myAccountLink;

    @FindBy(id = ".menu-item-123")
    private WebElementFacade shopLink;


    @FindBy(css = ".fa-search")
    private WebElementFacade searchButton;


    @FindBy(css = ".search-field")
    private WebElementFacade searchField;


    @FindBy(css = ".woocommerce-product-search :nth-child(2)")
    private WebElementFacade secondSearchIcon;


    @FindBy(css = "#menu-item-124 a")
    private WebElementFacade cartLink;

    @FindBy(css = "#menu-item-125")
    private WebElementFacade checkoutLink;

    public void clickAccountLink(){
        clickOn(myAccountLink);

    }

    public void clickShopLink(){
        clickOn(shopLink);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void clickSearchField(){
        clickOn(searchField);
    }


    public void searchForProductName(String value){
        searchField.sendKeys(value);

    }

    public void clickSecondSearchIcon(){
        clickOn(secondSearchIcon);
    }

    public void clickCartLink(){
        clickOn(cartLink);

    }

    public void clickCheckoutLink(){
        clickOn(checkoutLink);
    }
}