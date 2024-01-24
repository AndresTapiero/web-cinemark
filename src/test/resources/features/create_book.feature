Feature: Create book

  @smoke @login
  Scenario: Select a movie successfully
    Given Andres is on the main page
    And log in with correct credentials
    And select city
    When select a movie
    And select a comb
    And add the payment method
    Then can see the billboard view

