package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {


    @FindBy(css = "#primary .woocommerce-loop-product__title")
    private List<WebElementFacade> listOfProductNames;


    @FindBy(css = ".product_title")
    private WebElementFacade productName;


    @FindBy(css = ".price")
    private List<WebElementFacade> listOfPrice;

    @FindBy(css = "select.orderby")
    private WebElementFacade sortByDropdown;


    public boolean isProductInList(String value){
        waitFor(listOfProductNames.get(0));
        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(value)){
                return true;
            }
        }

        return false;
    }

    public boolean isNotProductInList(String value){
        waitFor(listOfProductNames.get(0));
        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(value)){
                return false;
            }
        }

        return true;
    }


    public String isProductInShop(String value) {
        return productName.getText();

    }

    public boolean isPriceAscending(){
        int firstPrice = getIntFromPrice(listOfPrice.get(0).getText());
        int lastPrice = getIntFromPrice(listOfPrice.get(listOfPrice.size() - 1).getText());

        return firstPrice <= lastPrice;


    }

    public void selectAscendingPriceFromDropdown(){
        sortByDropdown.selectByIndex(4);
    }

    public boolean isPriceDescending(){
        int firstPrice = getIntFromPrice(listOfPrice.get(0).getText());
        int lastPrice = getIntFromPrice(listOfPrice.get(listOfPrice.size() - 1).getText()); ;

        return firstPrice >= lastPrice;


    }

    public void selectDescendingPriceFromDropdown(){
        sortByDropdown.selectByIndex(5);
    }







}
