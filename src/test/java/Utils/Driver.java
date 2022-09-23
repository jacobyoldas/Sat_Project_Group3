package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

  public static WebDriver driver;

  private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // WebDriver 1 WebbDriver 2
  public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // chrome , firefox ...


  public static WebDriver getDriver() {
    Locale.setDefault(new Locale("EN"));
    System.setProperty("user.language", "EN");
    Logger.getLogger("").setLevel(Level.SEVERE);
    System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

    if (threadBrowserName.get() == null) // if XML has not started for parallel so then set browser for default
      threadBrowserName.set("chrome");

    if (threadDriver.get() == null) {

      String browserName = threadBrowserName.get(); // get browser name
      switch (browserName) {
        case "chrome":
          WebDriverManager.chromedriver().setup();
          threadDriver.set(new ChromeDriver()); // this thread driver call the chrome new object
          break;

        case "firefox":
          WebDriverManager.firefoxdriver().setup();
          threadDriver.set(new FirefoxDriver());  // this thread driver call the firefox new object
          break;

        case "safari":
          WebDriverManager.safaridriver().setup();
          threadDriver.set(new SafariDriver());
          break;

        case "edge":
          WebDriverManager.edgedriver().setup();
          threadDriver.set(new EdgeDriver());
          break;
      }
    }
    return threadDriver.get();
  }

  public static void wait(int sec) {
    try {
      Thread.sleep(sec * 1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  public static void quitDriver() {
    if (threadDriver.get() != null) { // if there is a driver
      threadDriver.get().quit();

      WebDriver driver = threadDriver.get();
      driver=null;
      threadDriver.set(driver); // if driver comes again make it null
    }
  }

}
