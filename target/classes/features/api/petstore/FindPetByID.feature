Feature: Find pet in the petstore By ID using GET API

  Scenario:Find pet in the petstore using all the valid data

    Given I have valid ID to find a pet
    When I send GET request with valid header
    Then I should get the valid successful response
