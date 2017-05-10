@run
Feature: Google can perform addition calculations

  Scenario: Google addition
    Given I want to search in Google
    When I calculate "10+39"
    Then The result should be "49"