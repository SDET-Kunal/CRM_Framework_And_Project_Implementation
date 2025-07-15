package Com.Vtiger.Contact.Test;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Object_Repository.Utility.Create_New_Contact_Page;
import Com.Vtiger.CRM.Object_Repository.Utility.Home_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Vtiger_Contact_Create_Contact_With_SupportDate_TC_05 extends BaseClass {

//    public static void main(String[] args) {
//        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
//        Home_Page home_page=new Home_Page(driver);
//        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
//        home_page.getClickOnContact().click();
//        create_new_contact_page.Create_Contact(ORGValue,1);
//    }
    @Test
    public void Create_Contact_With_SupportDate_Test() throws IOException {
        String ORGValue= excel.getDataFromExcel("ORG",1,2)+javaUtility.getRandomNumber();
        Home_Page home_page=new Home_Page(driver);
        Create_New_Contact_Page create_new_contact_page=new Create_New_Contact_Page(driver);
        home_page.getClickOnContact().click();
        create_new_contact_page.Create_Contact(ORGValue,1);
    }
}
/*
PART 1 EDIT
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
        driver.findElement(By.id("submitButton")).click();
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
         driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ORGValue);

//        Date dateObj=new Date();
//        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        String actualDate=dateFormat.format(dateObj);
//
//        Calendar calendar=dateFormat.getCalendar();
//        calendar.add(Calendar.DAY_OF_MONTH,30);
//        String daterequire=dateFormat.format(calendar.getTime());
//        driver.findElement(By.xpath("//input[@name='support_end_date']")).clear();
//        driver.findElement(By.xpath("//input[@name='support_end_date']")).sendKeys(daterequire);
//        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();






 contactPage.getClickOnCreateContactIcon().click();
//        create_new_contact_page.getLastName().sendKeys(ORGValue);
//        create_new_contact_page.getSupportEndDate().clear();
//        create_new_contact_page.getSupportEndDate().sendKeys(javaUtility.getPreviousMonthOrFutureMonthInFormOf_YYYY_MM_DD(1));
//        create_new_contact_page.getSaveButton().click();
//        WebElement OrgVerify=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
//        if (contact_information_page.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
 */

/*PART 2 LATEST EDIT
* FileUtility file=new FileUtility();
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
        WebDriverUtility webdriver=new WebDriverUtility();
        Login_Page login_page=new Login_Page(driver);
*
*  Logout_Page logout_page=new Logout_Page(driver);
        webdriver.WaitForPageToLoad(driver);
        driver.manage().window().maximize();
        driver.get(URL);
//        login_page.Login(USERNAME,PASSWORD);
*  Contact_Information_Page contact_information_page=new Contact_Information_Page(driver);
*   Contact_Page contactPage=new Contact_Page(driver);
*  logout_page.SignOut();
*
* */