package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Gulengul_POM extends MyMethods {
    public Gulengul_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
