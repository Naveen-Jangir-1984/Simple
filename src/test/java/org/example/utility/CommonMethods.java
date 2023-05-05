package org.example.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {
  private final static Duration globalWaitTime = Duration.ofSeconds(5);
  public static void enterText(WebDriver browser, WebElement element, String text) {
    waitForElement(browser, element);
    element.clear();
    element.sendKeys(text);
  }

  public static void waitForElement(WebDriver browser, WebElement element) {
    WebDriverWait wait = new WebDriverWait(browser, globalWaitTime);
    wait.until(ExpectedConditions.visibilityOf(element));
  }
}
