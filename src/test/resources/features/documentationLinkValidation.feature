@run
Feature: Documentation Links Validation

Scenario: Check whether Documentation links loads angular js on redirection
Given I am in here Documentation page
When I click on the documentation Links , it should have loaded properly
Then the redirected links should be valid

