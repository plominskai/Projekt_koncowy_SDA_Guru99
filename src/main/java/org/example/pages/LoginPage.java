package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By userName = By.name("uid");
    By passWord = By.name("password");
    By login = By.name("btnLogin");

    public void enterUserName (String user) {
        driver.findElement(userName).sendKeys(user);

    }
    public void enterPassword (String userPassword) {
        driver.findElement(passWord).sendKeys(userPassword);
    }
//
//    public void loginClick() {
//        login.click();
    }

