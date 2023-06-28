/**
 * This class runs the Game
 */

package com.rouven.platformer_game.game;

public class Game implements Runnable{

    public Game() {
        this.run();
    }

    Thread gameThread;

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while (gameThread != null) {

            // Update player information
            update();
            // Draw Screen
            GamePanel gamePanel = new GamePanel();
            gamePanel.repaint();
        }
    }

    public void update() { }

}
