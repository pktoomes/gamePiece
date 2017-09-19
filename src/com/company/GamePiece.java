package com.company;
import java.util.Random;
import java.util.Scanner;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    int minX;
    int maxX;
    int minY;
    int maxY;
    String name;
    String color;

    public GamePiece(String name, String color) {
        positionX = 0;
        positionY = 0;
        frozen = false;
        minX = 0;
        maxX = 100;
        minY = 0;
        maxY = 500;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void move(){
        if (this.frozen == true) {
            System.out.println(this.name + " is frozen and can't move. " + this.name + "'s X position: " + this.getPositionX() + ". " + this.name + "'s Y position: " + this.getPositionY() + ".");
        } else {
            Random randoNew = new Random();
            this.positionX = randoNew.nextInt(maxX);
            this.positionY = randoNew.nextInt(maxY);
            System.out.println(this.name + "'s X position: " + this.getPositionX() + ". " + this.name + "'s Y position: " + this.getPositionY() + ".");
        }
    }
    public void freeze(){
        this.frozen = true;
        System.out.println(this.name + " was frozen.");
    }
    public void unfreeze(){
        this.frozen = false;
        System.out.println(this.name + " was unfrozen");
    }

}
