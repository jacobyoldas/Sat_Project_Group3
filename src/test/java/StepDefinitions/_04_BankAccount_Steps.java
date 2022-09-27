package StepDefinitions;

import POM._02_Navigation_Bar_Elements;
import POM._03_Dialog_Content_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _04_BankAccount_Steps {

    _02_Navigation_Bar_Elements nb = new _02_Navigation_Bar_Elements();
    _03_Dialog_Content_Elements dc = new _03_Dialog_Content_Elements();

    @And("User create Bank Account {string} and {string} and {string}")
    public void userCreateBankAccountAndAnd(String bankName, String iban, String integrationCode) {

        nb.clickFunction(nb.getSetupOne());
        nb.clickFunction(nb.getParameters());
        nb.clickFunction(nb.getBankAccountButton());
        dc.clickFunction(dc.getAddButton());
        dc.sendKeysFunction(dc.getNameInput(), bankName);
        dc.sendKeysFunction(dc.getIbanInput(), iban);
        dc.clickFunction(dc.getCurrencyInputDropdown());
        dc.clickFunction(dc.getCurrencyEur());
        dc.sendKeysFunction(dc.getIntegrationCodeInput(), integrationCode);
        dc.clickFunction(dc.getSaveButton());

    }

    @And("User create same Bank Account {string} and {string} and {string}")
    public void userCreateSameBankAccountAndAnd(String bankName, String iban, String integrationCode) {

        nb.clickFunction(nb.getSetupOne());
        nb.clickFunction(nb.getParameters());
        nb.clickFunction(nb.getBankAccountButton());
        dc.clickFunction(dc.getAddButton());
        dc.sendKeysFunction(dc.getNameInput(), bankName);
        dc.sendKeysFunction(dc.getIbanInput(), iban);
        dc.clickFunction(dc.getCurrencyInputDropdown());
        dc.clickFunction(dc.getCurrencyEur());
        dc.sendKeysFunction(dc.getIntegrationCodeInput(), integrationCode);
        dc.clickFunction(dc.getSaveButton());
    }

    @And("User edit Bank Account {string} and change it to {string}")
    public void user_edit_bank_account_and_change_it_to(String existingBankName, String newBankName) {
        nb.clickFunction(nb.getSetupOne());
        nb.clickFunction(nb.getParameters());
        nb.clickFunction(nb.getBankAccountButton());

       dc.sendKeysFunction(dc.getSearchName(), existingBankName);
       dc.clickFunction(dc.getSearchButton4());
       dc.clickFunction(dc.getEditButton());
       dc.clearFunction(dc.getNameInput());
       dc.sendKeysFunction(dc.getNameInput(), newBankName);
       dc.clickFunction(dc.getSaveButton());

    }
    @And("User delete Bank Account {string}")
    public void user_delete_bank_account(String createdBankName) {
        nb.clickFunction(nb.getSetupOne());
        nb.clickFunction(nb.getParameters());
        nb.clickFunction(nb.getBankAccountButton());

        dc.sendKeysFunction(dc.getSearchName(), createdBankName);
        dc.clickFunction(dc.getSearchButton4());
        dc.clickFunction(dc.getDeleteButton());
        dc.clickFunction(dc.getDeleteButton2());
    }

    @And("User should search deleted Bank data {string}")
    public void userShouldSearchDeletedBankData(String createdBankName) {
        nb.clickFunction(nb.getSetupOne());
        nb.clickFunction(nb.getParameters());
        nb.clickFunction(nb.getBankAccountButton());

        dc.sendKeysFunction(dc.getSearchName(), createdBankName);
        dc.clickFunction(dc.getSearchButton4());



    }
    @Then("Success add message should be displayed displayed")
    public void successAddMessageShouldBeDisplayedDisplayed() {
        dc.waitUntilVisibleAndClickable(dc.getSuccessMessage());
        dc.validationText(dc.getSuccessMessage(), "success");
    }

    @Then("Unsuccessful message should display")
    public void unsuccessfulMessageShouldDisplay() {
        dc.waitUntilVisibleAndClickable(dc.getUnsuccessfulMessage());
        dc.validationText(dc.getUnsuccessfulMessage(), "already exists");
    }
    @Then("Success edit message should be displayed")
    public void successEditMessageShouldBeDisplayed() {
        dc.waitUntilVisibleAndClickable(dc.getSuccessMessage());
        dc.validationText(dc.getSuccessMessage(), "success");
    }

    @Then("Success delete message should be displayed")
    public void successDeleteMessageShouldBeDisplayed() {
        dc.waitUntilVisibleAndClickable(dc.getSuccessMessage());
        dc.validationText(dc.getSuccessMessage(), "success");
    }

    @Then("User should see no data message should be displayed")
    public void userShouldSeeNoDataMessageShouldBeDisplayed() {
        dc.waitUntilVisibleAndClickable(dc.getNoDataMessage());
        dc.validationText(dc.getNoDataMessage(), "no data");
    }
}



