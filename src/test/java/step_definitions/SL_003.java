package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Utkucan_POM;

public class SL_003 {
    Utkucan_POM ule = new Utkucan_POM();
    @And("Fill except school location name")
    public void fillExceptSchoolLocationName() {
        ule.sendKeysMethod(ule.getLocationShortNameArea(), "");
        ule.sendKeysMethod(ule.getLocationCapacityArea(), "100");
        ule.clickMethod(ule.getLocationTypeArea());
    }

    @Then("Click save")
    public void clickSave() {

    }
}

