package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealTest extends TestBase {

    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {

        homePage.mouseHoverOnHotDealsTab();
        homePage.clickONSaleLink();
        String actualSalePageText = salePage.getSalePageText();
        Assert.assertEquals(actualSalePageText, "Sale", "error");
        salePage.mouseHoverOnSortBy();
        salePage.mouseHoverAtoZText();
        String actualNameAtoZTextMessage = salePage.getNameAtiZText();
        Assert.assertEquals(actualNameAtoZTextMessage, "Name A - Z", "error");


    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        homePage.mouseHoverOnHotDealsTab();
        homePage.clickONSaleLink();
        String actualSalePageText = salePage.getSalePageText();
        Assert.assertEquals(actualSalePageText, "Sale", "error");
        salePage.mouseHoverOnSortBy();
        salePage.mouseHoverHighToLowText();
        String actualNameHighToLowMessage = salePage.getHighNameToLowText();
        Assert.assertEquals(actualNameHighToLowMessage, "Price Low - High", "error");


    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealsTab();
        homePage.clickONSaleLink();
        String actualSalePageText = salePage.getSalePageText();
        Assert.assertEquals(actualSalePageText, "Sale", "error");
        salePage.mouseHoverOnSortBy();
        salePage.mouseHoverRates();
        String actualRatesMessage = salePage.getRatesText();
        Assert.assertEquals(actualRatesMessage, "Rates", "error");

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        homePage.mouseHoverOnHotDealsTab();
        homePage.clickOnBestSellerLink();
        String actualBestSellerMessage = bestSellerPage.getBestSellerText();
        Assert.assertEquals(actualBestSellerMessage, "Bestsellers", "error");

        bestSellerPage.mouseHoverOnSortBy();
        bestSellerPage.mouseHoverZtoAText();
        String actualNameZtoAText = bestSellerPage.getNameZtoAText();
        Assert.assertEquals(actualNameZtoAText, "Name Z - A", "error");


    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage.mouseHoverOnHotDealsTab();
        homePage.clickOnBestSellerLink();
        String actualBestSellerMessage = bestSellerPage.getBestSellerText();
        Assert.assertEquals(actualBestSellerMessage, "Bestsellers", "error");
        bestSellerPage.mouseHoverOnSortBy();
        bestSellerPage.mouseHoverHighToLowText();
        String actualHighToLowMessage = bestSellerPage.getHighNameToLowText();
        Assert.assertEquals(actualHighToLowMessage, "Price High - Low", "error");

    }

    @Test

    public void verifyBestSellersProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealsTab();
        homePage.clickOnBestSellerLink();
        String actualBestSellerMessage = bestSellerPage.getBestSellerText();
        Assert.assertEquals(actualBestSellerMessage, "Bestsellers", "error");
        bestSellerPage.mouseHoverOnSortBy();
        bestSellerPage.mouseHoverAndClickOnRates();
        String actualRatesText = bestSellerPage.getRatesText();
        Assert.assertEquals(actualRatesText, "Rates", "error");


    }

}


