package com.alocoifindo.rockpaperscissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.SizeRequirements;

/**
 *
 * @author facundoferreyra
 */
public class gameConsole {

    static char userInput;
    static int compInput;

    static char compMovement;

    static int userScore;
    static int compScore;

    static public String namingMovement(char compMovement) {
        if (compMovement == 'r') {
                return "Rock";
        } if (compMovement == 'p') {
                return "Paper";
        } else {
                return "Scissors";
        }
    }

    static void win() {
        userScore++;
    }

    static void lose() {
        compScore++;
    }

    public static void winnerMeaning(char user, char comp) {
        if (user == 'r' && comp == 'r') {
            System.out.println("Rock and Rock! It's a draw.");
        } if (user == 'r' && comp == 'p') {
            System.out.println("The Rock is eaten by the Paper. You lose.");
            lose();
        } if (user == 'r' && comp == 's') {
            System.out.println("Rock beats Scissors! You win!");
            win();
        } if (user == 'p' && comp == 'r') {
            System.out.println("Paper eats the Rock! You win!");
            win();
        } if (user == 'p' && comp == 'p') {
            System.out.println("Paper and Paper! It's a draw.");
        } if (user == 'p' && comp == 's') {
            System.out.println("The Paper is cutted by the Scissors! You lose.");
            lose();
        } if (user == 's' && comp == 'r') {
            System.out.println("The Scissors is beated by the Rock. You lose.");
            lose();
        } if (user == 's' && comp == 'p') {
            System.out.println("Scissors cuts the Paper! You win!");
            win();
        } if (user == 's' && comp == 's') {
            System.out.println("Scissors and Scissors! It's a draw.");
        }
    }

    public static void main(String[] args) throws IOException {
        
        boolean gameValid = true;
        
        while (gameValid) {
            System.out.println("\nYou -> " + userScore + "  ―  " + compScore + " <- Comp ");

            System.out.println("Enter your movement: Rock - Paper - Scissors");

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String userMovementInput = br.readLine();

                if ("Rock".equalsIgnoreCase(userMovementInput) || "R".equalsIgnoreCase(userMovementInput)){
                    userInput = 'r';
                } else if ("Paper".equalsIgnoreCase(userMovementInput) || "P".equalsIgnoreCase(userMovementInput)) {
                    userInput = 'p';
                } else if ("Scissors".equalsIgnoreCase(userMovementInput) || "S".equalsIgnoreCase(userMovementInput)){
                    userInput = 's';
                } else if ("Stop".equalsIgnoreCase(userMovementInput) || "0".equals(userMovementInput)){
                    break;
                } else {
                    throw new Exception("This movement is not valid.");
                }
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }

        Random random = new Random();
        compInput = (int)(random.nextDouble() * 3);

        switch (compInput){
        case 0:
           compMovement = 'r';
           break;
        case 1:
            compMovement =  'p';
            break;
        case 2:
            compMovement =  's';
            break;
        }

        System.out.println("Machine does: " + namingMovement(compMovement));

        winnerMeaning(userInput,compMovement);

        }
    }
}