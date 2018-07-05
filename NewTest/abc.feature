@login
Feature: Login page test

  Background: 
    Given user is on login page

  Scenario: Verify valid login
    When user enter username as "vaishalijaiswal1993@gmail.com"
    And user click on the first next button
    And user enter password as "vishi.123"
    And user click on the second next button
    And user click on the gmail logo
    Then verify user logged in
    
    
