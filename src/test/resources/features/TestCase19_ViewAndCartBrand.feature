Feature: View & Cart Brand Products

  @19
  Scenario: View & Cart Brand Products
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User verifies that brands are visible on the left side
    And User clicks any brand name
    And User verifies that navigating to brands page
    And User clicks any brand name
    Then User verifies that navigating to brands page
