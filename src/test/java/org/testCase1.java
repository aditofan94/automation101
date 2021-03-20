package org;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {

    @Test
    public void testCase1 () {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://emag.ro");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchboxTrigger")).sendKeys("mouse gaming" + Keys.ENTER);

    }
}
