@placeorder
Feature: To place the order
 
  Scenario Outline: To check the items and place the order
    Given Open chrome and start application
    When I enter valid "<usernameNumber>"
    When user should be able to login
    When user selects multiple items to add to cart
    Then user opens cart
    And user removes items from the cart 
    And clicks on checkout button
    Then enters the personal details
    And check the products and click on finish
    Then application should be closed
 

 Examples:
   |usernameNumber|
   | 1   |