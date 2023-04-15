package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Sukayna_POM;
import utilities.DriverClass;
import utilities.ExcelUtilities;

import java.util.ArrayList;

public class PR_03_Add extends DriverClass {
    Sukayna_POM ss=new Sukayna_POM();
    @And("leave integration empty and fill out the rest")
    public void leaveIntegrationEmptyAndFillOutTheRest() {
        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_03_Add ", 2);
        ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(), newDiscountData.get(1).get(0));

        Actions action = new Actions(DriverClass.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ss.setWait(2);
        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
        ss.setWait(2);
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
        ss.setWait(2);
        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(), newDiscountData.get(1).get(1));
    }

    @Then("get text of red message under integration, check is displayed")
    public void getTextOfRedMessageUnderIntegrationCheckIsDisplayed() {
     ss.setWait(2);
        ss.verifyIsDisplayedMethod(ss.getRedMessageFieldIsRequired());
    }
}
