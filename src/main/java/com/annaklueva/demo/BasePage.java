package com.annaklueva.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


public class BasePage {

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

}
