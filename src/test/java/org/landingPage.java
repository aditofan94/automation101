package org;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class landingPage {

    @Test
    public void landingPage () {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\adi_t\\Desktop\\testare automata\\2. htmlcss project\\landing page\\website\\index.html");
        driver.manage().window().maximize();

    }
}
