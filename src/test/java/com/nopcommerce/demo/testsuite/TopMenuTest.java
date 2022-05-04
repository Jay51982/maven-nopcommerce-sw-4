package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ComputersPage computersPage = new ComputersPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();


//* click on the ‘Computers’ Tab * Verify the text ‘Computers’
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputerTab();
        String expectedMessage = "Computers";
        String actualMessage = computersPage.getComputerTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Computer page not displayed");
    }

    //    * click on the ‘Electronics’ Tab * Verify the text ‘Electronics’
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickOnElectorinicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicsPage.getElectronicsTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Electronics page not displayed");
    }

//* click on the ‘Apparel’ Tab * Verify the text ‘Apparel’
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickOnApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = apparelPage.getApparelTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Apparel page not displayed");
    }

//    * click on the ‘Digital downloads’ Tab * Verify the text ‘Digital downloads’
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.clickOnDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadsPage.getDigitalDownloadsTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Digital Downloads page not displayed");
    }

//* click on the ‘Books’ Tab * Verify the text ‘Books’ 6.
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooksTab();
        String expectedMessage = "Books";
        String actualMessage = booksPage.getBooksTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Books page not displayed");
    }

//    * click on the ‘Jewelry’ Tab * Verify the text ‘Jewelry’
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelaryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getJewelryTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Computer page not displayed");
    }

//    * click on the ‘Gift Cards’ Tab * Verify the text ‘Gift Cards’

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCardsTab();;
        String expectedMessage = "Gift Cards";
        String actualMessage = giftCardsPage.getGiftCardsTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Computer page not displayed");
    }
}

