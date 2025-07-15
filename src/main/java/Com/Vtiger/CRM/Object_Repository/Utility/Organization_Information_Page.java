package Com.Vtiger.CRM.Object_Repository.Utility;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class Organization_Information_Page {
    WebDriver driver;
    public Organization_Information_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "mouseArea_Phone")
    private WebElement VerifyPhone;
    @FindBy(id = "dtlview_Industry")
    private WebElement VerifyIndustry;
    @FindBy(id = "dtlview_Type")
    private  WebElement VerifyType;
    @FindBy(xpath = "//span[@class='dvHeaderText']")
    private WebElement HeadText;


}
