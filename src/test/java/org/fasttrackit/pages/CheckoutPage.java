package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends  BasePage {

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = ".input-text#billing_address_1")
    private WebElementFacade streetAddress;

    @FindBy(css = ".input-text#billing_city")
    private WebElementFacade townName;

    @FindBy(css = ".input-text#billing_postcode")
    private WebElementFacade postCode;

    @FindBy(css = ".input-text#billing_phone")
    private WebElementFacade telephoneNumber;

    @FindBy(css = ".input-text#billing_email")
    private WebElementFacade emailAddress;

    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".woocommerce-thankyou-order-received")
    private WebElementFacade successMessagesOrderReceived;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessages;

    public void setNameField(String firstName, String lastName){
        typeInto(firstNameField,firstName);
        typeInto(lastNameField,lastName);
    }

    public void giveStreetAddress(String value){
        clickOn(streetAddress);
        typeInto(streetAddress, value);
    }

    public void giveTownName(String value){
        typeInto(townName, value);
    }

    public void givePostCode(String value){
        typeInto(postCode, value);
    }

    public void giveTelephoneNumber(String value){
        typeInto(telephoneNumber,value);
    }

    public void giveEmailAddress(String value){
        typeInto(emailAddress, value);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    public String getSuccessMessagesOrderReceived(){
        return successMessagesOrderReceived.getText();
    }

    public String getErrorMessages(){
        return errorMessages.getText();
    }

}
