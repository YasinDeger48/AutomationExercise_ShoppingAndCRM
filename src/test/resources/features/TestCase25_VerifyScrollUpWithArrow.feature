Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  @25
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given User go to the automationexercise homepage
    When User sees homepage
    And User scroll down to footer
    And User verifies subscription
    And User clicks the arrow for move upward
    Then User sees Full-Fledged practice website for Automation Engineers