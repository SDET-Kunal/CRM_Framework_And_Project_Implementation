package Com.Vtiger.CRM.Object_Repository.Utility;

import Com.Vtiger.CRM.Generic.WebDriver.Utility.WebDriverUtility;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

@Getter
public class Create_New_Organization_Page {
    WebDriver driver;
    public Create_New_Organization_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//input[@name='accountname']")
    private WebElement InputDataToOrganizationName;

    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement SaveButton;

    @FindBy(xpath = "//select[@name='industry']")
    private WebElement Industry;

    @FindBy(xpath = "//select[@name='accounttype']")
    private WebElement Type;

    @FindBy(id = "phone")
    private WebElement PhoneNumber;

    public void Create_Organization(String ORGValue){
        Organization_Page organization_page=new Organization_Page(driver);
        Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);
        organization_page.getClickOnCreateOrganizationIcon().click();
        getInputDataToOrganizationName().sendKeys(ORGValue);
        getSaveButton().click();
        Boolean OrgInfo=organizationInformationPage.getHeadText().getText().contains(ORGValue);
        Assert.assertEquals(OrgInfo,true);
//        if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
    }

    public void Create_Organization(String ORGValue,String Industry,String Type){
        Organization_Page organization_page=new Organization_Page(driver);
        Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        WebDriverUtility webDriver=new WebDriverUtility();
        organization_page.getClickOnCreateOrganizationIcon().click();
        getInputDataToOrganizationName().sendKeys(ORGValue);
        webDriver.Select( createNewOrganizationPage.getIndustry(),Industry);
        webDriver.Select(createNewOrganizationPage.getType(),Type);
        createNewOrganizationPage.getSaveButton().click();
        Boolean OrgInfo=organizationInformationPage.getHeadText().getText().contains(ORGValue);
        Assert.assertEquals(OrgInfo,true);
//        if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue +" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue +" The data has verify and test case has FAIL ");
//        }
        Boolean IndustryValue=organizationInformationPage.getVerifyIndustry().getText().equals(Industry);
        Assert.assertEquals(IndustryValue,true);
//        if (organizationInformationPage.getVerifyIndustry().getText().equals(Industry)) {
//            System.out.println(Industry+" The data has verify and test case has PASS ");
//
//        }else{
//            System.out.println(Industry+" The data has verify and test case has FAIL ");
//        }
        Boolean TypeValue=organizationInformationPage.getVerifyType().getText().equals(Type);
        Assert.assertEquals(TypeValue,true);
//        if (organizationInformationPage.getVerifyType().getText().equals(Type)) {
//            System.out.println(Type+" The data has verify and test case has PASS ");
//
//        }else{
//            System.out.println(Type+" The data has verify and test case has FAIL ");
//        }
    }
    public void Create_Organization(String ORGValue,String Phone){
        Organization_Page organization_page=new Organization_Page(driver);
        Organization_Information_Page organizationInformationPage=new Organization_Information_Page(driver);
        Create_New_Organization_Page createNewOrganizationPage=new Create_New_Organization_Page(driver);
        organization_page.getClickOnCreateOrganizationIcon().click();
        createNewOrganizationPage.getInputDataToOrganizationName().sendKeys(ORGValue);
        createNewOrganizationPage.getPhoneNumber().sendKeys(Phone);
        createNewOrganizationPage.getSaveButton().click();
        Boolean OrgInfo=organizationInformationPage.getHeadText().getText().contains(ORGValue);
        Assert.assertEquals(OrgInfo,true);
//        if (organizationInformationPage.getHeadText().getText().contains(ORGValue)) {
//            System.out.println(ORGValue+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(ORGValue+" The data has verify and test case has FAIL ");
//        }
        Boolean PhoneValue=organizationInformationPage.getVerifyPhone().getText().trim().equals(Phone);
        Assert.assertEquals(PhoneValue,true);
//        if (organizationInformationPage.getVerifyPhone().getText().trim().equals(Phone)) {
//            System.out.println(Phone+" The data has verify and test case has PASS ");
//        }else{
//            System.out.println(Phone+" The data has verify and test case has FAIL ");
//        }
    }

}
