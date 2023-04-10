package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Sukayna_POM extends MyMethods {
    public Sukayna_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
