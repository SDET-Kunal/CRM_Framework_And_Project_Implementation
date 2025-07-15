package Com.Vtiger.Organization.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Organization_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Vtiger_Organization_Create_Organization_With_Industry_TC_02 extends BaseClass {
    @Test
    public void Create_Organization_With_Industry_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",4,2)+javaUtility.getRandomNumber();
        String industryValue= excel.getDataFromExcel("ORG",4,3);
        String typeValue = excel.getDataFromExcel("ORG",4,4);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,industryValue,typeValue);
    }
   /* public static void main(String[] args) {

        String ORGValue= excel.getDataFromExcel("ORG",4,2)+javaUtility.getRandomNumber();
        String industryValue= excel.getDataFromExcel("ORG",4,3);
        String typeValue = excel.getDataFromExcel("ORG",4,4);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,industryValue,typeValue);

    }*/
}


/*
PART 1 EDIT
WebElement indu=driver.findElement(By.xpath("//select[@name='industry']"));
//        Select select1=new Select(indu);
//        select1.selectByVisibleText(industry);
 // WebElement typ=driver.findElement(By.xpath("//select[@name='accounttype']"));
 Select select2=new Select(typ);
//        select2.selectByVisibleText(type);
 WebElement verifyIdustry=driver.findElement(By.id("dtlview_Industry"));
//        WebElement verifyType=driver.findElement(By.id("dtlview_Type"));
//        WebElement OrgVerify=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));




organization_page.getClickOnCreateOrganizationIcon().click();
//        createNewOrganizationPage.getInputDataToOrganizationName().sendKeys(ORGValue);
//        webDriver.Select( createNewOrganizationPage.getIndustry(),industryValue);
//        webDriver.Select(createNewOrganizationPage.getType(),typeValue);
//        createNewOrganizationPage.getSaveButton().click();
//        if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(typeValue +" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(typeValue +" The data has verify and test case has FAIL ");
//        }
//        if (organizationInformationPage.getVerifyIndustry().getText().equals(industryValue)) {
//            System.out.println(industryValue+" The data has verify and test case has PASS ");
//
//        }else{
//            System.out.println(industryValue+" The data has verify and test case has FAIL ");
//        }
//        if (organizationInformationPage.getVerifyType().getText().equals(typeValue)) {
//            System.out.println(typeValue+" The data has verify and test case has PASS ");
//
//        }else{
//            System.out.println(typeValue+" The data has verify and test case has FAIL ");
//        }
 */


/*
PART 2 Latest EDIT
 FileUtility file=new FileUtility();
        JavaUtility javaUtility=new JavaUtility();
        ExcelUtility excel=new ExcelUtility();
        WebDriverUtility webDriver=new WebDriverUtility();
        String BROWSER= file.getDataFromPropertiesFile("browser");
        String URL=file.getDataFromPropertiesFile("url");
        String USERNAME=file.getDataFromPropertiesFile("username");
        String PASSWORD=file.getDataFromPropertiesFile("password");
        WebDriver driver=null;

          if(BROWSER.equals("Chrome")){
            driver=new ChromeDriver();

        } else if (BROWSER.equals("Firefox")) {
            driver=new FirefoxDriver();

        }else if(BROWSER.equals("Edge")){
            driver=new EdgeDriver();
        }else {
            driver=new ChromeDriver();
        }
        /        Organization_Page organization_page=new Organization_Page(driver);
//        Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);



 webDriver.WaitForPageToLoad(driver);
        driver.manage().window().maximize();
        driver.get(URL);
//        loginPage.Login(USERNAME,PASSWORD);

   Logout_Page logoutPage=new Logout_Page(driver);
        logoutPage.SignOut();
* */