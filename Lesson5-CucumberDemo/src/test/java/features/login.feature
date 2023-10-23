Feature: Logging in for rediff MyPage
  Description: This test will execute...

  Background: 
    Given I open the browser and rediff Mypage
    Then I capture the title of the page

  #This is a comment
  Scenario: Test LogIn Feature by providing credentials
    And I enter email and password fields
    When I click on LogIn button
    Then Error should be displayed
    Then I click on click here link on the error
    And I close the browser window

  Scenario: Test Create Account Feature
    Then click on Create a Rediffmail account
    And I close the browser window
