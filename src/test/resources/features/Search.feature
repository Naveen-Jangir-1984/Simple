Feature: Google Search

  @iphone12
  Scenario: Search text on Google
  Given User is on Google Search page
  When User searches text as "iphone 12 mobile"
  Then User should be able to see results

  @iphone13
  Scenario: Search text on Google
  Given User is on Google Search page
  When User searches text as "iphone 13 mobile"
  Then User should be able to see results