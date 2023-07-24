package org.example.managers;

import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private LoginPage loginPage;
    private WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
}
