package com.rouven.platformer_game;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        initialize();
    }

    public void initialize() {
        window = new JFrame();
        window.setTitle("Platformer Game");
        window.setLayout(new BorderLayout(10, 5));
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);

        window.add(new JButton("NORTH"), BorderLayout.NORTH);

    }

    public void show() {
        window.setVisible(true);
    }
}