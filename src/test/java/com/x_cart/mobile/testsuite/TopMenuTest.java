package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import com.x_cart.mobile.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickOnShippingLink();
        String actualShippingPageMessage = shippingPage.getShippingPage();
        Assert.assertEquals(actualShippingPageMessage, "Shipping", "error");

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.clickOnnewPageLink();
        String actualNewPageMessage = newPage.GetNewPageText();
        Assert.assertEquals(actualNewPageMessage, "New arrivals", "error");


    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        homePage.clickOnComingSoonLink();
        String actualComingSoonMessage = comingSoonPage.getComingSoonPage();
        Assert.assertEquals(actualComingSoonMessage, "Coming soon", "error");

    }

    @Test

    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        homePage.clickOnContactUsLink();
        String actualContactUsMessage = contactUsPage.getContactUsPage();
        Assert.assertEquals(actualContactUsMessage, "Contact us", "error");
    }
}


