package com.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickUsingActionsClass {

    @Test
    public void contextClick() throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
        Thread.sleep(2000);
        action.contextClick(link).perform();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        Thread.sleep(2000);
        element.click();
        Thread.sleep(2000);
    }
}
