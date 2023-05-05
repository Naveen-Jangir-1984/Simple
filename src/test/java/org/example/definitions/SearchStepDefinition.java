package org.example.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.browsers.ManageBrowser;
import org.example.pages.HomePage;
import org.testng.Assert;

public class SearchStepDefinition {
  private HomePage homePage;
  @Given("User is on Google Search page")
  public void user_is_on_google_search_page() {
    homePage = new HomePage(ManageBrowser.getBrowser());
    homePage.navigateToURL();
  }
  @When("User searches text as {string}")
  public void user_searches_text_as(String searchText) { homePage.searchText(searchText); }
  @Then("User should be able to see results")
  public void user_should_be_able_to_see_results() { Assert.assertTrue(homePage.getResultText().startsWith("About")); }

}
