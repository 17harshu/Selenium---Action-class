package com.actionclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail_ContextClickDemo_MailArchive {
@Test
    public void gmailContextClick() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.gmail.com");
    Thread.sleep(1000);

    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harshalanandas17@gmail.com");
    driver.findElement(By.xpath("//span[.='Next']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("17@shosmgyk");
    driver.findElement(By.xpath("//span[.='Next']")).click();
    Thread.sleep(2000);


    //driver.close();

}
}
