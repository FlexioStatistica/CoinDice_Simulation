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
    public static int coinFlip(int numberFlip, int trialsFlip)
    {
        int n = numberFlip;
        int num = 0;
        int counterTails = 0;
        int counterHeads = 0;
        Random ranNum = new Random(n);
        int flipChance = ranNum.n;


        for(int i=1; i<= trialsFlip;i++)
        {

            if()
            {
                counterHeads++;
                this.heads = counterHeads;
            }
            else
            {
                //count tails
                counterTails++;
                this.tails = counterTails;
            }
            // Note values returns are sent to publ;ioc static values.
        }

        return num;
    }

    //Dice Method
    public static int dice(int number, int face)
    {

        Random ranNum = new Random(n);
        // This array list is meant to hold all new counter-objects populated based on how many faces this dice will have.
        ArrayList<Integer> countFaces = new ArrayList<Integer>(n);
        //TODO: This n-sided dice has to account for an unknown number of sides. Review recursion methods from intro to data structures textbook.

        int resultDice = 0;
        if(face >2)
        {
            for(int i; i < this.n; i++)
            {
                new counter[i];
                countFaces.add(new counter[i]);
            }
        }
        else
        {
            System.out.println("The number of faces for this die is 2 or less. Try Coin toss method. Exit. ");
        }

        return resultDice;
    }

    /*
    Experimental Recursion method

    The goal is to creat a recursion method to callk itself. The dice method would call this, create a series of face n-sded dicem,
    matchign respective counter per each side, toss the die, and recult the results.

     */

    public static int counterRecursion(int n)
    {
        this.n = face;
        //toss die
        //record results with a ounter

        int counter = 0;



    }




    public static void main(String[] args)
    {
        System.out.println("Welcome to the Coin-Dice Simulation.");
        System.out.println();
        System.out.println("Please enter the number of faces for this fair die simulation.");
        System.out.println("[Note: A value of 2 would be considered a coin. less tha one will not be considered.");

        Scanner faceNumber = new Scanner(System.in);
        face = faceNumber.nextInt();
        //TODO: write in code in case value entered is whole a whole interger. There should be a fail-safe here. Recall the while loop.

        System.out.println();
        System.out.println("Recognized: " + face + "for this face-value." );
        System.out.println("Please enter the number of trials for this simulation.");

        Scanner trialsInput = new Scanner(System.in);
        trials = trialsInput.nextInt();

        System.out.println("Recognized: " + trials + "for this trial-value." );
        System.out.println();

        //TODO: Write series of if-else conditions to move to coin flipping, dice rolling, or other here.

        if(face = 2)
        {
            //Call coinFlip Method
            System.out.println("Here are the results of this Coin simulation.");
            System.out.println("Coin Simulation");
            System.out.println();
            System.out.println("Number of Trials: ");
            System.out.println("Head Proportion: ");
            System.out.println("Tail Proportion: ");
        }
        else if(face >= 2 )
        {

            //TODO add the method for a multi face dice simulation
            System.out.println("Here are the results of this " + numberFace + "-sided Dice simulation.");
        }
        else
        {
            System.out.println("Value Error. Check Code. Terminating Code.");
            exit();
        }

	// write your code here
    // TODO: Consider pulling some discrete probability distributions simulations as well.
    }
}
