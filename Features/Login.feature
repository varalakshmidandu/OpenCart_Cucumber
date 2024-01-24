Feature: Login with creadentials

@sanity
Scenario: Successful Login with Valid Credentials
		Given User Launch Browser
		And Opens URL "https://tutorialsninja.com/demo/"
		When User Navigate to MyAccount Menu
		And Click on Login
		And User Enter Email as "danduvaralakshmi@gmail.com" and Password as "abcd1234"
		And Click on Login button
		Then User Navigates to MyAccount Page