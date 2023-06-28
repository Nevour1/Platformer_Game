/**
 * This class runs the Game
 */

package com.rouven.platformer_game.game;

import java.awt.*;
import javax.swing.*;

public class Game extends JPanel implements Runnable {

    int FPS = 60;

    Player player = new Player();
    PlayerController playerController = new PlayerController();
    GamePanel gamePanel = new GamePanel();

//    public Game() {
//        this.run();
//        this.startGameThread();
//    }


    Thread gameThread;

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
            }

//            try {
//                double remainingTime = nextDrawTime - System.nanoTime();
//                remainingTime = remainingTime / 1000000;
//
//                if(remainingTime < 0) {
//                    remainingTime = 0;
//                }
//
//                Thread.sleep((long) remainingTime);
//
//                nextDrawTime += drawInterval;
//
//            }  catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }


    public void update() {

        if(playerController.upPressed == true)  {
            System.out.println("W pessed");
           int x = player.getPosX() / player.getSpeed();
           player.setPosX(x);
        }
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);
        g2.fillRect(player.getPosX(), player.getPosY(), gamePanel.tileSize, gamePanel.tileSize);

        g2.dispose();
    }

}
