package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.TargetPage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestsellerpage = new BestSellerPage();
    TargetPage targetpage = new TargetPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {

        homePage.mouseHoverOnHotDealsTab();
        homePage.clickOnBestSellerLink();
        String actualBestSellerText = bestsellerpage.getBestSellerText();
        Assert.assertEquals(actualBestSellerText, "Bestsellers", "error");
        bestsellerpage.mouseHoverOnSortBy();
        bestsellerpage.mouseHoverAndClickOnNameAToZ();
        bestsellerpage.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellerpage.mouseHoverAndClickOnAddToCartButton();
        String actualAddProductSuccessText = bestsellerpage.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText, "Product has been added to your cart", "error");
        bestsellerpage.clickOnCloseButton();
        bestsellerpage.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellerpage.clickOnViewCartButton();
        String actualViewCartVerifyText = targetpage.getViewCartVerifyText();
        Assert.assertEquals(actualViewCartVerifyText, "Your shopping cart - 1 item", "error");
        String actualSubTotalText = targetpage.getSubTotalText();
        Assert.assertEquals(actualSubTotalText, "299", "error");
        String actualTotal = targetpage.getVerifyTotal();
        Assert.assertEquals(actualTotal, "$309.73", "error");
        targetpage.clickOnGoToCheckoutButton();
        String actualLoginToYourAccountText = targetpage.getLoginToYourAccountText();
        Assert.assertEquals(actualLoginToYourAccountText, "Log in to your account", "error");
        targetpage.enterEmailAddress("Lalita1237+@gmail.com");
        targetpage.clickOnContinueButton();
        String actualSecureCheckoutText = targetpage.getSecureCheckoutText();
        Assert.assertEquals(actualSecureCheckoutText, "Secure Checkout", "error");
        targetpage.enterFirstName("Lalita");
        targetpage.enterLastName("Desai");
        targetpage.enterAddressName("120 London Street");
        targetpage.enterState("London");
        targetpage.clickOnCreateProfileCheckBox();
        targetpage.enterPassword("San345");
        targetpage.clickOnLocalShippingRadioButton();
        Thread.sleep(1000);
        targetpage.clickOnCodRadioButton();
        String actualTotalAmountAfterShippingCostText = targetpage.getTotalAmountAfterShippingCostText();
        Assert.assertEquals(actualTotalAmountAfterShippingCostText, "Place order: $311.03", "error");
        Thread.sleep(2000);
        targetpage.clickOnPlaceOrderButton();
        String expectedThankYouForOrderText = "Thank you for your order";
        String actualThankYouForOrderText = targetpage.getThankYouForOrderText();
        Assert.assertEquals(actualThankYouForOrderText, expectedThankYouForOrderText, "error");
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {


        homePage.mouseHoverOnHotDealsTab();
        homePage.clickOnBestSellerLink();
        String actualBestSellerText = bestsellerpage.getBestSellerText();
        Assert.assertEquals(actualBestSellerText, "Bestsellers", "error");
        bestsellerpage.mouseHoverOnSortBy();
        bestsellerpage.mouseHoverAndClickOnNameAToZ();
        bestsellerpage.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellerpage.mouseHoverAndClickOnAddToCartButton();
        String actualAddProductSuccessText = bestsellerpage.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText, "Product has been added to your cart", "error");
        bestsellerpage.clickOnCloseButton();
        bestsellerpage.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellerpage.clickOnViewCartButton();
        String actualViewCartVerifyText = targetpage.getViewCartVerifyText();
        Assert.assertEquals(actualViewCartVerifyText, "Your shopping cart - 1 item", "error");
        targetpage.clickOnEmptyCartButton();
        switchToAlert();
        String expectedAlertMessage = "Are you sure you want to clear your cart?";
        String actualAlertMessage = getTextFromAlert();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "error");
        acceptAlert();
        Thread.sleep(2000);
        String actualItemDeletedText = targetpage.getItemDeletedFromCartText();
        Assert.assertEquals(actualItemDeletedText, "Item(s) deleted from your cart", "error");
        String actualCartEmptyText = targetpage.geYourCartIsEmptyText();
        Assert.assertEquals(actualCartEmptyText, "Your cart is empty");


    }

}


