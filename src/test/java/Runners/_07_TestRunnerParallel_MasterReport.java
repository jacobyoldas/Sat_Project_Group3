package Runners;


import Utils.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
    tags = "@Regression",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepDefinitions"},
    plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}// master report
)
public class _07_TestRunnerParallel_MasterReport extends AbstractTestNGCucumberTests {

  @BeforeClass(alwaysRun = true)
  @Parameters("browser")
  public void beforeClass(String browser)
  {
    Driver.threadBrowserName.set(browser);

  }

}
