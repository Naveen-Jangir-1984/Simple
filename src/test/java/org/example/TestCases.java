package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
  private WebDriver driver;
  private final String url = "https://www.google.com/";
  @BeforeTest
  public void OpenChrome() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }
  @Test
  public void Case_001() {
    driver.get(url);
  }
  @AfterTest
  public void CloseBrowser() {
    driver.close();
  }
}
