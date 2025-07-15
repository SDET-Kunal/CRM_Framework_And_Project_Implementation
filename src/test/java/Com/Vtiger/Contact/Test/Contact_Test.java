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

public class Contact_Test extends BaseClass {
    @Test(groups = "SmokeTestCase")
    public void Contact_Create_Contact_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnContact().click();
        create_new_contact_page.Create_Contact(ORGValue);
    }

    @Test(groups ="RegressionTestCase")
    public void Create_Contact_With_SupportDate_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnContact().click();
        create_new_contact_page.Create_Contact(ORGValue,1);
    }
    @Test(groups ="RegressionTestCase")
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
}
