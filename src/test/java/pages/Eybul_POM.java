package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Eybul_POM extends MyMethods {
    public Eybul_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
