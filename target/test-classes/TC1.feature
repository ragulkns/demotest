# Author: Ragul
Feature: Validating Login credentials for saucedemo
 @TC1
Scenario: Validation of Login using valid credentials
Given User is on the login page
When User Enter Username and Password
And User should click the LoginButton
Then Login Should be successful

