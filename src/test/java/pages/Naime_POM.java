package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Naime_POM extends MyMethods {
    public Naime_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
