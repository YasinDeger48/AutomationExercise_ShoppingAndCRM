@3
Feature: Login feature with valid credentials

  Scenario: Login with valid credentials
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    And User verifies 'Login to your account' is visible
    And User enter email "test.equals.quality@gmail.com" and password "123456"
    And User clicks Login button
    And User sees own name top right side of the page as "Yasin DEĞER"
