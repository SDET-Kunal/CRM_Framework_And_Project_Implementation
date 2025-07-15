package Com.Vtiger.CRM.Generic.WebDriver.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WebDriverUtility {

        public void WaitForPageToLoad(WebDriver driver){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        public void WaitForElementToLoad(WebDriver driver,WebElement element){
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(element));

        }
        public void SwitchToTabBasedOnURL(WebDriver driver, String partialURL) {
            Set<String> set = driver.getWindowHandles();
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String windowId = iterator.next();
                driver.switchTo().window(windowId);
                String actualURL = driver.getCurrentUrl();
                if (actualURL.contains(partialURL)) {
                    break;
                }
            }
        }
        public void SwitchToTabBasedOnTitle(WebDriver driver, String partilTitle){
            Set<String> set=driver.getWindowHandles();
            Iterator<String> iterator= set.iterator();
            while(iterator.hasNext()){
                String windowId=iterator.next();
                driver.switchTo().window(windowId);
                String actualURL=driver.getTitle();
                if(actualURL.contains(partilTitle)){
                    break;
                }
            }
        }
        public void SwitchToFrame(WebDriver driver, int index){
            driver.switchTo().frame(index);
        }
        public void SwitchToFrame(WebDriver driver, String framenameID){
            driver.switchTo().frame(framenameID);
        }
        public void SwitchToFrame(WebDriver driver, WebElement element){
            driver.switchTo().frame(element);
        }
        public void SwitchToAlertAccept(WebDriver driver){
        driver.switchTo().alert().accept();
        }
        public void SwitchToAlertAcceptDismiss(WebDriver driver){
        driver.switchTo().alert().dismiss();
        }

        public void Select(WebElement element, String text){
            Select select=new Select(element);
            select.selectByVisibleText(text);
        }
        public void Select(WebElement element, int  index){
            Select select=new Select(element);
            select.selectByIndex(index);
        }
        public void mouseMoveToElement(WebDriver driver, WebElement element){
            Actions action=new Actions(driver);
            action.moveToElement(element).perform();
        }
        public void mouseDoubleClick(WebDriver driver, WebElement element){
            Actions action=new Actions(driver);
            action.doubleClick(element).perform();
        }

}
