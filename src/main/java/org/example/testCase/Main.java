package org.example.testCase;

import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\plomi\\Projekt_koncowy_SDA_Guru99\\chromedriver\\chromedriver.exe");

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);


        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage.clickAcceptCookies();

        loginPage.enterUserName("mngr515430");
        loginPage.enterPassword("agErAvE");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        loginPage.clickLogin();

    }
}