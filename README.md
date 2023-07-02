# JAVA Word Puzzle

The  Word Puzzle is a Java application that challenges players to unscramble jumbled words within a limited time. It provides an interactive and engaging experience for users to test their vocabulary and problem-solving skills. In this readme file, you will find information about the project, instructions on how to run the code, and an overview of the features and functionality.

## Table of Contents
- [Introduction](#introduction)
- [Instructions](#instructions)
- [Libraries Used](#libraries-used)
- [Code Structure](#code-structure)
- [Conclusion](#conclusion)

## Introduction
The CodeRunner Word Puzzle is designed to entertain and challenge players by presenting them with jumbled words that they need to unscramble within a given time limit. The game consists of multiple levels, each with a different set of words. As the player progresses through the levels, the difficulty and complexity of the words increase.

## Instructions
To run the CodeRunner Word Puzzle, follow these steps:

1. Make sure you have Java installed on your system.
2. Download or clone the project repository to your local machine.
3. Open a terminal or command prompt and navigate to the project directory.
4. Compile the Java source file by executing the following command:
   ```
   javac Puzzle.java
   ```
5. Run the compiled program using the following command:
   ```
   java Puzzle
   ```
6. The game window will appear, displaying the jumbled word and various buttons.
7. Click the "Start" button to begin the game.
8. Use your keyboard to enter the unscrambled word in the provided text field.
9. Press the "Enter" button or hit the "Enter" key to submit your answer.
10. If your answer is correct, the score will increase, and a new word will be displayed.
11. If you're having difficulty with a word, you can click the "Skip" button to move to the next word (limited number of skips available).
12. The game will continue until the time runs out or until you decide to reset the game.

## Libraries Used
The CodeRunner Word Puzzle code utilizes the following libraries:

- `java.awt` and `javax.swing`: These libraries provide the necessary classes for creating the graphical user interface (GUI) components, such as windows, buttons, labels, and text fields.

## Code Structure
The code for the CodeRunner Word Puzzle is structured as follows:

1. Import statements: Import necessary classes from the required libraries.
2. Class declaration: Define the `Puzzle` class, which contains the main logic and GUI components.
3. Variable declarations: Declare the instance variables used in the class.
4. `main` method: The entry point of the program. It creates an instance of the `Puzzle` class and makes the GUI visible.
5. `Puzzle` constructor: Initialize the GUI components and set their properties.
6. `initialize` method: Set up the layout and event handlers for the GUI components.
7. Game logic methods:
   - `levelCounter`: Update the level counter based on the number of words played.
   - `selectRandomWord`: Select a random word from the current level's word list.
   - `jumble`: Jumble the letters of a word to create a scrambled version.
   - `swapIndex`: Swap two characters at specified indices in a word.
   - `playGame`: Display a new word and its jumbled version for the player to unscramble.
   - `updateScore`: Update the player's score when they successfully unscramble a word.
   - `time`: Start a timer to count down the remaining time.
   - `resetGame`: Reset the

 game to its initial state.
8. Event handlers:
   - `startBtn` action listener: Start the game when the "Start" button is clicked.
   - `enterBtn` action listener: Process the player's answer when the "Enter" button is clicked or the "Enter" key is pressed.
   - `skipBtn` action listener: Skip the current word and move to the next one when the "Skip" button is clicked.
   - `timerListener` action listener: Update the timer and end the game when the time runs out.

## Conclusion
The CodeRunner Word Puzzle is an interactive Java application that provides a fun and challenging word jumble game. It offers multiple levels of difficulty, a countdown timer, scoring system, and skip functionality. The graphical user interface (GUI) is implemented using the `java.awt` and `javax.swing` libraries, allowing for an intuitive and engaging user experience. Test your vocabulary skills and see how many words you can unscramble within the time limit. Have fun playing!