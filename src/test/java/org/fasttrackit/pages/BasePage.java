package org.fasttrackit.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getIntFromPrice(String value){
        return Integer.parseInt(value
                .replaceAll(",", "")
                .replaceAll(" lei","")
        );

    }

}
