Feature: Add Products in Cart

  @12
  Scenario: Add Products in Cart
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User hover over the first product and add to cart
    And User clicks the 'Continue Shopping' link
    And User hover over the second product and add to cart
    And User clicks the 'View Cart' link
    And User verifies that both products are added to cart
    Then User verifies their prices,quantity and total prices
