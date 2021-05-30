package com.annaklueva.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LearningLibraryPage extends BasePage {
    @Autowired
    private AmazonS3SecurityDetailsPage amazonS3SecurityDetailsPage;

    @FindBy(css = "a[title='Auditing Amazon Simple Storage Service (Amazon S3) Security']")
    private WebElement amazonS3SecurityLink;

    public AmazonS3SecurityDetailsPage navigateToAmazonS3SecurityDetailsPage() {
        amazonS3SecurityLink.click();
        return amazonS3SecurityDetailsPage;
    }
}
