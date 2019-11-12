Feature: Login Test

Scenario: Login with valid test data

Given user open application 
When user enters user as "mercury" in username field
And user enters password as "mercury" in password field
And click signin
Then validates login success



