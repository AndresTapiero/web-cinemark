Feature: Create user

  @smoke @register
  Scenario: Create user and log in successfully
    Given Andres is on the main page
    When create a new user with de following details:
      | firstName | lastName | document | phone | address | email | password |
      | Andrew | Perez | 10458765985 | 3154789658 |  calle 21#54-96  |juanpe71@yopmail.com | AndrewCine123. |
    Then see the billboard view


