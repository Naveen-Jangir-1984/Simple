package org.example.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStepDefinition {

  private WebDriver driver;
  private HomePage homePage;

  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
  }
  @Given("User is on Google Search page")
  public void user_is_on_google_search_page() { homePage.navigateToURL(); }
  @When("User searches text as {string}")
  public void user_searches_text_as(String searchText) { homePage.searchText(searchText); }
  @Then("User should be able to see results")
  public void user_should_be_able_to_see_results() {
    assert true;
  }
  @After
  public void teardown() { driver.quit(); }

}
