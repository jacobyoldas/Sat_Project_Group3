package POM;

import Utils.Driver;
import Utils.Driver_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_Base_POM {
  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

  public void waitUntilLoading() {
    WebDriverWait wait = new WebDriverWait(Driver_Base.getDriver(), Duration.ofSeconds(5));
    wait.until(
            ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar//mat-progress-bar"), 0));
  }

  public void sendKeysFunction(WebElement element, String value) {
    waitUntilVisibleAndClickable(element);
    element.sendKeys(value);
  }

  public void waitUntilVisibleAndClickable(WebElement element) {
    wait.until(ExpectedConditions.visibilityOfAllElements(element));
    wait.until(ExpectedConditions.visibilityOf(element));
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  public void scrollToElement(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("arguments[0].scrollIntoView();", element);
  }

  public void clickFunction(WebElement element) {
    waitUntilVisibleAndClickable(element);
    element.click();
  }

  public void selectFunction(WebElement element, String text) {
    waitUntilVisibleAndClickable(element);
    Select select = new Select(element);
    select.selectByValue(text);
  }

  public void validationText(WebElement element, String text) {
    Assert.assertTrue(element.isDisplayed());
    Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
  }

  public void clearFunction(WebElement element) {
    element.clear();
  }

  public void sleep() {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }
}



