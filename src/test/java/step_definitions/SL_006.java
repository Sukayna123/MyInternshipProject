package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Utkucan_POM;

public class SL_006 {
    Utkucan_POM ule = new Utkucan_POM();
    @And("Click Edit School Location button")
    public void clickEditSchoolLocationButton() {
        ule.clickMethod(ule.getEditLocationsButton());
    }

    @And("Change Name of school location")
    public void changeNameOfSchoolLocation() {

    }

    @Then("Click save for name")
    public void clickSaveForName() {
        ule.clickMethod(ule.getEditSaveLocationButton());
    }
}

