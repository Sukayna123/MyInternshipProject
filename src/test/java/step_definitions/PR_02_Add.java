package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;
import utilities.ExcelUtilities;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;

public class PR_02_Add {
    Sukayna_POM ss = new Sukayna_POM();

    @And("input Description,integration code and priority using apache poi")
    public void inputDescriptionIntegrationCodeAndPriority() {
        ss.setWait(2);
        ss.clickMethod(ss.getAddSignPlus());
        ss.setWait(2);
        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_02_Add", 3);
        ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(), newDiscountData.get(1).get(0));
        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(), newDiscountData.get(1).get(1));

        Actions action = new Actions(DriverClass.getDriver());

        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
        ss.setWait(2);

        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(), newDiscountData.get(1).get(2));
        ss.setWait(2);

    }
    @And("click save tab")
    public void clickSaveTab() {
        Actions action = new Actions(DriverClass.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ss.clickMethod(ss.getSaveButtonNewDiscount());
        ss.setWait(3);
    }

    @And("input Description,integration code and priority with the same data as previous one using apache poi")
    public void inputDescriptionIntegrationCodeAndPriorityWithTheSameDataAsPreviousOne() {

        ss.clickMethod(ss.getAddSignPlus());
        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_02_Add", 3);
        ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(), newDiscountData.get(2).get(0));
        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(), newDiscountData.get(2).get(1));

        Actions action = new Actions(DriverClass.getDriver());

        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
        ss.setWait(2);

        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(), newDiscountData.get(2).get(2));
        ss.setWait(4);

        action.sendKeys(Keys.TAB).build().perform();

    }

    @Then("check error message, verify is displayed and get text")
    public void checkErrorMessageVerifyIsDisplayedAndGetText() {
        ss.verifyContainsText(ss.getTheDiscountWithDescriptionMessageNewDiscount(), "exist");

        Assert.assertTrue(ss.getTheDiscountWithDescriptionMessageNewDiscount().isDisplayed());

    }


}
