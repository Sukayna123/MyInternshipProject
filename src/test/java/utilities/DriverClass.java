package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.Sukayna_POM;

public class DriverClass {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadDriver.get()==null) {

            if (threadDriverName.get()==null){
                threadDriverName.set("chrome");
            }

            switch (threadDriverName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    threadDriver.get().manage().window().maximize();
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    threadDriver.get().manage().window().maximize();
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    threadDriver.get().manage().window().maximize();
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111
                    threadDriver.set(new ChromeDriver(options));
                    threadDriver.get().manage().window().maximize();
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get()!=null) {
            threadDriver.get().quit();
            WebDriver driver = null;
            threadDriver.set(driver);
        }
    }



    public static void setThreadDriverName(String browserName){
        threadDriverName.set(browserName);
    }

}

