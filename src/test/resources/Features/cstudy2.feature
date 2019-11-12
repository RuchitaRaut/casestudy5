Feature: Login testmeapp

Scenario Outline: Login with valid test data
Given user open testmeapp 
When user clicks on signin button
When user enters "<username>" in username field
And user enters "<password>" in password field
And click login button
Then validates login 


Examples: 
      | username| password |
      | Ruchita45|  ruchita25 |
     
     
