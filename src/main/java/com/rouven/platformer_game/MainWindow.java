package com.rouven.platformer_game;

import com.rouven.platformer_game.game.GamePanel;

import javax.swing.*;
public class MainWindow {

    private JFrame window;

    public MainWindow() {
        initialize();
    }

    public void initialize() {
        window = new JFrame();
        window.setTitle("Platformer Game");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        GamePanel gamePanel = new GamePanel();

        window.add(gamePanel);
        window.pack();

    }

    public void show() {
        window.setVisible(true);
    }
}