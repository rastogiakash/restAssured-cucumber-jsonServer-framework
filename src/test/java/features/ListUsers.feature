#Author: Akash Rastogi
#Date  : 12-Sep-2019
#Feature: List of users scenario.
Feature: List of users scenario
         Here it should list the user and we verify it by verifying te status code and also that one of the user 
         exists from the list of users.

  Scenario: verify one user from the List the users
		Given I have the base URL
		When I send the GET request for "/users"
		Then I should receive the correct response code "200"
		And  I should receive the correct response with one userName as "Antonette"