package Com.Vtiger.Organization.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Organization_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;


public class Vtiger_Organization_Create_Organization_With_PhoneNumber_TC_03 extends BaseClass {
    @Test
    public void Create_Organization_With_PhoneNumber_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",7,2)+javaUtility.getRandomNumber();
        String phone = excel.getDataFromExcel("ORG",7,3);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,phone);
    }
    /*public static void main(String[] args) {

        String ORGValue= excel.getDataFromExcel("ORG",7,2)+javaUtility.getRandomNumber();
        String phone = excel.getDataFromExcel("ORG",7,3);
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue,phone);
    }*/
}
/*
PART 1
 FileInputStream impExcel=new FileInputStream("src/test/resources/DDT.xlsx");
//        Workbook workbook= WorkbookFactory.create(impExcel);
//        Sheet sheet=workbook.getSheet("ORG");
//        Row row=sheet.getRow(7);
//        Cell cell=row.getCell(2);
//        String ORGValue=cell.toString()+randint;
//        String phone=row.getCell(3).toString();
// driver.findElement(By.id("phone")).sendKeys(phone);
 //driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
 WebElement phonenumber= driver.findElement(By.id("mouseArea_Phone"));
//        WebElement OrgVerify=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
 WebElement img =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//        //Signout.click();
//        actions.moveToElement(img).perform();
//        Thread.sleep(2000);
          WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
//        actions.moveToElement(signout).click().perform();
            webDriver.mouseMoveToElement(driver,img);
            Thread.sleep(1000);
            webDriver.mouseMoveToElement(driver,signout);
            signout.click();
        Thread.sleep(1000);
            driver.quit();





            organization_page.getClickOnCreateOrganizationIcon().click();
//        createNewOrganizationPage.getInputDataToOrganizationName().sendKeys(ORGValue);
//        createNewOrganizationPage.getPhoneNumber().sendKeys(phone);
//        createNewOrganizationPage.getSaveButton().click();
//        if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
//        if (organizationInformationPage.getVerifyPhone().getText().trim().equals(phone)) {
//            System.out.println(phone+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(phone+" The data has verify and test case has FAIL ");
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
 Login_Page loginPage= new Login_Page(driver);
        webDriver.WaitForPageToLoad(driver);
        driver.manage().window().maximize();
        driver.get(URL);
//        loginPage.Login(USERNAME,PASSWORD);
  Organization_Page organization_page=new Organization_Page(driver);
//        Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);
 Logout_Page logoutPage=new Logout_Page(driver);
        logoutPage.SignOut();

* */