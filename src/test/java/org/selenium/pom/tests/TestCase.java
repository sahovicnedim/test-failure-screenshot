package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase extends BaseTest {


    @Test
    public void Test() {
        String searchFor = "qa";
        SearchPage searchPage = new HomePage(driver).
                load().
                clickSearchLink().
                search(searchFor);
        Assert.assertEquals(searchPage.getTitle(), "Jul 7, 2022 ... You may have heard about QA, but what about SQA? Find what it means and its role in QA testing, along with best practices for testers.123456");
        searchPage.clickQaLink();
    }
}