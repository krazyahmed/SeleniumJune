Feature: AddEmployee Functionality

Scenario: As an admin I should be able to add employee
Given we logged into orangehrm application
When we click on PIM,AddEmployee and add multiple employess info
|First Name|Middle Name|Last Name|Employee ID|
|Sai       |Krishna    |G        |11111      |
|Hari      |Prasad     |P        |22222      |
|Ravi      |Kiran      |K        |33333      |
And logout of the application



