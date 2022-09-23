package StepDefinitions;

import POM._02_Navigation_Bar_Elements;
import POM._03_Dialog_Content_Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import java.util.List;
import org.testng.annotations.Test;

public class _02_Edit_Nationality_Steps {

  _02_Navigation_Bar_Elements nb = new _02_Navigation_Bar_Elements();
  _03_Dialog_Content_Elements dc = new _03_Dialog_Content_Elements();

  @Test(priority =3,invocationCount=2)
  @Given("User edit nation name")
  public void userEditNationName(DataTable dataTable) {
    nb.clickFunction(nb.getSetupOne());
    nb.clickFunction(nb.getParameters());
    nb.clickFunction(nb.getNationalities());
    dc.waitUntilLoading();
    List<List<String>> testData = dataTable.asLists();

    dc.clearFunction(dc.getSearchInput());
    dc.sendKeysFunction(dc.getSearchInput(), testData.get(0).get(0));
    dc.clickFunction(dc.getSearchButton());
    dc.sleep();
    dc.clickFunction(dc.getEditButton());
    dc.clearFunction(dc.getSearchInput2());
    dc.sendKeysFunction(dc.getSearchInput2(), "UKY1");
    dc.clickFunction(dc.getSaveButton());
    dc.sleep();

    dc.clearFunction(dc.getSearchInput());
    dc.sendKeysFunction(dc.getSearchInput(), testData.get(0).get(1));
    dc.clickFunction(dc.getSearchButton());
    dc.sleep();
    dc.clickFunction(dc.getEditButton());
    dc.clearFunction(dc.getSearchInput2());
    dc.sendKeysFunction(dc.getSearchInput2(), "RUY2");
    dc.clickFunction(dc.getSaveButton());
    dc.sleep();
//    dc.clearFunction(dc.getSearchInput());
//    dc.sendKeysFunction(dc.getSearchInput(), testData.get(1).get(0));
//    dc.clickFunction(dc.getSearchButton());
//    dc.sleep();
//    dc.clickFunction(dc.getEditButton());
//    dc.clearFunction(dc.getSearchInput2());
//    dc.sendKeysFunction(dc.getSearchInput2(), "WER3");
//    dc.clickFunction(dc.getSaveButton());
//    dc.sleep();
//    dc.clearFunction(dc.getSearchInput());
//    dc.sendKeysFunction(dc.getSearchInput(), testData.get(1).get(1));
//    dc.clickFunction(dc.getSearchButton());
//    dc.sleep();
//    dc.clickFunction(dc.getEditButton());
//    dc.clearFunction(dc.getSearchInput2());
//    dc.sendKeysFunction(dc.getSearchInput2(), "POR4");
//    dc.clickFunction(dc.getSaveButton());
  }
}
