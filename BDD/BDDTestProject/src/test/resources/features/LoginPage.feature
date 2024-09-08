Feature: LoginPage

  Background:
    Given User go to login page

  Scenario: Authorization with valid credentials
    And   User enter "rock@19.ua" in Email Address field
    And   User enter "qwerty" in Password field
    Then  User click on Login Button
    And  My Account link is displayed

Scenario: Authorization with invalid email address
    When User enters "invalid_email@19.ua" in the Email Address field
    And User enters "qwerty" in the Password field
    And User clicks on the Login Button
    Then Error message "Invalid email or password" is displayed

  Scenario: Authorization with invalid password
    When User enters "rock@19.ua" in the Email Address field
    And User enters "wrong_password" in the Password field
    And User clicks on the Login Button
    Then Error message "Invalid email or password" is displayed

  Scenario: Authorization with empty email and password
    When User leaves the Email Address field empty
    And User leaves the Password field empty
    And User clicks on the Login Button
    Then Error message "Email and Password cannot be empty" is displayed

  Scenario: Authorization with valid email and empty password
    When User enters "rock@19.ua" in the Email Address field
    And User leaves the Password field empty
    And User clicks on the Login Button
    Then Error message "Password cannot be empty" is displayed