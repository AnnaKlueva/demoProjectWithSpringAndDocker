package com.annaklueva.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartPage extends BasePage{

    @Autowired
    private LearningLibraryPage learningLibraryPage;

    @FindBy(css = "a[href='/LearningLibrary']")
    private WebElement learningLibraryLink;

    public LearningLibraryPage navigateToLearningLibrary() {
        learningLibraryLink.click();
        return learningLibraryPage;
    }

    public StartPage goToHomePage() {
        driver.navigate().to("https://www.aws.training/");
        return this;
    }
}
