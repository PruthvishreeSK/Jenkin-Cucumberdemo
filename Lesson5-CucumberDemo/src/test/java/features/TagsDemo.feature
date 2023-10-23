@all
Feature: Testing on NinjaDemo application

  Background: 
    Given I am on tutorialsNinja Page

  @login
  Scenario Outline: Enter login credentials
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click on login button
    And I close the browser

    Examples: 
      | EmailId                | password |
      | seleniumdemo@gmail.com |   123456 |

  @search
  Scenario: Test search
    Then I enter input for the search box
    And I click on search button

  @addtocart
  Scenario: Test cart
    Then I click on Add to cart button
    And I close the browser

  @checkout
  Scenario: Test checkout
    Then I click on checkout
    And I close the browser

  @logout
  Scenario: Test logout
    Then I click on my account link
    And I click on logout link
