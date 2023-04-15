package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;
import utilities.ExcelUtilities;

import java.util.ArrayList;

public class PR_01_Add extends DriverClass {
    Sukayna_POM ss = new Sukayna_POM();

    @Given("navigate to campus")
    public void navigateToCampus() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();
    }

    @When("Login")
    public void login() {
        ss.sendKeysMethod(ss.getLoginUsername(), "turkeyts");
        ss.sendKeysMethod(ss.getLoginPassword(), "TechnoStudy123");
        ss.clickMethod(ss.getLoginButton());
    }

    @And("click setup")
    public void clickSetup() {
        ss.clickMethod(ss.getSetupFromDashBoard());

    }

    @And("click parameters")
    public void clickParameters() {
        ss.clickMethod(ss.getParametersUnderSetup());
    }

    @And("click discount")
    public void clickDiscount() {
        ss.clickMethod(ss.getDiscountUnderParameters());
    }

    @And("click add sign")
    public void clickAddSign() {
ss.clickMethod(ss.getAddSignPlus());

    }
    @And("input integration code and priority only without description")
    public void inputIntegrationCodeAndPriorityOnlyWithoutDescription() {
        ArrayList<ArrayList<String>> newDiscountData = ExcelUtilities.getDataFromExcel("src/test/java/apachePOI/sukayna/apachePoiCampusSukayna.xlsx", "PR_01_Add ", 2);

        ss.sendKeysMethod(ss.getIntegrationInputNewDiscount(), newDiscountData.get(1).get(0));

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

    @And("click save")
    public void clickSaveButton() {

        ss.clickMethod(ss.getSaveButtonNewDiscount());
        ss.setWait(2);
    }

    @Then("check red message under description, get text and attribute color.")
    public void checkRedMessageUnderDescriptionGetTextAndAttributeColor() {
        ss.getRedMessageFieldCannotBeBlank().getAttribute("color");
    }



}
