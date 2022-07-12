Feature: Register User

  @1
  Scenario: Register user
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks Signup Login button
    Then User verifies 'New User Signup!' is visible

    @2
    Scenario: User sign up
      Given User go to the automationexercise homepage
      When User sees homepage
      And User clicks Signup Login button
      And User verifies 'New User Signup!' is visible
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
      Then User sees own name top right side of the page







