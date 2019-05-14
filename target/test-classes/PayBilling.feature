#Author: your.email@your.domain.com

Feature: To test PayBilling functionality
 @script1
  Scenario: To test paybilling with valid customer id
    Given Customer  should be on PayBilling page
    When Customer enter valid customer id
    When customer click on submit button
    Then customer should see the pay billing page

  Scenario:To test paybilling with Invalid customer id
    Given Customer  should be on PayBilling page
    When Customer enter Invalid customer id
    When customer click on submit button
    Then customer should see the Eroor message


