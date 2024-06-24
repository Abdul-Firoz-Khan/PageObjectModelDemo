package com.afk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By userIdInput = By.name("uid");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement userIdElement = driver.findElement(userIdInput);
        userIdElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }
}
