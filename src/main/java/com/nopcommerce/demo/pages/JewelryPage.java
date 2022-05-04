package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    By jewelryTabText = By.xpath("//h1[normalize-space()='Jewelry']");

    public String getJewelryTabText(){
        return getTextFromElement(jewelryTabText);
    }
}
