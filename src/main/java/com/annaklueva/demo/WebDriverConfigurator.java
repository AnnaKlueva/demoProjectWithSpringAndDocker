package com.annaklueva.demo;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.concurrent.TimeUnit;

@Component
public class WebDriverConfigurator {
    private WebDriver driver;

    public WebDriver WebDriverConfigurator()  {
        Capabilities capabilities = DesiredCapabilities.firefox();
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.manage()
                .timeouts()
                .implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    static {
        System.setProperty("webdriver.gecko.driver", findFile("geckodriver"));
    }

    private static String findFile(String filename) {
        String[] paths = { "", "bin/", "target/classes" }; // if you have chromedriver somewhere else on the path, then put it here.
        for (String path : paths) {
            if (new File(path + filename).exists())
                return path + filename;
        }
        return "";
    }

    public void close() {
        driver.close();
    }

    public void navigateTo(String url) {
        driver.navigate()
                .to(url);
    }
}
