Feature: As a user,I want to order the oil

Background:
Given The user enters the testing site

@case1
Scenario: The user get the address
When To click contact us
And To scroll down and see the address
Then To get the Head Office address

@case2
Scenario: The user downloads the brochure
When To click the AboutUs button
And User scroll down and see the brochure
Then User click the brochure

@case3
Scenario: The user checks the products
When To click the product button
And To mouse hover the product and clicks the car diffusers
