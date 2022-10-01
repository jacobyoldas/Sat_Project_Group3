package StepDefinitions;

import POM.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PositionsSteps extends DialogContent {

    @Then("User click Human resources and setup and positions")
    public void user_click_human_resources_and_setup_and_positions() {

        clickMethod(clickHumanResources);
        clickMethod(clickSetup);
        clickMethod(clickPositions);
    }

    @When("User click plus icon and add {string} and {string} and save")
    public void userClickPlusIconAndAddAndAndSave(String Name, String ShortName) {
        clickMethod(clickPlusIcon);
        sendKeysMethod(addName, Name);
        sendKeysMethod(addShortName, ShortName);
        clickMethod(clickSaveButton);
    }


    @Then("User should see success message")
    public void user_should_see_success_message() {

        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("successfully"));


    }

    @When("User should be able to search {string}and click search button")
    public void userShouldBeAbleToSearchAndClickSearchButton(String invalidName) {
        sendKeysMethod(searchNameInput, invalidName);
        clickSearchButton.click();
    }

    @Then("User should see on display no data message")
    public void userShouldSeeOnDisplayNoDataMessage() {
        wait.until(ExpectedConditions.visibilityOf(noDataDataMessage));
        Assert.assertTrue(noDataDataMessage.getText().contains("data"));
    }

    @And("User edit {string} and {string}")
    public void userEditAnd(String existingName, String newName) throws InterruptedException {
        sendKeysMethod(searchNameInput, existingName);
        clickMethod(clickSearchButton);
        Thread.sleep(3000);
        clickMethod(editbutton);
        sendKeysMethod(addName,newName);
        clickMethod(clickSaveButton);
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("successfully"));
    }





    @When("User should be able to search {string}")
    public void userShouldBeAbleToSearch(String Name) {
        sendKeysMethod(searchNameInput,Name);
        clickSearchButton.click();
    }

    @Then("User should see positions name")
    public void user_should_see_positions_name() {

        wait.until(ExpectedConditions.visibilityOf(positionsMessage));
        Assert.assertTrue(positionsMessage.isDisplayed());
        Assert.assertTrue(positionsMessage.getText().toLowerCase().contains("position"));
    }


    @When("User should be able to search existing {string} and {string} then click search button")
    public void userShouldBeAbleToSearchExistingAndThenClickSearchButton(String Name, String ShortName) {
        sendKeysMethod(searchNameInput, Name);
        sendKeysMethod(searchShortNameInput, ShortName);
        clickMethod(clickSearchButton);
    }

    @And("User should click edit icon and update the {string} and {string} and click save button")
    public void userShouldClickEditIconAndUpdateTheAndAndClickSaveButton(String Name, String ShortName) {
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),2));
        clickMethod(editbutton);
        sendKeysMethod(addName,Name);
        sendKeysMethod(addShortName, ShortName);
        clickMethod(clickSaveButton);
    }

    @Then("User should see updated success message")
    public void userShouldSeeUpdatedSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("successfully"));
    }


    @And("User delete the positions {string}")
    public void userDeleteThePositions(String newName) {
        sendKeysMethod(searchNameInput,newName);
        clickMethod(clickSearchButton);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),2));
        clickMethod(deleteButton);
        clickMethod(deleteSubmit);
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("successfully"));
    }

}