package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;
    LoginPage loginPage;
    PageObjectManager pageObjectManager;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }


    @Given("^user is on loginpage$")
    public void userIsOnLoginpage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\plomi\\Projekt_koncowy_SDA_Guru99\\chromedriver\\chromedriver.exe");

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);

        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();

//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        pageObjectManager = new PageObjectManager(driver);
//        loginPage = pageObjectManager.getLoginPage();
//        loginPage.navigateTo_LoginPage();

    }

    @When("user enter passWord")
    public void userEnterUserName() {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.enterUserName("mngr515430");
    }

    @And("user enter passWord")
    public void userEnterPassword() {
        loginPage.enterPassword("agErAvE");
    }

    @And("user logs in")
    public void userLogsIn() {
        loginPage.clickLogin();
    }

    @And("correct usr is logged in")
    public void correctUserIsLoggedIn() {

    }
    @After
    public void tearDown() {
        driver.close();
    }
}
