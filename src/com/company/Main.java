package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece token = new GamePiece("token", "blue");
        System.out.println("player: "+ token.getName() );
        token.move();
        token.freeze();
        token.move();
        token.unfreeze();
        token.move();


    }
}
