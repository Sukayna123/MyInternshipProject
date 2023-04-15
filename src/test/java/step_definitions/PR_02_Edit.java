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

public class PR_02_Edit {
    Sukayna_POM ss = new Sukayna_POM();

    @And("change the priority to only spaces")
    public void changeThePriorityToOnlySpaces() {
        ss.setWait(2);
        ss.sendKeysMethod(ss.getDescriptionSearchBox(), "990");
        ss.setWait(1);
        ss.sendKeysMethod(ss.getIntegrationCodeSearchBox(), "tt");
        ss.clickMethod(ss.getDiscountSearchButton());
        ss.setWait(2);

        ss.clickMethod(ss.getEditSignUnderDiscount());
        Actions action = new Actions(DriverClass.getDriver());

        Action useKeyAction = action.moveToElement(ss.getPriorityInputNewDiscount()).doubleClick().build();
        useKeyAction.perform();
        ss.setWait(2);
        Action clearPriority = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.DELETE).build();
        clearPriority.perform();
        ss.setWait(2);

        Action sendSpace = action.sendKeys(ss.getPriorityInputNewDiscount(), Keys.SPACE).build();
        sendSpace.perform();

        ss.setWait(3);

        ss.clickMethod(ss.getSaveButtonNewDiscount());

        ss.setWait(2);
    }

    @Then("assert update")
    public void assertUpdate() {
        Assert.assertFalse(ss.getDiscountSuccessfullyUpdatedNewDiscount().isDisplayed());
    }
}
