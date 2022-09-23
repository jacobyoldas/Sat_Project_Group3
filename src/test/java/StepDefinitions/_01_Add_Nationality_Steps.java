package StepDefinitions;

import POM._02_Navigation_Bar_Elements;
import POM._03_Dialog_Content_Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.testng.annotations.Test;

public class _01_Add_Nationality_Steps {

  _02_Navigation_Bar_Elements nb = new _02_Navigation_Bar_Elements();
  _03_Dialog_Content_Elements dc = new _03_Dialog_Content_Elements();

  @Test(priority =1,dataProvider = "getData")
  @Given("User add nation {string}")
  public void userAddNation(String name){
    nb.sleep();
    nb.clickFunction(nb.getSetupOne());
    nb.clickFunction(nb.getParameters());
    nb.clickFunction(nb.getNationalities());
    dc.clickFunction(dc.getAddButton());
    dc.sendKeysFunction(dc.getNameInput(), name);
    dc.clickFunction(dc.getSaveButton());

  }

  @Test(priority =2,enabled=false)
  @When("User add same nation name")
  public void userAddSameNationName(DataTable dataTable) {
    nb.sleep();
    nb.clickFunction(nb.getSetupOne());
    nb.clickFunction(nb.getParameters());
    nb.clickFunction(nb.getNationalities());
    dc.clickFunction(dc.getAddButton());
    List<List<String>> testData = dataTable.asLists();
    for (List<String> data : testData) {
      dc.sendKeysFunction(dc.getNameInput(), data.get(0));
      dc.clickFunction(dc.getSaveButton());
//      dc.sleep();
      dc.clearFunction(dc.getNameInput());
    }
  }


  @Then("Success message should be displayed")
  public void successMessageShouldBeDisplayed() {
    dc.validationText(dc.getSuccessMessage(), "successfully");
  }

  @Then("Exist message should be displayed")
  public void existMessageShouldBeDisplayed() {
    dc.validationText(dc.getAlreadyExist(), "exist");
  }

//  @DataProvider(name = "getData") // Enter your correct email and correct password
//  public Object [][] testDataProvider() {
//    return new Object[][] { {"yasinyoldas","gggg"}};
//   }


}



