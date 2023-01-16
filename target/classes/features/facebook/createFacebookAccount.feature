Feature: As a facebook user I should be able to log in successfully

  @MyTag
  Scenario: Log in to facebook account successfully
    Given I am in facebook home page
    When I enter credentials

      | fisherman@gmail.com | password1 |
      | goldman@gmail.com   | password2 |
      | shdgfhs@jasgf       | password3 |
    Then I click on sign in button

  @Smoke
  Scenario: Log in to facebook account successfully

    Given I am in facebook home page
    When I enter data

      | email     | password            |
      | password1 | fisherman@gmail.com |
      | password2 | goldman@gmail.com   |
      | password3 | shdgfhs@jasgf       |
    Then I click on sign in button

