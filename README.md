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
=======
# Picture Puzzle Game

The Picture Puzzle Game is a Java application that presents players with a shuffled set of images, challenging them to rearrange the images and restore them to their original order. It provides an interactive and engaging graphical user interface (GUI) where players can click on buttons to swap images and solve the puzzle.

## Features

- Random shuffling of images: The game shuffles the images randomly each time it is played, ensuring a unique puzzle configuration.
- GUI interface: The game utilizes Java Swing components to create an interactive GUI where players can visually interact with the puzzle.
- Reset functionality: Players can reset the puzzle to its initial state by clicking the "Reset" button.
- Win detection: The game checks if the puzzle has been solved after each move, displaying a congratulatory message when the puzzle is correctly solved.

## Getting Started

To use the Picture Puzzle Game, follow these steps:

1. Clone or download the repository to your local machine.
2. Prepare a set of images to use in the puzzle. You can use any image and split it into a 3x3 grid using an online image splitter tool like [Postcron Image Splitter](https://postcron.com/image-splitter/editor/en/upload-image). Adjust the grid size to 3x3 and download the resulting zip file.
3. Extract the downloaded zip file and rename the extracted folder to "Images".
4. Place the "Images" folder in the same directory as the Java code file.
5. Compile and run the Java code using your preferred Java development environment or command line.

## Usage

1. Launch the Picture Puzzle Game by running the Java code.
2. The game window titled "Coderunner Picture Puzzle" will appear.
3. Click on the buttons to swap the images and rearrange them.
4. Continue swapping the images until you have successfully restored the original order.
5. Once the puzzle is solved, a message box will appear congratulating you on your victory.
6. To reset the puzzle, click the "Reset" button at the bottom of the game window.

## Dependencies

The Picture Puzzle Game utilizes the following dependencies:

- `javax.swing.JFrame`: Provides the main application window and GUI functionality.
- `javax.swing.JOptionPane`: Displays dialog boxes for messages and user interactions.
- `javax.swing.JPanel`: Represents a container for GUI components.
- `java.util.ArrayList`: Stores the images and buttons in dynamic arrays.
- `java.util.Collections`: Enables shuffling of the buttons to create a randomized puzzle.

## Conclusion

The Picture Puzzle Game demonstrates the capabilities of Java in creating interactive GUI applications. It offers an enjoyable and challenging experience for players to solve puzzles by rearranging images. By understanding the code and following the provided instructions, users can easily set up the game with their own set of images and start playing.

Feel free to explore and modify the code to add new features or customize the game further. Enjoy solving the picture puzzle and have fun!
>>>>>>> 9d900f0a6d55f470383cafa6a4d621a2105e4805
