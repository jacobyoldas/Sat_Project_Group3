package Runners;

import Utils.Driver;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepDefinitions"}
)

public class _06_TestRunnerParallelExtentSparkReport extends AbstractTestNGCucumberTests {

  @BeforeClass(alwaysRun = true)
  @Parameters("browser")
  public void beforeClass(String browser) {
    Driver.threadBrowserName.set(browser);
  }
  @AfterClass
  public static void writeExtentReport() {
    ExtentService.getInstance().setSystemInfo("User Name", "Yoldas");
    ExtentService.getInstance().setSystemInfo("Application Name", "Luma");
    ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
    ExtentService.getInstance().setSystemInfo("Department", "QA");
  }
}
