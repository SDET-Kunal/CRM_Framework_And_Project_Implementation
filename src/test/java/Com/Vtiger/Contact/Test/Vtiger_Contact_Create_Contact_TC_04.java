package Com.Vtiger.Contact.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Contact_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Vtiger_Contact_Create_Contact_TC_04 extends BaseClass {
    @Test
    public void Contact_Create_Contact_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnContact().click();
        create_new_contact_page.Create_Contact(ORGValue);
    }
   /* public static void main(String[] args) {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnContact().click();
        create_new_contact_page.Create_Contact(ORGValue);
    }*/
}
/*
PART 1 EDIT
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//        driver.findElement(By.id("submitButton")).click();
  //driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ORGValue);
//        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
  WebElement OrgVerify=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
 */



/*
* PART 2 LATEST EDIT
*  FileUtility file=new FileUtility();
        JavaUtility javaUtility=new JavaUtility();
        ExcelUtility excel=new ExcelUtility();
        WebDriverUtility webdriver=new WebDriverUtility();
        String BROWSER= file.getDataFromPropertiesFile("browser");
        String URL=file.getDataFromPropertiesFile("url");
        String USERNAME=file.getDataFromPropertiesFile("username");
        String PASSWORD=file.getDataFromPropertiesFile("password");
*    WebDriver driver=null;
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
*  webdriver.WaitForPageToLoad(driver);
        driver.manage().window().maximize();
        driver.get(URL);
//        login_page.Login(USERNAME,PASSWORD);
*     // Contact_Page contactPage=new Contact_Page(driver);
*  // Contact_Information_Page contact_information_page=new Contact_Information_Page(driver);
*  contactPage.getClickOnCreateContactIcon().click();
//        create_new_contact_page.getLastName().sendKeys(ORGValue);
//        create_new_contact_page.getSaveButton().click();
//        if (contact_information_page.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
*         Logout_Page logout_page=new Logout_Page(driver);
       logout_page.SignOut();
* */