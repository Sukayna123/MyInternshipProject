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

public class PR_01_Edit {
    Sukayna_POM ss = new Sukayna_POM();


    @And("search discount")
    public void searchDiscount() {
        ss.setWait(2);
        ss.sendKeysMethod(ss.getDescriptionSearchBox(), "664");
        ss.setWait(1);
        ss.sendKeysMethod(ss.getIntegrationCodeSearchBox(), "66");
        ss.clickMethod(ss.getDiscountSearchButton());
        ss.setWait(2);

    }

    @And("click edit sign")
    public void clickEditSign() {

        ss.clickMethod(ss.getEditSignUnderDiscount());
    }

    @And("change the description")
    public void changeTheDescription() {
        ss.getDescriptionInputNewDiscount().clear();
        ss.sendKeysMethod(ss.getDescriptionInputNewDiscount(), "33ee");
        ss.setWait(3);


    }

    @Then("verify success message is displayed")
    public void verifySuccessMessageIsDisplayed() {
        ss.verifyIsDisplayedMethod(ss.getDiscountSuccessfullyUpdatedNewDiscount());
    }


}
