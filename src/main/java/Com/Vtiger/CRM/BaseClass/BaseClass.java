package Com.Vtiger.CRM.BaseClass;

import Com.Vtiger.CRM.Generic.DataBase.Utility.MySQLUtility;
import Com.Vtiger.CRM.Generic.Files.Utility.ExcelUtility;
import Com.Vtiger.CRM.Generic.Files.Utility.FileUtility;
import Com.Vtiger.CRM.Generic.Java.Utility.JavaUtility;
import Com.Vtiger.CRM.Generic.UtilityClasses.UtilityClass;
import Com.Vtiger.CRM.Generic.WebDriver.Utility.WebDriverUtility;
import Com.Vtiger.CRM.Object_Repository.Utility.Login_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Logout_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author kunal
 */

public class BaseClass extends WebDriverUtility {
    public MySQLUtility mySQLUtility=new MySQLUtility();
    public FileUtility file=new FileUtility();
    public JavaUtility javaUtility=new JavaUtility();
    public ExcelUtility excel=new ExcelUtility();
    public WebDriver driver=null;
    public static  WebDriver staticdriver=null;



    @BeforeSuite(groups = {"SmokeTestCase","RegressionTestCase"})
    public void GetConnection() throws SQLException {
        Reporter.log("Before Suite Executed",true);
        mySQLUtility.getConnection();

    }
//    @Parameters("BROWSER")
//    String browser;
    @BeforeClass(groups = {"SmokeTestCase","RegressionTestCase"})
    public void LunchBrowser() throws IOException {
        Reporter.log("Before Class Executed",true);

//        String BROWSER=browser;
        String BROWSER=file.getDataFromPropertiesFile("browser");
        if(BROWSER.equals("Chrome")){
            driver=new ChromeDriver();
        }else if (BROWSER.equals("Firefox")) {
            driver=new FirefoxDriver();
        }else if(BROWSER.equals("Edge")){
            driver=new EdgeDriver();
        }else {
            driver=new ChromeDriver();
        }
        staticdriver=driver;
        UtilityClass.setDriver(driver);
    }

    @BeforeMethod(groups = {"SmokeTestCase","RegressionTestCase"})
    public void Login() throws IOException {
        Reporter.log("Before Method Executed",true);

        Login_Page loginPage=new Login_Page(driver);
        WaitForPageToLoad(driver);
        String URL=file.getDataFromPropertiesFile("url");
        String USERNAME=file.getDataFromPropertiesFile("username");
        String PASSWORD=file.getDataFromPropertiesFile("password");
        loginPage.Login(URL,USERNAME,PASSWORD);
    }
    @AfterMethod(groups = {"SmokeTestCase","RegressionTestCase"})
    public void Logout() throws InterruptedException {
        Reporter.log("After Method Executed",true);

        Logout_Page logoutPage=new Logout_Page(driver);
        logoutPage.SignOut();
    }

    @AfterClass(groups = {"SmokeTestCase","RegressionTestCase"})
    public void ClosedBrowser(){
        Reporter.log("After Class Executed",true);
        driver.close();
    }

    @AfterSuite(groups = {"SmokeTestCase","RegressionTestCase"})
    public void ClosedConnection() throws SQLException {
        Reporter.log("After Suite Executed",true);
        mySQLUtility.CloseConnection();
    }
}
