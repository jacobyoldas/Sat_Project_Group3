package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grade_Levels_Elements extends _01_Base_POM {

    public Grade_Levels_Elements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
       //************Create Grade Levels************
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[3]")
    private WebElement clickHamburger;
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement clickSetup;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement clickParameters;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;
   @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement plusIcon;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement addName;
    @FindBy(css = "[data-placeholder='Order']")
    private WebElement addShortName;
    @FindBy(css = "[data-placeholder='Short Name']")
    private WebElement addOrder;


  //  @FindBy(css = "[class='mat-select-trigger ng-tns-c93-325']")
  //  private WebElement nextGrade;


  //  @FindBy(xpath = "//span[text()='None']")
  //  private WebElement selectOption;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper']//span)[5]")
    private WebElement clickSave;
    @FindBy(xpath = "//div[text()='Grade Level successfully created']")
    private WebElement successfullyCreated;

    // ***********  Create Same Great Levels ************




    @FindBy(xpath = "//div[text()='The Grade Level with Name \"Grade1\" already exists.']")
    private WebElement alreadyExists;


    //********** Edit Grade Levels **********

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[35]")
    private WebElement editIcon;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement updateName;
    @FindBy(css = "[data-placeholder='Short Name']")
    private WebElement updateShortName;
    @FindBy(css = "[data-placeholder='Order']")
    private WebElement updateOrder;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper']//span)[5]")
    private WebElement updateSave;
    @FindBy(xpath = "//div[text()='Grade Level successfully updated']")
    private WebElement updatedSuccessfullyMessage;


   //****** delete Grade Levels ***********

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-trash-can'])[4]")
    private WebElement deleteIcon;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[text()='Grade Level successfully deleted']")
    private WebElement deletedSuccessfully;




    public WebElement getClickHamburger() {
        return clickHamburger;
    }
    public WebElement getClickSetup() {
        return clickSetup;
    }
    public WebElement getClickParameters() {
        return clickParameters;
    }
    public WebElement getGradeLevels() {
        return gradeLevels;
    }
    public WebElement getPlusIcon() {
        return plusIcon;
    }
    public WebElement getAddName() {
        return addName;
    }
    public WebElement getAddShortName() {
        return addShortName;
    }
    public WebElement getAddOrder() {
        return addOrder;
    }
    //  public WebElement getNextGrade() {
    //    return nextGrade;
    //}
    public WebElement getClickSave() {
        return clickSave;
    }
    public WebElement getSuccessfullyCreated() {
        return successfullyCreated;
    }



    public WebElement getAlreadyExists() {
        return alreadyExists;
    }



    public WebElement getEditIcon() {
        return editIcon;
    }
    public WebElement getUpdateName() {
        return updateName;
    }
    public WebElement getUpdateShortName() {
        return updateShortName;
    }
    public WebElement getUpdateOrder() {
        return updateOrder;
    }
   // public WebElement getSelectOption() {
  //      return selectOption;
  //  }
    public WebElement getUpdateSave() {
        return updateSave;
    }
    public WebElement getUpdatedSuccessfullyMessage() {
        return updatedSuccessfullyMessage;
    }



    public WebElement getDeleteIcon() {return deleteIcon; }
    public WebElement getDeleteButton() {
        return deleteButton;
    }
    public WebElement getDeletedSuccessfully() {
        return deletedSuccessfully;
    }

}
