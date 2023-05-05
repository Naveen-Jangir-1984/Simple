package org.example.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageBrowser {
  private static WebDriver browser;
  public static void setUpBrowser() {
    ChromeOptions capability = new ChromeOptions();
    capability.setHeadless(false);
    browser = WebDriverManager.chromedriver().capabilities(capability).create();
  }
  public static WebDriver getBrowser() {
    return browser;
  }
  public static void tearDownBrowser() { browser.quit(); }
}
