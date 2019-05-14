#Author: your.email@your.domain.com

Feature: To test customer can add tarrif plan 
  
  Scenario Outline: To test add tarrif plan
    Given The user should be on add tarrif plan page
   	When The user fil in the valid plan detail detail"<MonthRent>","<FreeLocMinuts>","<FreeIntMinuts>","<FreeSMS>","<localCharges>","<IntCharges>","<SMSCharges>"
    When The user click on submit button 
    Then The user shuld see the success message

    Examples: 
      | MonthRent	| FreeLocMinuts | FreeIntMinuts  |FreeSMS | localCharges | IntCharges| SMSCharges |
      | 100 			|     200				| 300		 				 |400			|500					 |600			 |	700				|
      | 100 			|     200				| 300		 				 |200			|300					 |600			 |	500				|
      | 100 			|     200				| 200		 				 |400			|400					 |700			 |	600				|
      | 100 			|     200				| 300		 				 |400			|500					 |600			 |	900				|
      

  
  Scenario Outline: To test Reset functionality
    Given The user should be on add tarrif plan page
   	When The user fil in the valid plan detail detail"<MonthRent>","<FreeLocMinuts>","<FreeIntMinuts>","<FreeSMS>","<localCharges>","<IntCharges>","<SMSCharges>"
    When The user click on reset button 
    Then The user shuld see the blank form
      
       Examples: 
      | MonthRent	| FreeLocMinuts | FreeIntMinuts  |FreeSMS | localCharges | IntCharges| SMSCharges |
      | 100 			|     200				| 300		 				 |400			|500					 |600			 |	700				|
      
    @sprint1  
    Scenario Outline: To test invalid data functionality
    Given The user should be on add tarrif plan page
   	When The user enter invalid data "<MonthRent>","<FreeLocMinuts>","<FreeIntMinuts>","<FreeSMS>","<localCharges>","<IntCharges>","<SMSCharges>"
    Then The user shuld see the error message
    
    Examples: 
     | MonthRent	| FreeLocMinuts | FreeIntMinuts  |FreeSMS | localCharges | IntCharges| SMSCharges |
      | 100 			|     200				| abc	 				 |400			|500					 |600			 |	700				|
      