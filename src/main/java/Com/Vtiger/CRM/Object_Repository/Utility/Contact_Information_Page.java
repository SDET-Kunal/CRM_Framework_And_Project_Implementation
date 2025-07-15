package Com.Vtiger.CRM.Object_Repository.Utility;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class Contact_Information_Page {
    WebDriver driver;
    public Contact_Information_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@class='dvHeaderText']")
    private WebElement HeadText;


}
