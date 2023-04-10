package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Utkucan_POM;

public class SL_002 {

    Utkucan_POM ule = new Utkucan_POM();
    @And("Fill all of them except location capacity area")
    public void fillAllOfThemExceptLocationCapacityArea() {
        ule.sendKeysMethod(ule.getLocationNameArea(), "");
        ule.sendKeysMethod(ule.getLocationShortNameArea(), "");
        ule.clickMethod(ule.getLocationTypeArea());
    }

    @Then("See success message")
    public void seeSuccessMessage() {

    }
}
