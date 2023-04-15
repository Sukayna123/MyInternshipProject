package step_definitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;

public class HR_01_Add extends DriverClass {
    Sukayna_POM ss=new Sukayna_POM();
    @And("click human resources")
    public void clickHumanResources() {
 ss.clickMethod(ss.getHumanResources());
    }

    @And("click setup under Human resources")
    public void clickSetupUnderHumanResources() {
        ss.clickMethod(ss.getSetupUnderHumanResources());
    }
    @And("click attestations")
    public void clickAttestations() {
        ss.clickMethod(ss.getAttestationsUnderSetUpHR());
    }


    @And("input name")
    public void inputName() {
        ss.setWait(2);
   ss.sendKeysMethod(ss.getNameInputHR(),"sam");
   ss.setWait(2);
   ss.clickMethod(ss.getSaveButtonNewAttestationHR());
    }



    @And("check success message one is displayed")
    public void checkSuccessMessageOneIsDisplayed() {
        ss.setWait(2);
        Assert.assertTrue(ss.getAttestationSuccessMessageAfterAddHR().isDisplayed());
    }

}
