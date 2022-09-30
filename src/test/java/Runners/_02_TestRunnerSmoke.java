package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles"},
    glue = {"StepDefinitions"},
//    plugin= {"html:target/site/cucumber-smoke-reports.html"}
    plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class _02_TestRunnerSmoke extends AbstractTestNGCucumberTests {
  @AfterClass
  public static void writeExtentReport() {
    ExtentService.getInstance().setSystemInfo("User Name", "YYOLDAS");
    ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
    ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
    ExtentService.getInstance().setSystemInfo("Department", "QA");
    ExtentService.getInstance().setSystemInfo("Extra Info", "Info");
  }


}
