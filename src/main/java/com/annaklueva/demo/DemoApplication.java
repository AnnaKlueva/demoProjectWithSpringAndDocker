package com.annaklueva.demo;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public WebDriver webDriver() {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		//Capabilities capabilities = DesiredCapabilities.firefox();
		WebDriver driver = new FirefoxDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("http://www.tutorialspoint.com");
		return driver;
	}


}
