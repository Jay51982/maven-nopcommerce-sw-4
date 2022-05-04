package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By computerTabText = By.linkText("Computers");

    public String getComputerTabText(){
        return getTextFromElement(computerTabText);
    }
}
