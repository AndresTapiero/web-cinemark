Feature: Create user

  @smoke @register
  Scenario: Create user and log in successfully
    Given Andres is on the main page
    When create a new user
    Then see the billboard view
