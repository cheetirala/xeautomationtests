Feature: Euro to Pound conversion
  As a XE Customer
  I would like to know how much foreign exchange I can get for the money I have

  Scenario Outline: Euro to Pound
    Given I navigate to XE website
    When I would like to convert from euros to pounds
    And I enter the amount <amount-in-euros> in euros
    Then the amount in pounds <amount-in-pounds> should be displayed
    Examples:
      | amount-in-euros | amount-in-pounds |
      | 10              | 8.38098          |

