package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Elements extends _01_Base_POM {
  public Login_Page_Elements() {
    PageFactory.initElements(Driver.getDriver(), this);
  }
  @FindBy(css = "input[formcontrolname='username']")
  private WebElement usernameInput;

  @FindBy(css = "input[formcontrolname='password']")
  private WebElement passwordInput;

  @FindBy(css = "button[aria-label='LOGIN']")
  private WebElement loginButton;

  @FindBy(xpath = "//button[text()='Accept all cookies']")
  private WebElement acceptCookiesButton;
  private String username = "richfield.edu";
  private String password = "Richfield2020!";
  public void userEnterAdminCredentials() {
    waitUntilVisibleAndClickable(acceptCookiesButton);
    clickFunction(acceptCookiesButton);
    usernameInput.sendKeys(username);
    passwordInput.sendKeys(password);
    loginButton.click();
  }
}
