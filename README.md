# Tic Tac Toe
Tic-tac-toe is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. 
The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row is the winner.

### 1. Tic-tac-toe with Java Scanner

#### How it works
When you run the tic-tac-toe game, you need to input numbers by row and col.
For example: 
when you to pick up row 1 and col 2. you need to input 1 then <b> press enter </b> and input 2. <br/>
So your "X" will show like this. <br/>
[ , X , ] <br/>
[ , , ] <br/>
[ , , ] <br/>

#### Run TicTacToe Scanner
    * cd /folder    -> (open project root)
    * javac TicTacToe.java  -> (compile java code)
    * java TicTacToe    -> (run compiler)
    
#### Tech / stack TicTacToe Scanner
    * Java Scanner  -> (to get user input)


### 2. Tic-tac-toe with Spring-Boot Web

#### How it works
pick your box for "X", then the computer will automatically pick up "O". Then you continue to your second "X". Till find the winner or draw.
Disable the checkbox "Play First", if you want the computer pick up "X" or play first.
If you want to play again, just press button New Game.

#### Run TicTacToe Scanner
    * cd /folder    -> (open project root)
    * mvn spring-boot:run -> (build and run app use maven)
    * open http://localhost:8080/   -> (open your browser and paste this link to show you the game)

#### Tech / stack TicTacToe Scanner
    * spring-boot thymeleaf
    * spring-boot web
