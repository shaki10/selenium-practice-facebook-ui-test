Feature:Delete pet from the petstore with DELETE API

 @deletepet
 Scenario:Delete pet with valid pet ID
   Given I have valid URL with all the valid data
   When I sent the POST request with valid header
   Then I validate the successful response
   When I send request to delete with valid url and valid pet ID
   Then I validate the successful response for delete pet


  # @Negative
  # Scenario:Delete a pet form the petstore with wrong pet ID
  # Given I have added valid URL and parameter for delete request
  # When I send request to delete with valid url and valid pet ID
  # Then I validate the successful response for delete pet

