Scenario: Start a new game
Given A new game
Then The score is 0





Scenario: Single Regular Movie
Given A new customer
When The customer rents movie "Armageddon" of category REGULAR for 2 days
Then The invoice total is 2.00
And The earned renter points are 1