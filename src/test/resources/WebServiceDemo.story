Web service validation stories

Narrative:
In order to validate response from https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false URI
As a developer, QA
I want to validate Name,CanReList and promotion name and description in one scenario

Scenario: Validate  Name
Given I provide a valid API URI
When Send Request
Then Validate Name : Carbon credits


Scenario: Validate CanReList
Given I provide a valid API URI
When Send Request
Then Validate CanReList : true


Scenario: Validate promotion name and description
Given I provide a valid API URI
When Send Request
Then validate Promotion Name : Gallery and Description : Good position in category


Scenario: Validate Name ,CanReList and promotion name and description
Given I provide a valid API URI
When Send Request
Then Validate Name : Carbon credits
And Validate CanReList : true
And validate Promotion Name : Gallery and Description : Good position in category