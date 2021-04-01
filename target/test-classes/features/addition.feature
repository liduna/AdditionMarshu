Feature: addition


  @additionInChrome
  Scenario: Add two numbers Chrome
    Given I have used "chrome" as browser
    Given I have entered 123 into the calculator
    And I have also entered 456 into the calculator
    When I press add
    Then the result should be 579 on the screen

  Scenario: Add two numbers in Firefox
    Given I have used "firefox" as a browser
    Given I have entered 30 into calculator
    And I have entered 70 into calculator
    When I press addition
    Then the result 100 should be displayed
