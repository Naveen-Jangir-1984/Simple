package org.example.pages;

import org.example.utility.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

  WebDriver driver;
  By txt_search = By.name("q");
  By txt_result = By.cssSelector("#extabar #result-stats");
  public HomePage(WebDriver driver) { this.driver = driver; }
  public void navigateToURL() {
    String url = "https://www.google.com/";
    this.driver.get(url);
  }
  public void searchText(String searchTxt) {
    WebElement ele_search = driver.findElement(txt_search);
    CommonMethods.enterText(driver, ele_search, searchTxt);
    ele_search.sendKeys(Keys.RETURN);
  }
  public String getResultText() { return driver.findElement(txt_result).getText(); }
}