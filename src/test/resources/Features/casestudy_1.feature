Feature: TestMeApp Registration
Scenario: TestMeapp registration with valid data

Given user open application TestMeApp
When user clicks on Signin button
Then user validates signIn
When user enter username
And user enter Firstname 
And user enter lastname
And user enter Password
And user enter Confirm password
And user click on gender
And user enter email
And user enter mobileno
And user enter DOB
And user enter Address
And user selects security question
And user types answer for security question
And user click on Register button
Then user Registration success

