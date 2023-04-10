package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Ipek_POM extends MyMethods {
    public Ipek_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
