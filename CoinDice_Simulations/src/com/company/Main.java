package com.company;
import java.util.Random;
import java.util.Scanner;

/*
Coin Flipping and Dice tossing Simulation Experiment.


The goal of this Coin flipping and Dice Tossing Simulation is to test a personal probability theory.
In an formal applied math probability course, if a fair two sided die is tossed, there is a 50% chance to get a face,
 and a 50% percent to get tails. Yet, as the number of actual tosses are noted,
 their results will reach a 50-50 even spread as the number of tossed trials increases indefinitely.

 I pose the following coding simulation: if a fair simulated 2 sided coin is tossed, the noted results comes to an even 50-50 spread.
 If one were to creat a multi-faced die from 3 sides and above, should the spread be proportionally spread evenly as well?
 The number of trials of increases, the results should approach an even spread across the board.

 For example, a fair 10-sided die would have an even statistical results for each side of approximately 10% for each side.

website referece: https://www.tutorialspoint.com/java-program-to-toss-a-coin

*/

//testing changes in code


public class Main {

    public static int trials = 0;
    public static int numberFace = 0;
    //Coin
    private int result;
    private int heads = 0;
    private int tails = 1;
    public static int face= 0;
    // Dice


    //Coin Method
    public static int coinFlip(int number)
    {
        int n = numberFace;
        int num = 0;
        Random ranNum = new Random(n);
        int flipChance = ranNum.n;
        

        for(int i=1; i<= trials;i++)
        {
            if()
            {}
            else
            {
                //count tails

            }
        }

        return num;
    }

    //Dice Method
    public static int dice(int number, int face)
    {
        int resultDice = 0;
        if(face >2)
        {
            for()
        }
        else
        {
            System.out.println("The number of faces for this die is 2 or less. Try Coin toss method. Exit. ");
        }

        return resultDice;
    }


    public static void main(String[] args)
    {
        System.out.println("Welcome to the Coin-Dice Simulation.");
        System.out.println();
        System.out.println("Please enter the number of faces for this fair die simulation.");
        System.out.println("[Note: A value of 2 would be considered a coin. less tha one will not be considered.");

        Scanner faceNumber = new Scanner(System.in);
        face = faceNumber.nextInt();
        //TODO: write in code in case value entered is whole a whole interger. There should be a fail-safe here.

        System.out.println();
        System.out.println("Recognized: " + face + "for this face-value." );
        System.out.println("Please enter the number of trials for this simulation.");

        Scanner trialsInput = new Scanner(System.in);
        trials = trialsInput.nextInt();

        System.out.println("Recognized: " + trials + "for this trial-value." );
        System.out.println();

        //TODO: Write series of if-else conditions to move to coin flipping, dice rolling, or other here.



        System.out.println("Here are the results of this simulation.");
        System.out.println("Coin Simulation");
        System.out.println();
        System.out.println("Number of Trials: ");
        System.out.println("Head Proportion: ");
        System.out.println("Tail Proportion: ");
	// write your code here
    }
}
