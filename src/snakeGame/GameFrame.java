// GameFrame.java (this file should be inside the snakeGame package)
package snakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {
        // Add the game panel to the frame
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // Size the window based on its content (GamePanel)
        this.setVisible(true);
        this.setLocationRelativeTo(null); // Center the window on screen
    }
}

