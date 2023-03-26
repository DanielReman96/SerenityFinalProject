package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{


    @FindBy(css = ".cart_item .product-remove a")
    private WebElementFacade deleteButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade deleteSuccessMessages;
    public void deleteProductFromCart(){
        clickOn(deleteButton);
    }

    public String getDeleteSuccessMessages(){
        return deleteSuccessMessages.getText();
    }

}
