Feature:Create pet List  to the petstore with Post API


@petwithlist
  Scenario:Creat a pet list to the petstore with all the valid data
    Given I have valid URL with all the valid data to create pet list
    When I sent the POST request with valid header to make list
    Then I validate the successful response to the list

  Scenario:Creat a pet list to the petstore with all the valid data
    Given I have valid URL with all the valid data to create pet list
    When I sent the POST request with valid header to make list
    Then I validate the successful response to the list