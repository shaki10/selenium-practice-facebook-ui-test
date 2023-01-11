Feature:Get pet by status using GET pet API

  @getpetbystatus
  Scenario Outline: Get pet successfully using valid status
    When I send get request to get all pet which has status <value>
    Then I validate the successful response for get pet by status

    Examples:
      | value    |
      | avilable |
      | pending  |
      | sold     |
      | invalid  |

  Scenario:Get pet using invalid status
    When I send get request to get pet which has invalid status
    Then I validate the successful response for get pet by invalid status
