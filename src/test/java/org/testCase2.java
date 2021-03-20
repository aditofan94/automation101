package org;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

    @Test
    public void testCase2 () {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://emag.ro");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchboxTrigger")).sendKeys("!@#$%" + Keys.ENTER);

    }
}
