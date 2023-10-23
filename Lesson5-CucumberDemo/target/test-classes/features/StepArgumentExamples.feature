Feature: Testing Log In for NINJa page

  Scenario Outline: Enter login credentials
    Given I am on tutorialsNinja Page
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click on login button

    Examples: 
      | EmailId                | password |
      | seleniumdemo@gmail.com |  123456  |
