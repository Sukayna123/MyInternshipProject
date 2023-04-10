package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Utkucan_POM;

public class SL_004 {

    Utkucan_POM ule = new Utkucan_POM();
    @And("Click Delete School Locations button")
    public void clickDeleteSchoolLocationsButton() {
        ule.clickMethod(ule.getDeleteLocationsButton());
    }

    @And("Click Delete")
    public void clickDelete() {
        ule.clickMethod(ule.getSureDeleteLocationButton());
    }

    @Then("See success message for delete location")
    public void seeSuccessMessageForDeleteLocation() {
        //Assert.assertTrue();
    }
}
