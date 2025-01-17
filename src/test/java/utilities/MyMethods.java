package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Sukayna_POM;

import java.time.Duration;
import java.util.ArrayList;

public class MyMethods {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(30));

    public void sendKeysMethod(WebElement element, String keys) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void verifyContainsText(WebElement element, String value) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public boolean isPresent(WebElement element) {
        waitUntilClickable(element);
        return element.isDisplayed();
    }

    public boolean isSelected(WebElement element) {
        waitUntilClickable(element);
        return element.isSelected();
    }

    public boolean verifyIsDisplayedMethod(WebElement element) {
        waitUntilClickable(element);
        return element.isDisplayed();
    }

    public void setWait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isSelectedMethod(WebElement element) {
        waitUntilClickable(element);
        return element.isSelected();
    }

    public void hoverOver(WebElement element) {
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOverElement = actions.moveToElement(element).build();
        hoverOverElement.perform();
    }

    public void selectMethod(WebElement element) {
        Select select = new Select(element);
        element.click();

    }
    public void scroll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollLeft += 500", element);
    }



}
