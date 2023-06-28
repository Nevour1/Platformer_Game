package com.rouven.platformer_game;

import com.rouven.platformer_game.game.Game;
import javax.swing.SwingUtilities;

public class Main {


    public static void main(String[] args) {

        Game game = new Game();

        game.startGameThread(); // TODO: Doesn't terminate right now

        // This opens the window created in the MainWindow class
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();
            }
        });
    }

}