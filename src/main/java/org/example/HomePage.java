package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

  WebDriver driver;
  private final String url = "https://www.google.com/";
  By txt_search = By.name("q");
  public HomePage(WebDriver driver) { this.driver = driver; }
  public void navigateToURL() { this.driver.get(url); }
  public void searchText(String searchTxt) {
    WebElement ele_search = driver.findElement(txt_search);
    ele_search.clear();
    ele_search.sendKeys(searchTxt);
    ele_search.sendKeys(Keys.RETURN);
  }
}