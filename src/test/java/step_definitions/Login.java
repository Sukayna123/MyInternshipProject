package step_definitions;

import utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login_POM;

public class Login {
    Login_POM lg=new Login_POM();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {
        lg.sendKeysMethod(lg.getLoginUsername(), "turkeyts");
       lg.sendKeysMethod(lg.getLoginPassword(), "TechnoStudy123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        lg.clickMethod(lg.getLoginButton());
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
       lg.waitUntilVisible(lg.getDashBoardHeader());
        Assert.assertTrue(lg.getDashBoardHeader().isDisplayed());

    }
}
