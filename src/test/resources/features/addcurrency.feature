Feature: Add currency

Scenario: Add a new currency to live rates 
	Given I navigate to XE website 
	When I would like to add currency DKK
	Then DKK should appear in the live rates