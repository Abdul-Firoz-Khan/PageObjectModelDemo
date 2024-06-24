package com.afk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By welcomeMessage = By.xpath("//marquee[contains(text(),'Welcome To Manager')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        WebElement messageElement = driver.findElement(welcomeMessage);
        return messageElement.getText();
    }
}
