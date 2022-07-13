Feature: Verify address details in checkout page

  @23
  Scenario: Verify address details in checkout page
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    And User enters name and email address
    And User clicks the Singup button
    And User checks title
    And User enters password
    And User choose birthday as "11 April 1987"
    And User clicks the "Sign up for our newsletter!"
    And User clicks the "Receive special offers from our partners!"
    And User enters first name
    And User enters last name
    And User enters company name
    And User enters Address
    And User choose country name as "United States"
    And User enters state name as "VA"
    And User enters city name as "Virginia"
    And User enters zipcode as "11200"
    And User enters mobile number as "11123456"
    And User clicks the create button
    And User clicks the continue button
    And User sees own name top right side of the page
    And User hover over the first product and add to cart
    And User clicks the 'Continue Shopping' link
    And User clicks the cart link
    And User verifies that product displayed in cart
    And User clicks the 'Proceed To Checkout' link
    And User verifies that delivery address and billing address is fill out


