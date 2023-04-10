package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Yuksel_POM extends MyMethods {
    public Yuksel_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
