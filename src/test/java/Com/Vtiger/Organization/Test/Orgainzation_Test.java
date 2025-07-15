package Com.Vtiger.Organization.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Organization_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Orgainzation_Test extends BaseClass {
    @Test(groups = "SmokeTestCase")
    public void Create_Organization_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue);
    }
    @Test(groups ="RegressionTestCase")
    public void Create_Organization_With_Industry_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",4,2)+javaUtility.getRandomNumber();
        String industryValue= excel.getDataFromExcel("ORG",4,3);
        String typeValue = excel.getDataFromExcel("ORG",4,4);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,industryValue,typeValue);
    }
    @Test(groups ="RegressionTestCase")
    public void Create_Organization_With_PhoneNumber_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",7,2)+javaUtility.getRandomNumber();
        String phone = excel.getDataFromExcel("ORG",7,3);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,phone);
    }
}
