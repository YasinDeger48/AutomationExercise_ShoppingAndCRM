Feature: Logout User
@5
  Scenario: User logged out
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    And User verifies 'Login to your account' is visible
    And User enter email "test.equals.quality@gmail.com" and password "123456"
    And User clicks Login button
    And User sees own name top right side of the page as "Yasin DEĞER"
    And User clicks the logout button
    Then User sees the login page
