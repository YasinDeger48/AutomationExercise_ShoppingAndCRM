Feature: Verify Product quantity in Cart

  @productQuantity
  Scenario: Verify Product quantity in Cart
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the random view product link
    And User verifies that all details is visible
    And User increases quantity to 4
    And User clicks 'Add to cart' button
    Then User verifies that correct quantity is shown in the cart