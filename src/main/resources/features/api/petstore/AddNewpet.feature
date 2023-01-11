Feature:Add pet to the petstore with Post API


  @addpet
  Scenario:Add pet to the petstore with all the valid data

    Given I have valid URL with all the valid data
    When I sent the POST request with valid header
    Then I validate the successful response

 # @addpet Positive
 #   Scenario:Add pet to the petstore with only mandatory data
  #  Given I have valid URL with only mandatory data
  #  When I sent the POST request with valid header
  #  Then I validate the successful response

  #@addpet @negative
 # Scenario:Add pet to the petstore with  invalid data

   # Given I have valid URL with invalid data
   # When I sent the POST request with valid header
   # Then I validate the unsuccessful response
#@addpet @negative
 # Scenario:Add pet to the petstore with  invalid data
