package com.tarasov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Application {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver webDriver = new RemoteWebDriver(new URL("http://192.168.99.100:32769/wd/hub"), chromeOptions);
        webDriver.get("https://www.youtube.com/");
    }
}
