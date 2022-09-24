package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_Dialog_Content_Elements extends _01_Base_POM {

  public _03_Dialog_Content_Elements() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
  private WebElement addButton;

  @FindBy(xpath = "//div[contains(text(),'successfully')]")
  private WebElement successMessage;
  @FindBy(xpath = "//div[contains(text(),'already exists')]")
  private WebElement alreadyExist;
  @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
  private WebElement searchInput;
  @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[2]")
  private WebElement searchInput2;

  @FindBy(xpath = "(//ms-delete-button//button)[1]")
  private WebElement deleteButton;
  @FindBy(xpath = "//span[contains(text(),'Delete')]")
  private WebElement deleteDialogBtn;
  @FindBy(xpath = "//div[contains(@class,'table-loading-s')]")
  private WebElement noDataMessage;

  @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
  private WebElement ibanInput;

  @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
  private WebElement currencyInputDropdown;

  @FindBy(xpath = "//span[text()=' USD '] ")
  private WebElement currencyUsd;

  @FindBy(xpath = "//span[text()=' EUR '] ")
  private WebElement currencyEur;

  @FindBy(xpath = "//span[text()=' TRY '] ")
  private WebElement currencyTry;

  @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
  private WebElement integrationCodeInput;

  @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
  private WebElement searchName;

  @FindBy(xpath = "//ms-search-button//button")
  private WebElement searchButton4;
  @FindBy(xpath = "//ms-edit-button//button")
  private WebElement editButton;

  @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
  private WebElement nameInput;
  @FindBy(xpath = "//ms-save-button//button")
  private WebElement saveButton;

  @FindBy(xpath = "//span[text()='Search']")
  private WebElement searchButton3;

  @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
  private WebElement deleteButton2;

  @FindBy(xpath = "//div[contains(text(), 'already exists.')]")
  private WebElement unsuccessfulMessage;


  public WebElement getAddButton() {
    return addButton;
  }

  public WebElement getNameInput() {
    return nameInput;
  }

  public WebElement getSaveButton() {
    return saveButton;
  }

  public WebElement getSuccessMessage() {
    return successMessage;
  }

  public WebElement getAlreadyExist() {
    return alreadyExist;
  }

  public WebElement getSearchInput() {
    return searchInput;
  }

  public WebElement getSearchButton() {
    return searchButton3;
  }

  public WebElement getSearchInput2() {
    return searchInput2;

  }

  public WebElement getEditButton() {
    return editButton;
  }

  public WebElement getDeleteButton() {
    return deleteButton;
  }

  public WebElement getDeleteDialogBtn() {
    return deleteDialogBtn;
  }

  public WebElement getIbanInput() {
    return ibanInput;
  }

  public WebElement getCurrencyInputDropdown() {
    return currencyInputDropdown;
  }

  public WebElement getCurrencyUsd() {
    return currencyUsd;
  }

  public WebElement getCurrencyEur() {
    return currencyEur;
  }

  public WebElement getCurrencyTry() {
    return currencyTry;
  }

  public WebElement getIntegrationCodeInput() {
    return integrationCodeInput;
  }

  public WebElement getSearchName() {
    return searchName;
  }

  public WebElement getSearchButton3() {
    return searchButton3;
  }

  public WebElement getDeleteButton2() {
    return deleteButton2;
  }

  public WebElement getUnsuccessfulMessage() {
    return unsuccessfulMessage;
  }

  public WebElement getNoDataMessage() {
    return noDataMessage;

  }

  public WebElement getSearchButton4() {
    return searchButton4;
  }
}




