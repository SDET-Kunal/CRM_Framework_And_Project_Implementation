package Com.Vtiger.Contact.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Generic.WebDriver.Utility.WebDriverUtility;
import Com.Vtiger.CRM.Object_Repository.Utility.Contact_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Contact_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Organization_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class Vtiger_Contact_Create_Contact_With_Organization_TC_06 extends BaseClass {
    @Test
    public void Create_Contact_With_Organization_Test() throws InterruptedException, IOException {
        WebDriverUtility webDriver=new WebDriverUtility();
        String OrgValue=excel.getDataFromExcel("ORG",7,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Organization_Page create_new_organization_page=new Create_New_Organization_Page(driver);
        Contact_Page contactPage=new Contact_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnOrganization().click();
        create_new_organization_page.Create_Organization(OrgValue);
        Thread.sleep(1000);
        home_page.getClickOnContact().click();
        contactPage.getClickOnCreateContactIcon().click();
        create_new_contact_page.getLastName().sendKeys("");
        create_new_contact_page.getSaveButton().click();
        webDriver.SwitchToAlertAccept(driver);
        String value="XYZ"+javaUtility.getRandomNumber();
        create_new_contact_page.getLastName().sendKeys(value);
        Thread.sleep(1000);
        create_new_contact_page.getOrganizationSelectButton().click();
        webDriver.SwitchToTabBasedOnURL(driver,"module=Accounts&action");
        Thread.sleep(2000);
        create_new_contact_page.getOrganizationSearchField().sendKeys(OrgValue);
        create_new_contact_page.getOrganizationSearchButton().click();
        driver.findElement(By.xpath("//a[text()='"+OrgValue+"']")).click();
        // driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td/a[contains(text(),'WhatsApp')]")).click();
        webDriver.SwitchToTabBasedOnURL(driver,"module=Contacts&action");
        create_new_contact_page.getSaveButton().click();
        Thread.sleep(1000);
        WebElement Orgname=driver.findElement(By.xpath("//div[@id='tblContactInformation']/table/tbody/tr[3]/td[2]/a[contains(text(),'"+OrgValue+"')]"));
        System.out.println("Act:"+OrgValue+" exp:"+Orgname.getText());
        if (Orgname.getText().equals(OrgValue)) {
            System.out.println(OrgValue+" The data has verify and test case has PASS ");
        }else{
            System.out.println(OrgValue+" The data has verify and test case has FAIL ");
        }
    }
   /* public static void main(String[] args) {
        WebDriverUtility webDriver=new WebDriverUtility();
        String OrgValue=excel.getDataFromExcel("ORG",7,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Organization_Page create_new_organization_page=new Create_New_Organization_Page(driver);
        Contact_Page contactPage=new Contact_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnOrganization().click();
        create_new_organization_page.Create_Organization(OrgValue);
        Thread.sleep(1000);
        home_page.getClickOnContact().click();
        contactPage.getClickOnCreateContactIcon().click();
        create_new_contact_page.getLastName().sendKeys("");
        create_new_contact_page.getSaveButton().click();
        webDriver.SwitchToAlertAccept(driver);
        String value="XYZ"+javaUtility.getRandomNumber();
        create_new_contact_page.getLastName().sendKeys(value);
        Thread.sleep(1000);
        create_new_contact_page.getOrganizationSelectButton().click();
        webDriver.SwitchToTabBasedOnURL(driver,"module=Accounts&action");
        Thread.sleep(2000);
        create_new_contact_page.getOrganizationSearchField().sendKeys(OrgValue);
        create_new_contact_page.getOrganizationSearchButton().click();
        driver.findElement(By.xpath("//a[text()='"+OrgValue+"']")).click();
        // driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td/a[contains(text(),'WhatsApp')]")).click();
        webDriver.SwitchToTabBasedOnURL(driver,"module=Contacts&action");
        create_new_contact_page.getSaveButton().click();
        Thread.sleep(1000);
        WebElement Orgname=driver.findElement(By.xpath("//div[@id='tblContactInformation']/table/tbody/tr[3]/td[2]/a[contains(text(),'"+OrgValue+"')]"));
        System.out.println("Act:"+OrgValue+" exp:"+Orgname.getText());
        if (Orgname.getText().equals(OrgValue)) {
            System.out.println(OrgValue+" The data has verify and test case has PASS ");
        }else{
            System.out.println(OrgValue+" The data has verify and test case has FAIL ");
        }

    }*/
    }

/*
PART 1 EDIT

 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//        driver.findElement(By.id("submitButton")).click();
 driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
//        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//        driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgValue);
//        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
 driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
//        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("");
//        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
   // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value);
   //driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
 // driver.findElement(By.id("search_txt")).sendKeys(OrgValue);
//        driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
 // driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//        WebElement img =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
////        //Signout.click();
////        actions.moveToElement(img).perform();
////        Thread.sleep(2000);
//        WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
////        actions.moveToElement(signout).click().perform();
//        webDriver.mouseMoveToElement(driver,img);
//        Thread.sleep(1000);
//        webDriver.mouseMoveToElement(driver,signout);
//        Thread.sleep(1000);
//        signout.click();
//        driver.close();

 organization_page.getClickOnCreateOrganizationIcon().click();
//        create_new_organization_page.getInputDataToOrganizationName().sendKeys(OrgValue);
//        create_new_organization_page.getSaveButton().click();
 */

/*PART 2 LATEST EDIT
  FileUtility file=new FileUtility();
        String BROWSER=file.getDataFromPropertiesFile("browser");
        String URL=file.getDataFromPropertiesFile("url");
        String USERNAME=file.getDataFromPropertiesFile("username");
        String PASSWORD=file.getDataFromPropertiesFile("password");
        JavaUtility javaUtility=new JavaUtility();
        ExcelUtility excel=new ExcelUtility();
* WebDriver driver=null;
        if(BROWSER.equals("Chrome")){
            driver=new ChromeDriver();
        } else if (BROWSER.equals("Firefox")) {
            driver=new FirefoxDriver();
        }else if(BROWSER.equals("Edge")){
            driver=new EdgeDriver();
        }else {
            driver=new ChromeDriver();
        }
        Login_Page login_page=new Login_Page(driver);
        //        Organization_Page organization_page=new Organization_Page(driver);

          Logout_Page logout_page=new Logout_Page(driver);
        WebDriverUtility webDriver=new WebDriverUtility( );
        webDriver.WaitForPageToLoad(driver);
        driver.manage().window().maximize();
        driver.get(URL);
//        login_page.Login(USERNAME,PASSWORD);
           logout_page.SignOut();

*/