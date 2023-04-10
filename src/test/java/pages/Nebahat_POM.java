package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nebahat_POM extends MyMethods {
    public Nebahat_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
