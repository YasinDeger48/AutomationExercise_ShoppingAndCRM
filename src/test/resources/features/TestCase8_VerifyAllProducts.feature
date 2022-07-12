Feature: Verify All Products and product detail page

  @verifyproducts
  Scenario: Verify All Products and product detail page
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User navigate to all products page
    And User sees all products
    And User clicks the first product
    And User sees product details page
    Then User verifies that all details is visible


