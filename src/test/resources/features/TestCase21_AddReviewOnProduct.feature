Feature: Add review on product

  @21
  Scenario: Add review on product
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the product link
    And User clicks the random view product link
    And User sees Write Your Review
    And User enters name,email and review
    And User clicks the review submit button
    Then User sees Thank you for your review.