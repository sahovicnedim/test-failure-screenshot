package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class SearchPage extends BasePage {

    private final By searchField = By.cssSelector("input[placeholder='Looking for...']");
    private final By searchButton = By.cssSelector("button[type='button'] span");
    private final By title = By.cssSelector("body > div:nth-child(13) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > p:nth-child(2)");

    public final By qa = By.cssSelector("body > div:nth-child(13) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > h4:nth-child(1) > a:nth-child(1)");

    public SearchPage(WebDriver driver){ super(driver);}

    public SearchPage enterTextInSearchField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys(txt);
        return this;
    }

    public SearchPage search(String txt){
        enterTextInSearchField(txt).clickSearchButton();
        return this;
    }

    public SearchPage clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        return this;
    }

    public SearchPage clickQaLink(){
        wait.until(ExpectedConditions.elementToBeClickable(qa)).click();
        return this;
    }

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();

    }

}
