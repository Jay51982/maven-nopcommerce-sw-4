package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class RegisterPageTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

//    * click on the ‘Register’ link * Verify the text ‘Register’
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegisterLink();

        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
/*
 * click on the ‘Register’ link
 * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.selectGenderBtn();
        registerPage.fillFirstName("Abc");
        registerPage.fillLastName("Xyz");
        registerPage.filldate("11");
        registerPage.fillmonth("11");
        registerPage.fillyear("2000");
        registerPage.enterEmailId("abc123@xyz.com");
        registerPage.enterPassword("abcxyz123");
        registerPage.enterConfirmPassword("abcxyz123");
        registerPage.clickOnRegisterButton();

        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.registrationCompletedText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }
}
