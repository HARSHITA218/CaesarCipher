# Tic Tac Toe Game (Java Swing)

A simple **Tic Tac Toe** game implemented in **Java** using **Swing** for the GUI. The game allows a user to play against a simple random-move AI.

## Features

* Interactive **GUI** with **buttons** representing the 3x3 grid.
* **Player vs Computer** gameplay.
* Prevents **overwriting of moves**.
* Detects **win, lose, and draw** situations.
* Displays result in a **pop-up message**.

## Screenshots

<img width="618" height="614" alt="image" src="https://github.com/user-attachments/assets/5b720630-eab4-48f6-873c-413c5c0d8a6c" />



## How to Play

1. Run the program using your favorite IDE or command line.
2. Enter your name and click **Start**.
3. Click on a cell to make your move (**X**).
4. The computer will automatically make its move (**O**).
5. The game ends when a player wins or the board is full (**Draw**).

## Requirements

* **Java 8 or higher**
* No additional libraries required (uses `javax.swing` and `java.awt`).

## How to Run

### Using IDE:

1. Open the project in **IntelliJ IDEA**, **Eclipse**, or another Java IDE.
2. Run the `SwingP1.java` file.

### Using Command Line:

```bash
javac SwingP1.java
java SwingP1
```

## Code Structure

* `SwingP1.java` - Main game file containing:

  * GUI setup
  * Game logic
  * Computer move logic
  * Win/draw detection

## Game Logic

* Player moves are marked with **X**.
* Computer moves are randomly chosen empty cells and marked with **O**.
* After every move, the game checks for:

  * **Winner**: If a row, column, or diagonal has the same symbol.
  * **Draw**: If all cells are filled and no winner.

## Future Improvements

* Smarter AI using **minimax algorithm**.
* Multiplayer mode (two human players).
* Animated GUI and enhanced graphics.
