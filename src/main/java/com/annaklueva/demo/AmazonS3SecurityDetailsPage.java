package com.annaklueva.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonS3SecurityDetailsPage extends BasePage {

    @FindBy(css = "div[data-testid='LoDetailsLoDescriptionText']")
    private WebElement detailsBlock;

    public boolean getTitle() {
        return detailsBlock.isDisplayed();
    }
}
