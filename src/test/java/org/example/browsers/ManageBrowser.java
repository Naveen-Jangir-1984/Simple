package org.example.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageBrowser {
  public static WebDriver browser;
  public void setUpBrowser() {
    ChromeOptions capability = new ChromeOptions();
    capability.setHeadless(true);
    browser = WebDriverManager.chromedriver().capabilities(capability).create();
  }
  public void tearDownBrowser() { browser.quit(); }
}
