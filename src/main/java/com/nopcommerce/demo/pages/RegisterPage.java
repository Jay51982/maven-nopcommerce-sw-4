package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    //storing element in variable

    By registerLink = By.linkText("Register");
    By registerMessage = By.xpath("//div[@class='page-title']");
    By genderRadioBtn = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirth = By.name("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationCompleteMessage = By.xpath("//div[@class='result']");


    public void clickOnRegisterLink(){

        clickOnElement(registerLink);
    }
    public String getRegisterText(){

        return getTextFromElement(registerMessage);
    }
    public void selectGenderBtn(){
        clickOnElement(genderRadioBtn);
    }
    public void fillFirstName(String fName){

        sendTextToElement(firstName,fName);
    }
    public void fillLastName(String lName){

        sendTextToElement(lastName,lName);
    }

    public void filldate(String date){
        sendTextToElement(dateOfBirth,date);
    }
    public void fillmonth(String month){
        sendTextToElement(monthOfBirth,month);
    }
    public void fillyear(String year){
        sendTextToElement(yearOfBirth,year);
    }
    public void enterEmailId(String emailID){

        sendTextToElement(email,emailID);
    }
    public void enterPassword(String pword){
        sendTextToElement(password,pword);
    }
    public void enterConfirmPassword(String pword){
        sendTextToElement(confirmPassword,pword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String registrationCompletedText(){
        return getTextFromElement(registrationCompleteMessage);
    }
}
