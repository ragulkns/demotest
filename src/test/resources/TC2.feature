# Author: Ragul
Feature: Adding items to the cart on SauceDemo
@TC2
  Scenario: User adds items to the cart
    Given User is on the product page
    When User adds "Sauce Labs Backpack and Sauce Labs Bike Light" to the cart
    Then User should click on the cart