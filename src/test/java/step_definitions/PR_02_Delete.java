package step_definitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.Sukayna_POM;
import utilities.DriverClass;

public class PR_02_Delete {
    Sukayna_POM ss= new Sukayna_POM();


    @And("fill description, integration and click search button")
    public void fillDescriptionIntegrationAndClickSearchButton() {
        ss.sendKeysMethod(ss.getDescriptionSearchBox(), "02Delete");
        ss.setWait(1);
        ss.sendKeysMethod(ss.getIntegrationCodeSearchBox(), "02");
        ss.setWait(2);
        ss.clickMethod(ss.getDiscountSearchButton());


        ss.setWait(2);
        ss.clickMethod(ss.getDeleteSignUnderDiscount());
    }

    @And("click cancel")
    public void clickCancel() {
        ss.setWait(2);

        ss.clickMethod(ss.getCancelDeleteButtonNewDiscount());
ss.setWait(2);
String expectedURL="https://test.mersys.io/discounts/list";
String actualURL=DriverClass.getDriver().getCurrentUrl();
      Assert.assertEquals(expectedURL,actualURL);
    }


}
