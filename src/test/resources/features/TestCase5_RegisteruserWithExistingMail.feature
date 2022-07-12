Feature: Register User with existing email

  @6
  Scenario:Register User with existing email
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    And User verifies 'Login to your account' is visible
    And User enters same name or email address
    And User clicks the Singup button
    Then User verifies 'Email Address already exist!' is visible