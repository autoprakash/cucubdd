@ServiceNow
Feature: I want to Login to ServiceNow application

  Scenario: 
    Given User launches the chrome browser and enters the url
    When User provides UserName and Password
    Then User login to ServiceNow successfully
    Then User Clicks on StartBuilding
    Then Click on All and navigate to Service catalog
    Then Click on Peripherals
    Then Click on Logitech Wireless Mouse
    Then Set Order Mouse Qty to two
    Then Click on Request Number
    Then Click on Request Number and update details
    Then Navigate to Requested Item details
    Then Update Requested Item details
    Then User  add work Notes
    Then User Closes the Task
    Then User adds Additional Comments
    Then  User deletes the task and quit the browser
