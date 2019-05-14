#Author: your.email@your.domain.com

Feature: To test add tarrif to customer 
@sprint2
  Scenario: To test add tarrif to customer with valid id
    Given Customer should be on add tarrif to customer page
    When Customer enter the valid customer id 
    When customer click on submit button
    Then customer should navigate to assign tarrif plan to customer 
    
 Scenario: To test add tarrif to customer with invalid id
    Given Customer should be on add tarrif to customer page
    When Customer enter the Invalid customer id 
    When customer click on submit button
    Then Error message should show invalid customer id 

   
