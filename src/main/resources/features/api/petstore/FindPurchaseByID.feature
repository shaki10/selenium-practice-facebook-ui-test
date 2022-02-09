Feature: Find a pet purchase by pet ID with GET API

  @purchasepet

  Scenario: Find purchase int he store by pet ID
    Given I have valid ID for find purchase
    When I send GEt request to find the purchase in the store
    Then I validate the purchase history