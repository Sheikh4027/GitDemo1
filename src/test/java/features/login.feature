Feature: loginApplication

Scenario: HomePage deafult login


Given User neviatge to the landing page "google.com"
When User input username "tufail" and password "1234"
Then User logged into his creditcard home page
And He can make payments

Given User neviatge to the landing page "google.com"
When User input username "tuf" and password "12314"
Then User logged into his creditcard home page
And He can make payments
