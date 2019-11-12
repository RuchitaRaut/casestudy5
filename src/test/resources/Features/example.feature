Feature: Login Test

Scenario Outline: Login with valid test data
Given user open application 
When user enters user as "<username>" in username field
And user enters password as "<password>" in password field
And click signin
Then validates login success


Examples: 
      | username| password |
      | mercury |  mercury |
      | ruchita |  raut  |
      |siajk| dwhu|
