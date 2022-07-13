
  @16
    Feature: Place Order: Login before Checkout

      Scenario: Place Order: Login before Checkout
        Given User go to the automationexercise homepage
        When User sees homepage
        And User clicks Signup Login button
        And User verifies 'New User Signup!' is visible
        And User enter email "test.equals.quality@gmail.com" and password "123456"
        And User clicks Login button
        And User sees own name top right side of the page as "Yasin DEĞER"
        And User hover over the first product and add to cart
        And User clicks the 'View Cart' link
        And User clicks the 'Proceed To Checkout' link
        And User verifies address details and ensure that address is displayed
        And User enters description in the comment box
        And User clicks Place Order button
        And User enters credit card name
        And User enters credit card number
        And User enters credit card cvc
        And User enters credit card expiration date
        And User clicks Pay and Confirm Order button
        Then User verifies that 'Congratulations! Your order has been confirmed!' message displayed