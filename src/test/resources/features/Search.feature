Feature: Google Search

  @iphone
  Scenario Outline: Search text on Google
  Given User is on Google Search page
  When User searches text as "<searchText>"
  Then User should be able to see results
    Examples:
    | searchText |
    | iphone 12 mobile |
    | iphone 13 mobile |