Feature: As a User I want to press Click Me Button

  Background:
    Given I am on the elements page

  Scenario: Press Click Me
    When I press buttons
    And  I press Click Me
    Then I can see 'You have done a dynamic click'