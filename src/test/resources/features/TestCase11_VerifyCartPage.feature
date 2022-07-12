Feature: Verify Subscription in Cart page

  @cartpage
  Scenario: Verify Subscription in Cart page
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the cart link
    And User scroll down to footer
    And User verifies subscription
    And User enters email address and click the arrow button
    Then User verifies that 'You have been successfully subscribed!' is visible