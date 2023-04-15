package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Sukayna_POM;

public class HR_01_Edit {
    Sukayna_POM ss=new Sukayna_POM();
    @And("change name")
    public void changeName() {
    ss.sendKeysMethod(ss.getNameInputSearch(),"ww24");
    ss.setWait(2);
    ss.clickMethod(ss.getEditSignUnderDiscount());
    ss.getNameInputHR().clear();
    ss.sendKeysMethod(ss.getNameInputHR(),"RR77");
    ss.setWait(2);
    ss.clickMethod(ss.getSaveButtonNewDiscount());

    }

    @Then("get success message and check if displayed")
    public void getSuccessMessageAndCheckIfDisplayed() {
        ss.verifyIsDisplayedMethod(ss.getAttestationUpdatedMessage());
    }
}
