package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    By giftCardsTabText = By.xpath("//h1[normalize-space()='Gift Cards']");

    public String getGiftCardsTabText(){
        return getTextFromElement(giftCardsTabText);
    }
}
