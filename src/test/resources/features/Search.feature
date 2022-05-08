Feature: Google Search

   @search
   Scenario: Search text on Google

    Given User is on Google Search page
    When User searches text as "iphone 13 mobile"
    Then User should be able to see results