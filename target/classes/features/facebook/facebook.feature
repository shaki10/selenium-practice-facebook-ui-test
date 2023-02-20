Feature: As a facebook user I should be able to log in successfully

  @MyTag
  Scenario Outline: Log in to facebook account successfully
    Given I am in facebook home page
    When I enter credentials


  Examples:
      | fisherman@gmail.com | password1 |
      | goldman@gmail.com   | password2 |
      | shdgfhs@jasgf       | password3 |
    Then I click on sign in button

  @Smoke
  Scenario Outline: Log in to facebook account successfully

    Given I am in facebook home page
    When I enter data

  Examples:
      | email               | password  |
      | fisherman@gmail.com | password1 |
      | goldman@gmail.com   | password2 |
      | shdgfhs@jasgf       | password3 |

    Then I click on sign in button
