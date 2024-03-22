Feature: Login into Adactin Hotel app and search hotel
  I want to use this template for my feature file
 
  Scenario: Successful login
    Given I want to login into hotel app using valid username as "Varsharaj"
    And valid password as "Varsharaj"
    When I click on the login button
    Then I have to get redirected to another page
    Given I am on the search page
    When I enter the desired location as "London"
    And select the hotel as "Hotel Sunshine"
    And select the room type as "Standard"
    When I click on search button 
    Then I have to get redirected to another page  