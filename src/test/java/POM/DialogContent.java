package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends BasePOM{

    public DialogContent(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(css = "input[data-placeholder='Username']")
    public WebElement username;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement password;

    @FindBy(css = "span[class='mat-button-wrapper']")
    public WebElement clickLogin;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement validateToLogin;

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement clickHumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement clickSetup;

    @FindBy(xpath = "//span[text()='Positions']")
    public WebElement clickPositions;

    @FindBy(css = "ms-add-button[tooltip='EMPLOYEE_POSITION.TITLE.ADD']")
    public WebElement clickPlusIcon;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement addName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement addShortName;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement clickSaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchNameInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    public WebElement searchShortNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//td[text()='Position1']")
    public WebElement positionsMessage;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    public WebElement noDataDataMessage;

    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editbutton;

    @FindBy(xpath = "//ms-delete-button//button")
    public List<WebElement> deleteButtonList;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteSubmit;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement acceptCookies;
}
