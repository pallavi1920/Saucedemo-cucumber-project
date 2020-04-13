@checkout
Feature: To checkout the cart and give details
  
  Scenario Outline: To checkout after selecting items
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login 
    When user selects multiple items to add to cart
		Then user opens cart 
    And clicks on checkout button
    Then enters the personal details
    Then application should be closed
 

 Examples: 
   |usernameNumber|
   | 1  |