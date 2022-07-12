Feature: Verify Test Cases Page

  @TestCase
  Scenario: Verify Test Cases Page
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Test Cases link
    Then User navigated test case page successfully