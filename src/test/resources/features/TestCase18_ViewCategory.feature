Feature: View Category Products

  @18
  Scenario: View Category Products
    Given User go to the automationexercise homepage
    When User sees homepage
    And User verifies categories is displayed on left side
    And User clicks the women category
    And User clicks the dress category under the women
    And User verifies category name displayed and confirm text
    And User clicksany sub category under the man category
    Then User verifies that category name is displayed
