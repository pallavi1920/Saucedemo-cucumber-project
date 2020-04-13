@product
Feature: Test Swag login scenario

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When user selects multiple items to add to cart
    Then user opens cart 
    Then application should be closed

    Examples: 
   |usernameNumber|
   | 1  	|