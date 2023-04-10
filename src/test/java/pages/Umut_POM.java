package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Umut_POM extends MyMethods {
    public Umut_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
