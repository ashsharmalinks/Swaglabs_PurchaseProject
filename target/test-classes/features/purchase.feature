Feature: Placing an order for costliest and cheapest items
		As a valid user, 
		I want to place an order for costliest and cheapest item
					
Scenario Outline: Ordering a costliest and cheapest item from product catalogue
	Given I logged into the application "<url>" using the valid user credentials "<username>" and "<password>" 
	And I have sorted the producs by price option "<sortType>" 
	When I add to cart the costliest and cheapest items from the product list
	And I enter the checkout details "<firstname>", "<lastname>" and "<postalcode>" 
	Then I should be able to see the success "<message>" on the confirmation page
	Examples:
	|url					  |username		|password		|sortType     |firstname   |lastname   |postalcode	|message					|
	|https://www.saucedemo.com|standard_user|secret_sauce	| high to low |First Name 1|Last Name 1|SW1A 2AA	|THANK YOU FOR YOUR ORDER	|
		
		