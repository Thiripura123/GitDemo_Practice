Feature: Application login


@MobileTest
 Scenario: Home page default login
 Given user is on netbanking landing page
 When User login into application with "Thiripura" and "3452"
 Then Home page is displayed
 And cards displayed are "true"

@MobileTest
  Scenario: Home page default login
 Given user is on netbanking landing page
 When User login into application with "Thiripu" and "1234"
 Then Home page is displayed
 And cards displayed are "false"
 
 @WebTest
 Scenario: Home page default login
 Given user is on netbanking landing page
 When User login into application with following details
 
 | Thiri | Test | abc@abc.com | 12334 |
 Then Home page is displayed
 And cards displayed are "false"
 
 @WebTest
  Scenario Outline: Home page default login
 Given user is on netbanking landing page
 When User login into application with <Username> and password <Password>
 Then Home page is displayed
 And cards displayed are "false"
 
 
Examples:
 | Username | Password |
 | Thiri 		| 12345 |
 | Sundari 	| 15674 |
 
