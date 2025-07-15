package Com.Vtiger.CRM.Generic.UtilityClasses;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class UtilityClass {


    public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
    public static ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();


    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver actualdriver) {
        driver.set(actualdriver);
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void setTest(ExtentTest actualtest) {
        test.set(actualtest);
    }
}
