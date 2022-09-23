package Runners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;


@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class}) //just listen and report logs

public class _03_TestRunnerListenerSparkReport extends AbstractTestNGCucumberTests {

}
