package com.annaklueva.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig(DemoApplication.class)
class DemoApplicationTests {
	@Autowired
	private StartPage startPage;

	@Autowired
	private AmazonS3SecurityDetailsPage amazonS3SecurityDetailsPage;

	@Test
	void navigateToCourseDetailPage() throws InterruptedException {

		startPage.goToHomePage()
				.navigateToLearningLibrary()
				.navigateToAmazonS3SecurityDetailsPage();

		assertThat(amazonS3SecurityDetailsPage.getTitle())
				.isTrue();
	}
}
