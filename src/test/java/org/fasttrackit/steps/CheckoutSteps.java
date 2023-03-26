package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void clickOnCheckoutLink(){
        homePage.clickCheckoutLink();
    }

    @Step
    public void setFirstNameAndLastNameField(String firstName, String secondName){
        checkoutPage.setNameField(firstName, secondName);
    }

    @Step
    public void setStreetAddress(String value){
        checkoutPage.giveStreetAddress(value);
    }

    @Step
    public void setTownName(String value){
        checkoutPage.giveTownName(value);
    }
    @Step
    public void setPostCode(String value){
        checkoutPage.givePostCode(value);
    }
    @Step
    public void setTelephoneNumber(String value){
        checkoutPage.giveTelephoneNumber(value);
    }
    @Step
    public void setEmailAddress(String value){
        checkoutPage.giveEmailAddress(value);
    }
    @Step
    public void clickOnPlaceOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }



    @Step
    public void orderIsReceived() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("Thank you. Your order has been received.",checkoutPage.getSuccessMessagesOrderReceived());

    }

    @Step
    public void orderIsNotReceived(){
        Assert.assertEquals("Billing Email address is not a valid email address.",checkoutPage.getErrorMessages());
    }




}
