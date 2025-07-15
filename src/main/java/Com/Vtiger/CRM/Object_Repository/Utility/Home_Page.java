package Com.Vtiger.CRM.Object_Repository.Utility;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@Getter
public class Home_Page {
    WebDriver driver;
    public Home_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "(//a[contains(text(),'Organizations')])[1]")
    private WebElement ClickOnOrganization;

    @FindBy(xpath = "//a[contains(text(),'Contacts')]")
    private WebElement ClickOnContact;
}
  