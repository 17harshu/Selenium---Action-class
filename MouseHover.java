package com.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
    @Test
    public void mouseHover() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.actimind.com/");
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        //Mouse hover on “AREAS OF EXPERTISE” menu
        WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
        action.moveToElement(AreaOfExpertise).perform();
        Thread.sleep(2000);
        //Click on “AREAS OF EXPERTISE” menu
        WebElement cloudApp = driver.findElement(By.linkText("Cloud Applications"));
        action.moveToElement(cloudApp).click().perform();
        Thread.sleep(2000);
        driver.close();
    }
}