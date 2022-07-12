Feature: Login user with incorrect email and password

@4
  Scenario: Login with invalid credentials
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    And User verifies 'Login to your account' is visible
    And User enter email "test.equals.quality@gmail.com" and password "123456"
    And User clicks Login button
    And User sees "Your email or password is incorrect!"