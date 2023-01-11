Feature: Place an order for pet to the petstore with Post API


 @orderpet
  Scenario:Place an order for a pet to the petstore with all the valid data

    Given I have valid URL to place and order for a pet
    When I sent the POST request with valid header to order for a pet
    Then I validate the successful response to the order