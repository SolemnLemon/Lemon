/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs212hw00-Cummings;

import java.util.Random;
import java.util.Scanner;
import java.util.Objects;

/**
 *
 * @author sunbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // TODO code application logic here
        String[] menu = new String[3];
        menu[0] = "shrimp";
        menu[1] = "tacos";
        menu[2] = "sushi";

        String mealChosen = menu[rand.nextInt(3)];
        System.out.println("The secret meal must be chosen");

        String duplicateDetect = null;

        while (true) {
            String mealGuessed = scan.nextLine();
            if (Objects.equals(mealGuessed, mealChosen)) {
                System.out.println("Correct! Enjoy your " + mealChosen);
                break;
            } else {
                System.out.println("Nope!");
                if (Objects.equals(mealGuessed, duplicateDetect)) {
                    System.out.print(" You guessed that already! You lose.");
                    break;
                }

                duplicateDetect = mealGuessed;
            }
        }
    }
}
