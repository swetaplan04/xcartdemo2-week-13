package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {

    By contactUsPage = By.xpath("//h1[contains(text(),'Contact us')]");

    public String getContactUsPage(){
        return getTextFromElement(contactUsPage);
    }
}


