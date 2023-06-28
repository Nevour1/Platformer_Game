package com.rouven.platformer_game.game;

public class Player {

    private int PosX = 100;
    private int PosY = 100;
    private int Speed = 3;

    public Player() {
        int posX = this.PosX;
        int posY = this.PosY;
        int speed = this.Speed;
    }


    public int getPosX() {
        return PosX;
    }

    public void setPosX(int posX) {
        PosX = posX;
    }

    public int getPosY() {
        return PosY;
    }

    public void setPosY(int posY) {
        PosY = posY;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
}
