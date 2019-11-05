package com.chrislewdev.game2048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        launchGame();
    }

    static void launchGame() {
        Scanner s = new Scanner(System.in);
        Game game = new Game();
        game.gameStartRandom();
        game.printCurrent();
        System.out.println("Game started, available actions:" + "\n" +
                "0: Show all available actions" + "\n" +
                "1. Move right" + "\n" +
                "2. Move left" + "\n" +
                "3. Move up" + "\n" +
                "4. Move down" + "\n" +
                "5. Shut down" + "\n");

        boolean quit = false;
        while (!quit) {

            switch (s.nextInt()) {
                case 0:
                    System.out.println("Available actions:" + "\n" +
                                    "0: Show all available actions" + "\n" +
                                    "1. Move right" + "\n" +
                                    "2. Move left" + "\n" +
                                    "3. Move up" + "\n" +
                                    "4. Move down" + "\n" +
                                    "5. Shut down" + "\n");
                    break;

                case 1:
                    System.out.println("Move right.");
                    game.moveRight();
                    game.generateNew();
                    game.printCurrent();
                    break;

                case 2:
                    System.out.println("Move left.");
                    game.moveLeft();
                    game.generateNew();
                    game.printCurrent();
                    break;

                case 3:
                    System.out.println("Move up.");
                    game.moveUp();
                    game.generateNew();
                    game.printCurrent();
                    break;

                case 4:
                    System.out.println("Move down.");
                    game.moveDown();
                    game.generateNew();
                    game.printCurrent();
                    break;

                case 5:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;

                default:
                    System.out.println("Please enter a valid action.");

            }
        }
    }
}
