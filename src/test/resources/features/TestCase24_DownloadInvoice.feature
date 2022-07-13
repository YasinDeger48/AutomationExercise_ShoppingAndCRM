Feature: Download Invoice after purchase order

  @24
  Scenario: Download Invoice after purchase order
    Given User go to the automationexercise homepage
    When User sees homepage
    And User hover over the first product and add to cart
    And User clicks the 'View Cart' link
    And User clicks the 'Proceed To Checkout' link
    And User clicks register-login link
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
    And User clicks the cart link
    And User clicks the 'Proceed To Checkout' link
    And User verifies address details and ensure that address is displayed
    And User enters description in the comment box
    And User clicks Place Order button
    And User enters credit card name
    And User enters credit card number
    And User enters credit card cvc
    And User enters credit card expiration date
    And User clicks Pay and Confirm Order button
    And User verifies that 'Congratulations! Your order has been confirmed!' message displayed
    And User clicks the Download Invoice button
    Then User clicks the continue button



