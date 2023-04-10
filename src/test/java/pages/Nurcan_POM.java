package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nurcan_POM extends MyMethods {
    public Nurcan_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
