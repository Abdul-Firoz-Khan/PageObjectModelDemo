package com.afk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99DemoTest {
    private WebDriver driver;
    private String baseUrl = "http://demo.guru99.com/v4";

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() {
        driver.get(baseUrl);

        // Create objects of Page classes
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        // Perform actions
        loginPage.enterUsername("mngr34926");
        loginPage.enterPassword("amUpenu");

        loginPage.clickLogin();

        // Assertion
        String welcomeMessage = homePage.getWelcomeMessage();
        System.out.println("Welcome Message: " + welcomeMessage);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
