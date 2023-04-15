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

public class PR_04_Add extends DriverClass {
    Sukayna_POM ss= new Sukayna_POM();

    @And("input Description,integration code and priority")
    public void inputDescriptionIntegrationCodeAndPriority() {

        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_04_Add ", 3);
ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(),newDiscountData.get(0).get(0));
        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(), newDiscountData.get(0).get(1));

        Actions action = new Actions(DriverClass.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
      //  ss.setWait(2);
        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
       // ss.setWait(2);
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
      //  ss.setWait(2);

        ss.sendKeysMethod(ss.getPriorityInputNewDiscount(), newDiscountData.get(0).get(2));
ss.setWait(2);
    }
    @Then("check message verify is displayed")
    public void checkMessageVerifyIsDisplayed() {
       ss.setWait(2);
ss.verifyIsDisplayedMethod(ss.getDiscountSuccessfullyCreatedMessageNewDiscount());

    }


}
