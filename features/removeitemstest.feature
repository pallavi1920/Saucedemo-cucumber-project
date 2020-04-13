@removeitems
Feature: To remove items from cart
  
  Scenario Outline: To add and remove the items from cart
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login 
    When user selects multiple items to add to cart
		Then user opens cart 
    And user removes items from the cart
    Then application should be closed
 

 Examples: 
   |usernameNumber|
   | 1  |