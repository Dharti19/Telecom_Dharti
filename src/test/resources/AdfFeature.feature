#Author: your.email@your.domain.com
#Author: your.email@your.domain.com
Feature: To Test add customer Functionality
  Scenario: To Test Customer Id generate for Valid Customer
    Given The User is in add customer page
    When The user fill in the valid customer details
    When The user click the submit button
    Then The user should see the customer id generated
     

  Scenario: To Test Reset button
     Given The User is in add customer page
    When The user fill in the valid customer details
    When The user click the reset button
    Then The user sould see the form blank
  
   Scenario: To Test the field empty
    Given The User is in add customer page
    When The user left the field blank
    When The user click the submit button
    Then The user sould see the error mesage
   

   Scenario: To Test for invalid data
     Given The User is in add customer page
    When The user fill in the invalid data
    When The user click the submit button 
    Then The user sould see the invalid data mesage 
  