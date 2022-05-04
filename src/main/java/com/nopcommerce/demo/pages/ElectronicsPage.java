package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsTabText = By.xpath("//h1[normalize-space()='Electronics']");

    public String getElectronicsTabText(){
        return getTextFromElement(electronicsTabText);
    }
}
