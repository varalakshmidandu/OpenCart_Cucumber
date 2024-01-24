Feature: Login Data Driven

@regression
  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                	    | password |
      | danduvaralakshmi@gmail.com         | abcd1234  |
      | lakshmi@gmail.com | test1234 |
