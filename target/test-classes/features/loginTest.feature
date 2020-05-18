
Feature: adactin Login page Test

 Background: 
   Given user intialize the brower
 @functional
 Scenario: User Login verification with valid credential
    When user enter the username and password 
    And user click on Login button
    Then user verify the home page
    And user close the brower
    
   @functional
   Scenario: User Login verification with valid username and invalid password
    When user enter the valid username and invalid password 
    And user click on Login button
    Then user verify the home page
    And user close the brower
    
