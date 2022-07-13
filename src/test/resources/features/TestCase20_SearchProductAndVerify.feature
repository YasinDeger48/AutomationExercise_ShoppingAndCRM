Feature: Search Products and Verify Cart After Login

  @20
  Scenario: Search Products and Verify Cart After Login
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User enters product name into search box and click search button
    And User verifies searched product is visible
    Then User verifies all prodcut related to search keyword
    And User hover over the products one by one and add to cart and clicks the continue button
    And User clicks the cart link
    And User verifies that correct quantity items in the cart
    And User clicks Signup Login button
    And User enter email "test.equals.quality@gmail.com" and password "123456"
    And User clicks Login button
    And User sees own name top right side of the page as "Yasin DEĞER"
    And User clicks the cart link
    Then User verifies that correct quantity items in the cart

