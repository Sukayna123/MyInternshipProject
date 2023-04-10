package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Utkucan_POM;
import utilities.DriverClass;

public class SL_001 {
    Utkucan_POM ule = new Utkucan_POM();

    @Given("navigate to website")
    public void navigateToWebsite() throws InterruptedException {

        DriverClass.getDriver().get("https://test.mersys.io/");

    }

    @When("login")
    public void login() {
        ule.sendKeysMethod(ule.getUsernameInputArea(), "turkeyts");
        ule.sendKeysMethod(ule.getPasswordInputArea(), "TechnoStudy123");
        ule.clickMethod(ule.getLoginButton());

    }

    @And("Click on Setup from the menu on the left")
    public void clickOnSetupFromTheMenuOnTheLeft() {
        ule.clickMethod(ule.getSetupButton());
    }

    @And("Click School Setup")
    public void clickSchoolSetup() {
        ule.clickMethod(ule.getSchoolSetupButton());
    }

    @And("Click Locations")
    public void clickLocations() {
        ule.clickMethod(ule.getLocationsButton());
    }

    @And("Click Add School Location button")
    public void clickAddSchoolLocationButton() {
        ule.clickMethod(ule.getAddLocationsButton());
    }

    @And("Fill name short name capacity location type")
    public void fillNameShortNameCapacityLocationType() {
        ule.sendKeysMethod(ule.getLocationNameArea(), "kamil");
        ule.sendKeysMethod(ule.getLocationShortNameArea(), "km");
        ule.sendKeysMethod(ule.getLocationCapacityArea(), "100");
        ule.clickMethod(ule.getLocationTypeArea());
    }

    @Then("Click save button")
    public void clickSaveButton() {
        ule.clickMethod(ule.getAddSaveButton());
    }
}

