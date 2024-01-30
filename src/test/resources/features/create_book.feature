Feature: Create a reservation successfully

  @smoke @login
  Scenario: Complete movie reservation flow
    Given Andres is on the main page
    And log in with correct credentials:
      | email | password |
      | andressurez2@yopmail.com | TestCine123. |
    And select city 'Bogota'
    When select a movie
    And select a comb
    And add the payment method with the following data:
      | cardName | cardNumber | cardCvv | cardQuotas |
      | APPROVED| 4097440000000004 | 777 | 1 |
    Then can see the billboard view