package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Sukayna_POM;

public class HR_02_Edit {
    Sukayna_POM ss= new Sukayna_POM();
    @And("leave name empty")
    public void leaveNameEmpty() {
        ss.sendKeysMethod(ss.getNameInputSearch(),"name2");
        ss.clickMethod(ss.getDiscountSearchButton());
        ss.setWait(2);
        ss.clickMethod(ss.getEditSignUnderDiscount());
        ss.getNameInputHR().clear();
        ss.sendKeysMethod(ss.getNameInputHR(),"     ");
        ss.setWait(2);
        ss.clickMethod(ss.getSaveButtonNewDiscount());


    }

    @Then("check error message id displayed and get attribute color.")
    public void checkErrorMessageIdDisplayedAndGetAttributeColor() {

        ss.verifyIsDisplayedMethod(ss.getAttestationUpdatedMessage());
        ss.getAttestationUpdatedMessage().getAttribute("color");
    }
}
