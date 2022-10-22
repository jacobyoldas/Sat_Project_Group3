package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepDefinitions"},
    plugin= {"html:target/site/cucumber-reports.html"}
)

public class _01_TestRunnerAll extends AbstractTestNGCucumberTests {



}
