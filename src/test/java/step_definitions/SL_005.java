package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Utkucan_POM;

public class SL_005 {
    Utkucan_POM ule = new Utkucan_POM();
    @And("Click Edit School Locations button")
    public void clickEditSchoolLocationsButton() {
        ule.clickMethod(ule.getEditLocationsButton());
    }

    @And("Change capacity of school location")
    public void changeCapacityOfSchoolLocation() {

    }

    @Then("Click save for capacity")
    public void clickSaveForCapacity() {
        ule.clickMethod(ule.getEditSaveLocationButton());

    }
}
