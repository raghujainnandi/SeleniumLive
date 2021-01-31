Feature: Registraition functionality scenarios

@Register @one
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Rakesh								|
    	| LastName  | Kumar						|
    	| Email			| raghujain8000@gmail.com |
    	| Telephone	| 1233560281					|
    	| Password	| Test02							|
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
    
  @Register @Two
 Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
  	Given I launch the application
  	And I navigate to Account Registration page
  	When I click on Continue button
  	Then I should see that the User Account is not created
  	And I should see the error messages informing the user to fill the mandatory fields
  	
  	
  	@Register @Three
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Rahu							|
    	| LastName  | Kum					|
    	| Email			| Ravi.22@gmail.com |
    	| Telephone	| 1234580690						|
    	| Password	| amkmk								|
    And I select the Privacy Policy
    And I subscribe to NewsLetter
    And I click on Continue button
    Then I should see that the User Account has successfully created
    


    