Feature: Login into Adactin Hotel app
  I want to use this template for my feature file
  
  Scenario Outline:Successful login
    Given I want to login into hotel app using valid username as <username>
    And valid password as <password>
    When I click on the login button
    Then I have to get redirected to another page

    Examples: 
      | username    |     password   | 
      | "Varsharaj"   |     "Varsharaj" | 
      | "Sudeepthi01" |    "Pizza#2001" | 
