package com.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo {
    @Test
    public void dragDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-dragdrop/index.html");
        String xp1 = "//h1[.='Block 1']";
        WebElement block1 = driver.findElement(By.xpath(xp1));
        String xp2 = "//h1[.='Block 3']";
        WebElement block3 = driver.findElement(By.xpath(xp2));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(block1, block3).perform();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
