Feature: Test Registration

Description : User Status

Scenario: Test registration with valid data

Given user open application newtours.demoaut.com
When user clicks on registration page
Then user validates registration page
When user enter firstname
And user enter password
And user enter confirm password
And user click on register button
Then user registration success

