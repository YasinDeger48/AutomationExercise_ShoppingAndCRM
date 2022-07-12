Feature: Contact Us Form

  @contact
  Scenario: Contact Us Form
    Given User go to the automationexercise homepage
    When User sees homepage
    And User clicks the Contact us button
    And User verifies 'Get In Touch' is visible
    And User enters name, email, subject and your message
    And User upload file
    And User clicks the submit button
    And User clicks OK on the alert button
    And User verifies 'Success! Your details have been submitted successfully.' is visible
    And User clicks the home button
    Then User sees homepage



