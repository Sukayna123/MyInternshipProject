package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;
import utilities.ExcelUtilities;

import java.util.ArrayList;

public class PR_01_Delete extends DriverClass {
    Sukayna_POM ss=new Sukayna_POM();
    @And("click delete button")
    public void clickDeleteButton() {
//        ss.clickMethod(ss.getAddSignPlus());
//        ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(),"444");
//        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(),"444");
//        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(),"444");


        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_01_Delete", 3);
ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(),newDiscountData.get(1).get(0));
        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(), newDiscountData.get(1).get(1));

        Actions action = new Actions(DriverClass.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ss.setWait(2);
        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
        ss.setWait(2);
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
        ss.setWait(2);

        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(), newDiscountData.get(1).get(2));


        ss.setWait(2);
        ss.sendKeysMethod(ss.getDescriptionSearchBox(), "444");
        ss.setWait(1);
        ss.sendKeysMethod(ss.getIntegrationCodeSearchBox(), "444");
        ss.setWait(2);
        ss.clickMethod(ss.getDiscountSearchButton());



        ss.setWait(2);
        ss.clickMethod(ss.getDeleteSignUnderDiscount());

    }

    @And("click delete")
    public void clickDelete() {
        ss.setWait(2);
        ss.clickMethod(ss.getDeleteUnderDelete());
    }
    @Then("check success message after delete and verify is displayed")
    public void checkSuccessMessageAfterDeleteAndVerifyIsDisplayed() {

        ss.verifyIsDisplayedMethod(ss.getDiscountSuccessfullyDeletedMessageAfterDelete());

    }
}
