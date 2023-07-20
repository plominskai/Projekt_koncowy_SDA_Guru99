package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\plomi\\Projekt_koncowy_SDA_Guru99\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-originals=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
    }
}