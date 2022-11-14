package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {

    private final By search = By.id("js-tlrk-nav-search-wrapper");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }

    public SearchPage clickSearchLink(){
        wait.until(ExpectedConditions.elementToBeClickable(search)).click();
        return new SearchPage(driver);

    }


}
