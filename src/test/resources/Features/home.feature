Feature: Automation of the Taskmo Official Website

  @Browseropen
  Scenario: Verification of Taskmo Website automation
    Given  Open the Chrome browser
    When   Navigate the Taskmo website
    Then   check the Taskmo Logo is Displayed on Website

  Scenario: Verification of Links
    Given click on Aboutus Page
    When  click on Services Page
    And  click on Blogs Page
    Then click on Contactus Page

  Scenario: Verification of close browser
    Then close the browser

