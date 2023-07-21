package org.example.testCase;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\plomi\\Projekt_koncowy_SDA_Guru99\\chromedriver\\chromedriver.exe");

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);


        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).click();

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserName("mngr515430");
        loginPage.enterPassword("agErAvE");
//        loginPage.loginClick();



    }
}