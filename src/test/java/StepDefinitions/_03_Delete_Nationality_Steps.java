package StepDefinitions;

import POM._02_Navigation_Bar_Elements;
import POM._03_Dialog_Content_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

public class _03_Delete_Nationality_Steps {

  _02_Navigation_Bar_Elements nb = new _02_Navigation_Bar_Elements();
  _03_Dialog_Content_Elements dc = new _03_Dialog_Content_Elements();

  @Test(priority = 4)
  @Given("User delete nation {string}")
  public void userDeleteNation(String name) {
    nb.clickFunction(nb.getSetupOne());
    nb.clickFunction(nb.getParameters());
    nb.clickFunction(nb.getNationalities());
    dc.waitUntilLoading();
    dc.clearFunction(dc.getSearchInput());
    dc.sendKeysFunction(dc.getSearchInput(),name);
    dc.clickFunction(dc.getSearchButton());
    dc.waitUntilLoading();
    dc.clickFunction(dc.getDeleteButton());
    dc.clickFunction(dc.getDeleteDialogBtn());
  }

  @Test(priority = 5)
  @When("User search deleted {string} in search input")
  public void userSearchDeletedInSearchInput(String name) {
    nb.clickFunction(nb.getSetupOne());
    nb.clickFunction(nb.getParameters());
    nb.clickFunction(nb.getNationalities());
    dc.waitUntilLoading();
    dc.sendKeysFunction(dc.getSearchInput(), name);
    dc.clickFunction(dc.getSearchButton());
    dc.sleep();
  }

  @Then("There is no data should be displayed")
  public void thereIsNoDataShouldBeDisplayed() {
    dc.sleep();
    dc.validationText(dc.getNoDataMessage(), "no");
  }
}
