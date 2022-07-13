Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  @26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given User go to the automationexercise homepage
    When User sees homepage
    And User scroll down to footer
    And User verifies subscription
    And User scroll up to header
    Then User sees Full-Fledged practice website for Automation Engineers