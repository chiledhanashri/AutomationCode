@WebInput
Feature: Web Inputs for Automation Testing

Background: 
Given Navigate to Practice Website

@Input1
Scenario: Practice Web Inputs1
When User Enters a Number
And User Enters a Text
And User Clicks on Display Inputs Btn
Then Output Field should be displayed

@Input2
Scenario: Practice Web Inputs2
When User Enters a Password
And User Enters a Date
And User Clicks on Display Inputs
Then Output Field should be displayed with details

