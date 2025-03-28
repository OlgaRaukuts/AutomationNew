Feature: Webdriver University - Contact Us Page
  Scenario: Validate Successful Submission
    Given I access the webdriver university contact us page
    When I enter a first name
    And I enter a last name
    And I enter an emeail address
    And I enter a comment
    And I click on the submit button
    Then I shoulbe be presented with the successful contact us submission message

