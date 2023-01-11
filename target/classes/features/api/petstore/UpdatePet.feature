Feature:Update an existing pet to the petstore with Put API


  @updatepet
  Scenario:Update an existing pet to the petstore with all the valid data

    Given I have valid URL with all the valid information
    When I sent the Put request with valid header
    Then I validate the successful response to the store



   # @Negative
   # Scenario:Update an existing pet in the petstore with invalid data
    #  Given I have valid URL with all the valid information
    #  When I sent the Put request with Invalid header
     # Then I validate the unsuccessful response to the store