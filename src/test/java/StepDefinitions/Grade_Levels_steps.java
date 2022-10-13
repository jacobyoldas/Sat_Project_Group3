package StepDefinitions;

import POM.Grade_Levels_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Grade_Levels_steps {
    Grade_Levels_Elements gradeLevels = new Grade_Levels_Elements();

    @And("User create Grade Levels {string} and {string} and {string}")
    public void userCreateGradeLevelsAndAnd(String name, String order, String shortName) {

        gradeLevels.clickFunction(gradeLevels.getClickHamburger());
        gradeLevels.clickFunction(gradeLevels.getClickSetup());
        gradeLevels.clickFunction(gradeLevels.getClickParameters());
        gradeLevels.clickFunction(gradeLevels.getGradeLevels());
        gradeLevels.waitUntilVisibleAndClickable(gradeLevels.getPlusIcon());
        gradeLevels.clickFunction(gradeLevels.getPlusIcon());

        gradeLevels.sendKeysFunction(gradeLevels.getAddName(), name);
        gradeLevels.sendKeysFunction(gradeLevels.getAddShortName(), shortName);
        gradeLevels.sendKeysFunction(gradeLevels.getAddOrder(), order);

        gradeLevels.clickFunction(gradeLevels.getClickSave());
    }
    @Then("Success add message should be displayed")
    public void successAddMessageShouldBeDisplayed() {

        gradeLevels.getSuccessfullyCreated().isDisplayed();
    }
    @And("User create same Grade Levels {string} and {string} and {string} and {string}")
    public void userCreateSameGradeLevelsAndAndAnd(String name, String shortName, String order) {

        gradeLevels.waitUntilVisibleAndClickable(gradeLevels.getClickHamburger());
        gradeLevels.clickFunction(gradeLevels.getClickHamburger());
        gradeLevels.clickFunction(gradeLevels.getClickSetup());
        gradeLevels.clickFunction(gradeLevels.getClickParameters());
        gradeLevels.clickFunction(gradeLevels.getGradeLevels());
        gradeLevels.waitUntilVisibleAndClickable(gradeLevels.getPlusIcon());
        gradeLevels.clickFunction(gradeLevels.getPlusIcon());

        gradeLevels.sendKeysFunction(gradeLevels.getAddName(), name);
        gradeLevels.sendKeysFunction(gradeLevels.getAddShortName(), shortName);
        gradeLevels.sendKeysFunction(gradeLevels.getAddOrder(), order);

        gradeLevels.clickFunction(gradeLevels.getClickSave());
    }
    @Then("Unsuccessful message should display")
    public void unsuccessfulMessageShouldDisplay() {
    gradeLevels.waitUntilVisibleAndClickable(gradeLevels.getAlreadyExists());
     gradeLevels.validationText(gradeLevels.getAlreadyExists(),"already exists");
  }
    @And("User edit Grade Levels {string} {string} {string}")
    public void userEditGradeLevels(String newName, String newShortName, String newOrder) {


        gradeLevels.clickFunction(gradeLevels.getClickHamburger());
        gradeLevels.clickFunction(gradeLevels.getClickSetup());
        gradeLevels.clickFunction(gradeLevels.getClickParameters());
        gradeLevels.clickFunction(gradeLevels.getGradeLevels());

        gradeLevels.waitUntilVisibleAndClickable(gradeLevels.getEditIcon());
        gradeLevels.clickFunction(gradeLevels.getEditIcon());

        gradeLevels.clearFunction(gradeLevels.getUpdateName());
        gradeLevels.sendKeysFunction(gradeLevels.getUpdateName(),newName);

        gradeLevels.clearFunction(gradeLevels.getUpdateShortName());
        gradeLevels.sendKeysFunction(gradeLevels.getUpdateShortName(), newShortName);

        gradeLevels.clearFunction(gradeLevels.getUpdateOrder());
        gradeLevels.sendKeysFunction(gradeLevels.getUpdateOrder(), newOrder);

        gradeLevels.clickFunction(gradeLevels.getUpdateSave());

    }
    @Then("Success edit message should be displayed")
    public void successEditMessageShouldBeDisplayed() {

        gradeLevels.getUpdatedSuccessfullyMessage().isDisplayed();
    }
    @And("User delete Grade Levels createdName")
    public void userDeleteGradeLevelsCreatedName() {

        gradeLevels.clickFunction(gradeLevels.getClickHamburger());
        gradeLevels.clickFunction(gradeLevels.getClickSetup());
        gradeLevels.clickFunction(gradeLevels.getClickParameters());
        gradeLevels.clickFunction(gradeLevels.getGradeLevels());

        gradeLevels.clickFunction(gradeLevels.getDeleteIcon());
        gradeLevels.clickFunction(gradeLevels.getDeleteButton());

    }
    @Then("Success delete message should be displayed")
    public void successDeleteMessageShouldBeDisplayed() {

        gradeLevels.getDeletedSuccessfully().isDisplayed();
    }




    @And("User create same Grade Levels {string} and {string} and {string}")
    public void userCreateSameGradeLevelsAndAnd(String arg0, String arg1, String arg2) {
    }



}




