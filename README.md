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