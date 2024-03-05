Feature: As a User I want to add/update personal to webTables

  Background:
    Given I am on the webTables page

  Scenario: Add/Update Personal
    When I press ADD buttons
    And  I add new personal
    And  I update newly added personal
    Then I can see personal name 'ECE'