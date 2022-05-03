Feature: Google Search

   @search
   Scenario: Search text on Google

    Given User is on Google Search page
    When User enters search text as "iphone 13 mobile"
    And User hit the return key
    Then User should be able to see results