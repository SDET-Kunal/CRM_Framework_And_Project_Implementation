package Com.Vtiger.CRM.Object_Repository.Utility;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class Login_Page {
    WebDriver driver;
    public Login_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="user_name")
   private WebElement Username;

    @FindBy(name="user_password")
    private WebElement Password;

    @FindBy(id="submitButton")
    private WebElement Submit;

    public void Login(String URL,String Username,String Password){
                driver.manage().window().maximize();
                driver.get(URL);
                getUsername().sendKeys(Username);
                getPassword().sendKeys(Password);
                getSubmit().click();

    }

}
