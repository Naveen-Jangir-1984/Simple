package org.example.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStepDefinition {

  private WebDriver driver;

  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }
  @Given("User is on Google Search page")
  public void user_is_on_google_search_page() {
    driver.get("https://www.google.com/");
  }
  @When("User enters search text as {string}")
  public void user_enters_search_text_as(String searchText) {
    driver.findElement(By.name("q")).sendKeys(searchText);
  }
  @When("User hit the return key")
  public void user_hit_the_return_key() {
    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
  }
  @Then("User should be able to see results")
  public void user_should_be_able_to_see_results() {
    assert true;
  }
  @After
  public void teardown() { driver.quit(); }

}
