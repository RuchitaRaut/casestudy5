Feature:  cart availability
Scenario: move to cart without adding item

Given user registerd in testmeapp
When user searches for product
And try to process payment without adding to cart
Then TestMeApp doesn't display the cart icon