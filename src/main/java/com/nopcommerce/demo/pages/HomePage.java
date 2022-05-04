package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    By computerTab = By.linkText("Computers");
 //   By computerTabText = By.linkText("Computers");

    By electronicsTab = By.xpath("//a[@href='/electronics']");

    By apparelTab = By.xpath("//a[@href=\"/apparel\"]");


    By digitalDownloadsTab = By.linkText("Digital downloads");


    By booksTab = By.linkText("Books");


    By jewelryTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");


    By giftCardsTab = By.linkText("Gift Cards");


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){

        clickOnElement(registerLink);
    }

    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }

    public void clickOnElectorinicsTab(){
        clickOnElement(electronicsTab);
    }

       public void clickOnApparelTab(){
        clickOnElement(apparelTab);
    }


    public void clickOnDigitalDownloadsTab(){
        clickOnElement(digitalDownloadsTab);
    }



    public void clickOnBooksTab(){
        clickOnElement(booksTab);
    }

    public void clickOnJewelaryTab(){
        clickOnElement(jewelryTab);
    }

    public void clickOnGiftCardsTab(){
        clickOnElement(giftCardsTab);
    }
}
