Feature: Verify Subscription in home page
@10
  Scenario: Verify Subscription in home page
    Given User go to the automationexercise homepage
    When User sees homepage
    And User scroll down to footer
    And User verifies subscription
    And User enters email address and click the arrow button
    Then User verifies that 'You have been successfully subscribed!' is visible