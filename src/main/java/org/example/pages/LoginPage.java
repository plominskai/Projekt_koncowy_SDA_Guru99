package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    WebElement userName;

    @FindBy(name = "password")
    WebElement passWord;

    @FindBy(name = "btnLogin")
    WebElement login;

    public void enterUserName(String user) {
        userName.sendKeys(user);

    }

    public void enterPassword(String userPassword) {
        passWord.sendKeys(userPassword);
    }

    public void clickLogin() {
        login.click();
    }
}

