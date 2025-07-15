package Com.Vtiger.Organization.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Organization_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Vtiger_Organization_Create_Organization_TC_01  extends BaseClass {
    @Test
    public void Create_Organization_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();

        createNewOrganizationPage.Create_Organization(ORGValue);
    }
   /* public static void main(String[] args) {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page homePage=new Home_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        homePage.getClickOnOrganization().click();
        createNewOrganizationPage.Create_Organization(ORGValue);
    }*/
}
/*
PART 1 Editor
//driver.manage().window().maximize();
 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//        driver.findElement(By.id("submitButton")).click();
//        loginPage.getUsername().sendKeys(USERNAME);
//        loginPage.getPassword().sendKeys(PASSWORD);
//        loginPage.getSubmit().click();
 driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
//        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//        driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(ORGValue);
//        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//         WebElement OrgVerify=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
  WebElement img =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//        //Signout.click();
//        actions.moveToElement(img).perform();
//        Thread.sleep(2000);
        WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
//        actions.moveToElement(signout).click().perform();
        webDriver.mouseMoveToElement(driver,img);
        Thread.sleep(1000);
        webDriver.mouseMoveToElement(driver,signout);
        Thread.sleep(1000);
        signout.click();
        driver.close();

        organization_page.getClickOnCreateOrganizationIcon().click();
//        createNewOrganizationPage.getInputDataToOrganizationName().sendKeys(ORGValue);
//        createNewOrganizationPage.getSaveButton().click();
//         if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//         }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//         }


 */
/*
PART 2 Latest EDIT
*   FileUtility file=new FileUtility();
//        JavaUtility javaUtility=new JavaUtility();
//        ExcelUtility excel=new ExcelUtility();
//         String BROWSER= file.getDataFromPropertiesFile("browser");
//         String URL=file.getDataFromPropertiesFile("url");
//         String USERNAME=file.getDataFromPropertiesFile("username");
//         String PASSWORD=file.getDataFromPropertiesFile("password");
*  WebDriver driver=null;
//         if(BROWSER.equals("Chrome")){
//             driver=new ChromeDriver();
//         } else if (BROWSER.equals("Firefox")) {
//             driver=new FirefoxDriver();
//         }else if(BROWSER.equals("Edge")){
//             driver=new EdgeDriver();
//         }else {
//             driver=new ChromeDriver();
//         }
//         WebDriverUtility webDriver=new WebDriverUtility();
*   Organization_Page organization_page=new Organization_Page(driver);
//         Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);
*   Login_Page loginPage= new Login_Page(driver);
//         webDriver.WaitForPageToLoad(driver);
//         driver.get(URL);
//         loginPage.Login(USERNAME,PASSWORD);
*  Logout_Page logoutPage=new Logout_Page(driver);
//        logoutPage.SignOut();
* */