# this is my comment
@sanity @login @regression
Feature: to validate login

  Scenario: to check if the user is having valid details to login
    Given the web application is loaded
    When the user logs in with username
      | username | role     |
      | harry    | admin    |
      | peter    | customer |
      | john     | admin    |
    And the "valid" password
    Then the user to be taken to home page

  Scenario: to check if the user is having invalid details to login
    Given the web application is loaded
    When the user logs in with username
      | username | role  |
      | prakash  | admin |
    And the "invalid" password
    Then the user to be taken to home page
