package Com.Vtiger.CRM.Object_Repository.Utility;

import Com.Vtiger.CRM.Generic.WebDriver.Utility.WebDriverUtility;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class Logout_Page {
    WebDriver driver;
         public   Logout_Page(WebDriver driver){
             this.driver=driver;
             PageFactory.initElements(driver,this);
            }
    @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
            private WebElement  adminImg;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
            private WebElement SignOutButton;

    public void SignOut() throws InterruptedException {
        WebDriverUtility webDriver=new WebDriverUtility();
        webDriver.mouseMoveToElement(driver,adminImg);
        Thread.sleep(1000);
        webDriver.mouseMoveToElement(driver,SignOutButton);
        SignOutButton.click();
    }





}
