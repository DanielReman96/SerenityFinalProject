package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade AddToCartButton;


    @FindBy(css = ".wc-forward")
    private WebElementFacade successMessageProductAddedToCart;

    public void clickAddToCart(){
        clickOn(AddToCartButton);
    }

    public String getSuccessMessageProductAddedToCart(){
        return successMessageProductAddedToCart.getText();
    }

    







}
