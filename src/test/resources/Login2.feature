Feature: Login Functionality
  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully

  Scenario Outline: Login Successful
    Given I am in the login page of the Para Bank Application
    When I enter valid <username> and <password>
    Then I should be taken to the Overview page

    Examples: 
      | username | password |
      | "john"   | "demo"   |
      | "john"   | "demo"   |
