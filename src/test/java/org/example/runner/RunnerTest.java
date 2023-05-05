package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.browsers.ManageBrowser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@CucumberOptions(features = "src/test/resources/features/", glue = "org.example.definitions")
public class RunnerTest extends AbstractTestNGCucumberTests {
  @BeforeTest
  public void beforeTest() {
    ManageBrowser.setUpBrowser();
  }
  @AfterTest
  public void afterTest() {
    ManageBrowser.tearDownBrowser();
  }
}
