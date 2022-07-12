Feature: Search Product

  @SearchProduct
  Scenario: Search Product
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User navigate to all products page
    And User enters product name into search box and click search button
    And User verifies searched product is visible
    Then User verifies all prodcut related to search keyword