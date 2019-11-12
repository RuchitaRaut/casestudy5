Feature: Buy headphones
Scenario: purchase product from TestmeApp

Given user logged in testmeapp
When user searches for products
And user gets all suggestions
Then user adds product to cart


