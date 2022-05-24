package org.example.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {
  private static Duration globalWaitTime = Duration.ofSeconds(5);
  public static void enterText(WebDriver driver, WebElement element, String text) {
    waitForElement(driver, element);
    element.clear();
    element.sendKeys(text);
  }

  public static void waitForElement(WebDriver driver, WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, globalWaitTime);
    wait.until(ExpectedConditions.visibilityOf(element));
  }
}
