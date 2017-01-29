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
      | 10              | 8.52470          |
      | 20              | 17.0494          |
      | 30              | 25.5741          |
      | 50              | 42.6235          |
      | 100             | 85.2470          |

