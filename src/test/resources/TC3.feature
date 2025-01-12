 # Author: Ragul
 Feature: Checkout process on SauceDemo
@TC3
  Scenario: User completes checkout process and views the checkout overview page
    Given User clicks on the checkout button
    And User enters the first name as "John"
    And User enters the last name as "Doe"
    And User enters the postal code as "12345"
    Then User should click on continue to see the checkout overview page
