package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By salePageText = By.id("page-title");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By AtoZText = By.xpath("//a[contains(text(),'Name A - Z')]");
    By NameAtoZText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By highToLowText = By.xpath("//a[contains(text(),'Price Low - High')]");
    By highNameToLowText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By rates = By.xpath("//a[contains(text(),'Rates')]");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");

    public String getSalePageText() {
        return getTextFromElement(salePageText);
    }

    public void mouseHoverOnSortBy() {
        mouseHoverToElement(sortBy);
    }

    public void mouseHoverAtoZText() {
        mouseHoverToElementAndClick(AtoZText);
    }

    public String getNameAtiZText() {
        return getTextFromElement(NameAtoZText);
    }

    public void mouseHoverHighToLowText() {
        mouseHoverToElementAndClick(highToLowText);
    }

    public String getHighNameToLowText() {
        return getTextFromElement(highNameToLowText);
    }
    public void mouseHoverRates() {
        mouseHoverToElementAndClick(rates);
    }

    public String getRatesText() {
        return getTextFromElement(ratesText);
    }

}

