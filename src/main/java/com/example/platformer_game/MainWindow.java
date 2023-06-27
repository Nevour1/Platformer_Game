package com.example.platformer_game;

import javax.swing.JFrame;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("Plattformer Game");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);

    }

    public void show() {
        window.setVisible(true);
    }
}