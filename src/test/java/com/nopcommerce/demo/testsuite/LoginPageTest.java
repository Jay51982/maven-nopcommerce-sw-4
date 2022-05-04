package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

//    * click on the ‘Login’ link * Verify the text ‘Welcome, Please Sign In!’
    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

//    * click on the ‘Login’ link
//    * Enter valid username
//    * Enter valid password
//    * Click on ‘LOGIN’ button
//    * Verify the ‘Log out’ text is display
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abc123@xyz.com");
        loginPage.enterPassword("abcxyz1234");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Log out";
        String actualErrorMessage = loginPage.getLogOutText();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }

//* click on the ‘Login’ link
// * Enter invalid username
// * Enter invalid password
// * Click on Login button
// * Verify the error message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }

}
