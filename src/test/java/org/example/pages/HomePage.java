package org.example.pages;

import org.example.utility.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

  protected WebDriver browser;
  By txt_search = By.name("q");
  By txt_result = By.cssSelector("#extabar #result-stats");
  public HomePage(WebDriver browser) { this.browser = browser; }
  public void navigateToURL() {
    String url = "https://www.google.com/";
    this.browser.get(url);
  }
  public void searchText(String searchTxt) {
    WebElement ele_search = browser.findElement(txt_search);
    CommonMethods.enterText(browser, ele_search, searchTxt);
    ele_search.sendKeys(Keys.RETURN);
  }
  public String getResultText() { return browser.findElement(txt_result).getText(); }
}