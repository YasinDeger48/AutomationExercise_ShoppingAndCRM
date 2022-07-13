Feature: Remove Products From Cart

  @17
  Scenario: Remove Products From Cart
    Given User go to the automationexercise homepage
    When User sees homepage
    And User hover over the first product and add to cart
    And User clicks the 'View Cart' link
    And User clicks the delete sign button
    And User verifies that cart list is empty