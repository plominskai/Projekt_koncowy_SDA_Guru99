Feature: automated end to end test
  Descrpition: The purpose of this is end to end test

  Scenario: user will go to login page, enter credentials and login to dashboard page
    Given user is on loginPage
    When user enter userName
    And user enter passWord
    And user logs in
    And correct user is logged in