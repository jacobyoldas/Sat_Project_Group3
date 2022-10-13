package StepDefinitions;

import POM.Login_Page_Elements;
import Utils.Driver;
import com.aventstack.extentreports.service.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks{
  WebDriver driver = Driver.getDriver();
  Login_Page_Elements lp =new Login_Page_Elements();

  @Before
  public void setup() {
    driver.get("https://demo.mersys.io/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    lp.clickFunction(lp.getAcceptCookiesButton());
    lp.sendKeysFunction(lp.getUsernameInput(), "richfield.edu");
    lp.sendKeysFunction(lp.getPasswordInput(), "Richfield2020!");
    lp.clickFunction(lp.getLoginButton());

    // lp.userEnterAdminCredentials();
   }
  @After
  public void tearDown(Scenario scenario){

    if (scenario.isFailed()) {

      TakesScreenshot screenshot = ((TakesScreenshot) driver); // which driver to get a screenshot

      File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

      String scenarioName = scenario.getName();

      File destinationFile = new File("target/FailedScreenshots/" + scenarioName + ".png");

      //Adding the Spark report for screenshot to see
      ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
      try {
        FileUtils.copyFile(srcFile, destinationFile);
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }

    Driver.quitDriver();
  }
  public String getBase64Screenshot()
  {
    return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BASE64);
  }
}


