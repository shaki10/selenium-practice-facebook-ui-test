Feature:Get pet from the petstore with GET API
@getpet
  Scenario:Get pet with valid pet ID
    Given I have valid URL with all the valid data
    When I sent the POST request with valid header
    Then I validate the successful response
    When I send request with valid url and valid pet ID
    Then I validate the successful response for get pet