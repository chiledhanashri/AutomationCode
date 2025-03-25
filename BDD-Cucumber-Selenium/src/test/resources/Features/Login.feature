@LoginTest1
Feature: Login to facebook with invalid credentials 

Scenario Outline:
Given User navigates to Facebook Login page
When User Enter "<username>" and "<password>"
And clicks on Log-in button
Then User should not be able to login

Examples:
|username|password|
|abc@gmail.com|abc123|
|xyz987@gmail.com|xyz987| 



















#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with "<name>"
    #When I check for the "<value>" in step
    #Then I verify the "<status>" in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
