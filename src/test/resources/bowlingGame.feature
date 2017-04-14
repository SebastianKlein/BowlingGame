Scenario: Start a new game
Given A new bowling game
Then The score is 0


Scenario: Start a new game
Given Two players
Then Each player has score 0

Scenario: Player bowls
Given A new bowling game with one player
When Player rolls 3 pins
When Player rolls 3 pins
Then Player score is 6

Scenario: Next player's turn
Given A new bowling game with two players
When Player1 rolls 3 pins
When Player1 rolls 3 pins
Then Player2 turn

Scenario A game
Given A new bowling game with one player
When Player rolls 1 pins 20 times
Then Player score is 300

Scenario A player rolls a strike
Given A new bowling game with one player
When Player rolls 10 pins
When Player rolls 3 pins
When Player rolls 2 pins
Then Player score is 20

Scenario A player rolls a spare
Given A new bowling game with one player
When Player rolls 3 pins
When Player rolls 7 pins
When Player rolls 3 pins
When Player rolls 2 pins
Then Player score is 18

Scenario: Perfect game
Given A new bowling game with one player
When Player rolls 10 pins 12 times
Then Player scores is 300



