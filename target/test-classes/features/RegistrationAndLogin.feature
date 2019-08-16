Feature: Registration and Login

  Scenario: Registration and Login
    Given Navigate to sharelane.com
    When You`ve been navigated to it click Sign-up
    And Enter Zip code
    Then Click Continue
    And Enter first name
    And Enter last name
    And Enter email
    And Enter password
    And Enter confirmation password
    Then Click Register
    When You`ve been registered, click underlined here
    Then Enter emailpassword
    And Click Login
    Then You`ve been signed in

