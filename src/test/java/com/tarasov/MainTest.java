package com.tarasov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.99.100:32769/wd/hub"), chromeOptions);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.youtube.com/");
        assertEquals("80px", webDriver.findElement(By.id("logo-icon-container")).getCssValue("width"));
        webDriver.close();
    }
}
