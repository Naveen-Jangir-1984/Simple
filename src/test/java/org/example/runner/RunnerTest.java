package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.browsers.ManageBrowser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(features = "src/test/resources/features/", glue = "org.example.definitions")
public class RunnerTest extends AbstractTestNGCucumberTests {
  private final ManageBrowser manageBrowser = new ManageBrowser();
  @BeforeTest
  public void beforeTest() {
    manageBrowser.setUpBrowser();
  }
  @AfterTest
  public void afterTest() {
    manageBrowser.tearDownBrowser();
  }
}
