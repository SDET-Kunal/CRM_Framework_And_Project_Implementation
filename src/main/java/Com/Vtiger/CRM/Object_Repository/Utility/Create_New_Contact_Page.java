package Com.Vtiger.CRM.Object_Repository.Utility;

import Com.Vtiger.CRM.Generic.Java.Utility.JavaUtility;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

@Getter
public class Create_New_Contact_Page {
    WebDriver driver;
    public Create_New_Contact_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement SaveButton;

    @FindBy(xpath = "//input[@name='support_end_date']")
    private WebElement SupportEndDate;

    @FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
    private WebElement OrganizationSelectButton;

    @FindBy(id = "search_txt")
    private WebElement OrganizationSearchField;

    @FindBy(xpath = "//input[@class='crmbutton small create']")
    private WebElement OrganizationSearchButton;

    public void Create_Contact(String ORGValue){
        Contact_Page contactPage=new Contact_Page(driver);
        Contact_Information_Page contact_information_page=new Contact_Information_Page(driver);
        contactPage.getClickOnCreateContactIcon().click();
        getLastName().sendKeys(ORGValue);
        getSaveButton().click();
        Boolean Contact_Info=contact_information_page.getHeadText().getText().contains(ORGValue);
        Assert.assertEquals(Contact_Info,true);
//        if (contact_information_page.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
    }
    public void Create_Contact(String ORGValue,int Difference){
        Contact_Page contactPage=new Contact_Page(driver);
        JavaUtility javaUtility=new JavaUtility();
        Contact_Information_Page contact_information_page=new Contact_Information_Page(driver);
        contactPage.getClickOnCreateContactIcon().click();
        getLastName().sendKeys(ORGValue);
        getSupportEndDate().clear();
        getSupportEndDate().sendKeys(javaUtility.getPreviousMonthOrFutureMonthInFormOf_YYYY_MM_DD(Difference));
        getSaveButton().click();
        Boolean Contact_Info=contact_information_page.getHeadText().getText().contains(ORGValue);
        Assert.assertEquals(Contact_Info,true);
//        if (contact_information_page.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
    }
}
