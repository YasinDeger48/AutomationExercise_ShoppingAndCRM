Feature: Add to cart from Recommended items

  @22
  Scenario: Add to cart from Recommended items
    Given User go to the automationexercise homepage
    When User sees homepage
    And User scroll down to footer
    And User verifies that Recommended Items is displayed
    And User and to cart one Recommended Item
    And User clicks the 'View Cart' link
    Then User verifies that product displayed in cart