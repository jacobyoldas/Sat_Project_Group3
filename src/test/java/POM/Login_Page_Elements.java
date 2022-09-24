package POM;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Elements extends _01_Base_POM {

  public Login_Page_Elements() {
    PageFactory.initElements(Driver.getDriver(), this);
  }


}
