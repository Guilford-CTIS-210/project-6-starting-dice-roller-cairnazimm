package edu.guilford;

//Cairna Zimmerman 
//09.19.2024

import java.util.Random; // import for random class
import java.util.Scanner; // import for scanner class
public class Main {
    public static void main(String[] args) {
        Random random = new Random(); //create random objects
        Scanner scan = new Scanner(System.in); // create scanner objects

        // prints wlecome message
        System.out.println("You are going to be rolling 10 dice.");
        
        // asks for number of sides
        System.out.println("How many sides should your dice have?");
        int sides = scan.nextInt();

        // asks for number dice
        System.out.println("How many dice do you want to roll?");
        int number = scan.nextInt();

        int sum = 0; // math for sum of rolls

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) {

            int diceRoll = random.nextInt(sides) + 1; // rolls the dice (1 to sides)
            sum += diceRoll; // add to sum
            
            //System.out.println("sum of " + i + "d" + sides + " = " + sum);
            System.out.println(number + "d" + sides + "=" + sum);
        }
        scan.close(); // close scanner
    }
}