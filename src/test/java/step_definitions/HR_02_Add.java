package step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;

public class HR_02_Add extends DriverClass {
    Sukayna_POM ss=new Sukayna_POM();
    @Then("check red message under name is displayed and get text")
    public void checkRedMessageUnderNameIsDisplayedAndGetText() {
       ss.getRedMessageUnderNameHR().getText();
      //  Assert.assertTrue(ss.getRedMessageUnderNameHR().isDisplayed());

        ss.verifyIsDisplayedMethod(ss.getRedMessageUnderNameHR());

    }
}
