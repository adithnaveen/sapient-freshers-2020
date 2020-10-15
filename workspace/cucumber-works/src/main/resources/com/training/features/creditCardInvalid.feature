@sanity @creditinvalid @regression
Feature: to check the credit card entry is wrong

  # when you apply background it only for the file to which
  # it is applied
  Background: 
    Given the application is loaded

  @invalid100k
  Scenario Outline: check if the customer has done transaction over limit
    When the transaction amout it more than "<amount>"
    Then call customer to check if okay

    Examples: 
      | amount |
      | 100000 |
      | 200000 |
      | 300000 |
      | 400000 |
      