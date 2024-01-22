# Projektwoche WS 2022_23

## Exercise Sheet B – "Console Games"

### Exercise 1 – Solitaire

Create a Java console application for the game "Solitaire" according to the following 10 points.

Game board: 5x5 square solitaire

1. Implement a square 5x5 Solitaire game.
2. Keep the game board size variable despite the fixed specification of 5x5 fields.
3. Create a class `Solitaire` with the main method `main`.
4. Create a class `GameBoard`.
5. If a pin (`#`) is jumped over by another, it is removed from the game board.
6. A pin may not be pulled out of the game board.
7. A pin may not be moved onto another pin.
8. Implement a method `outputGameBoard`.
9. Implement a method `startGame` that creates a game board according to the example given above.
10. Create a method `move`, and implement your game logic in this method. This method should also handle the input of coordinates (the pin that should be moved into the empty field is chosen).

### Exercise 2 – Connect Four

Create a Java console application for the game "Connect Four", which can be played as a two-player version.

1. The class `ConnectFour` manages the two players and controls the game flow.
2. The class `Player` contains a constructor to which a name and the player number (1 or 2) are passed.
3. There is a get method for each of the two attributes.
4. The class `GameBoard` has a constructor to which the size of the game board (default: 6 rows by 7 columns) is passed, and then the game board is implemented as a two-dimensional array.
5. The method `initializeGameBoard` initially initializes the game board with 0 (zero).
6. There is a method `printGameBoard` that outputs the current game board, including the placed game pieces.
7. A game piece has the corresponding player number as its value.
8. The method `placeGamePiece` places the game piece in the corresponding column, depending on the current player and the chosen drop spot.
9. The method `checkWin` tests the game board for a possible win, depending on the player. A player has won if four game pieces are connected horizontally, vertically, or diagonally.
If all 42 game pieces have been played without a player winning, the game ends in a draw.
10. Create get and set methods for the class `GameBoard`, if needed.

Game board with a possible game progression:

### Exercise 3 – Battleship

In the game "Battleship", two players place ships on their own game board in secret. The following ships should be placed:

- 3 submarines (length 2)
- 2 destroyers (length 3)
- 1 cruiser (length 4)
- 1 battleship (length 5)

The goal of the game is to sink all of the opponent's ships before they sink your own. Players take turns firing a shot at the opponent's field. The shooter receives feedback on whether they hit a ship or water.

At the end of the task description, you will see an example of an ongoing game.

Note: You can implement helper methods at any time to help you check whether a given field is valid or not.

1. Create a 10x10 game board. Write a method `printField` that can display the game board with labels. Use the letters A – J for the rows and the numbers 1 – 10 for the columns.
Remember that you should be able to see the ships on your own game board, but not on the opponent's.
For the game board, use the following labels:
   - `S` – Ship
   - `O` – Shot in the water
   - `*` – Hit on a ship
Fields that have water or that the player cannot see on the opponent's board are displayed empty.
2. Write a method `printFields` that outputs the game board of the opponent and the player.
3. Write a method `setShip` to place a ship on the game board. The start and end points should be passed.
Remember that ships can only be placed in a straight line. They must start and end within the game board, and they must not overlap.
Also, the positions must match the length of the ship. This means that a submarine with a length of 2, which starts at A1, can only end at A2 or B1.
Provide feedback through the console if this requirement is not met.
4. Create a method `shoot` for firing at a field. Let the impact of the shot be visible:
   - `O` – Shot in the water
   - `*` – Hit on a ship
Of course, a valid field must be chosen again. If the targeted field is outside the game board, please provide feedback, as already mentioned under (3).
Also provide feedback if the field has already been shot at, and let the player (or the "Artificial Intelligence" to be programmed under (7)) shoot again until a free field is chosen.
5. Create a method `start`, in which a player can place their ships. This should be done using a scanner:
   ```java
   Scanner sc = new Scanner(System.in);
   ```
The coordinates are passed to the method under (3).
After each placed ship, the player should be able to see their game board.
6. Create a method `update`, in which a loop runs until one player has won the game. Within this loop, the player can shoot at a field by specifying the position. This position can again be read in with the scanner and passed to the method under (4).
7. Enhance the methods under (4) and (5) with a simple opponent AI. When placing, it should randomly determine the starting position. This can be done using:
   ```java
   Random r = new Random();
   r.nextInt();
   ```
Firing at fields can also happen randomly. The AI does not have to follow whether it has already hit a ship or not.

Below is an example of a game situation:

In the opponent's field, only hits (`*`) or misses (`O`) of the ships are displayed. In the player's field, the positions of the ships are also visible.
