package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    PageObjectManager pageObjectManager;


    @Given("^user is on loginPage$")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tzjy\\OneDrive - GFT Technologies SE\\Desktop\\uuu\\chromedriver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateTo_HomePage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().getCookies();
    }

    @When("^user enter userName$")
    public void userEnterUserName() {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.enterUserName("mngr515430");
    }

    @And("^user enter passWord$")
    public void userEnterPassWord() {
        loginPage.enterPassword("agErAvE");
    }

    @And("^user logs in$")
    public void userLogsIn() {
        loginPage.clickLogin();
    }

    @And("^correct user is logged in$")
    public void correctUserIsLoggedIn() {
    }
}
