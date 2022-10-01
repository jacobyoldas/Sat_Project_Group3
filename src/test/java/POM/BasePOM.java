package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePOM {

    WebDriver driver = Driver.getDriver();
   public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


    public void clickMethod(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysMethod(WebElement element, String value){
        element.clear();
        element.sendKeys(value);


    }





}
