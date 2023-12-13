package com.SimonGForsgren.oop.Logic;
import java.util.Scanner;
import com.SimonGForsgren.oop.Entities.Player;
import com.SimonGForsgren.oop.Entities.Status;

public class BasicLogic {
    public static boolean isRunning; //while True, game will run
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static void startGame() {
        isRunning = true; // Setting game running to true so the game runs
        System.out.println("Welcome, what is your name?");
        String name = scanner.next();
        player = new Player(name);
        System.out.println("Your name is " + name + "... You venture into the catacombs");
        gameLoop(); //Start the main loop
    }







    public static void PlayerDied(Player player){ //TODO create the player died method
        isRunning = false;                //IDK how necessary player player is in parentheses
        // but whatever 👍
    }



    public static void printMenu() {   //Method for printing the options in Main menu of game loop
        System.out.println("Choose an action");
        System.out.println("(1) FIGHT!");       //option 1 to Fight an enemy
        System.out.println("(2) STATUS");       //option 2 to Check player status
        System.out.println("(3) QUIT GAME");    //option 3 to Exit the game
    }

    public static void gameLoop(){ //Continuing on printMenu this is where the methods are
        Scanner scanner = new Scanner(System.in);

        while(isRunning){
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    //TODO Add fight logic here
                    //TODO InCombat
                    break;
                case 2:
                    Status.displayPlayerStatus(player);
                    break;
                case 3:
                    System.out.println("You were unable to persevere, game over");
                    isRunning = false;  //Exits game
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    //If none of the options above are chosen 1,2 or 3, then this is what happens
            }
        }
        scanner.close();
    }
}