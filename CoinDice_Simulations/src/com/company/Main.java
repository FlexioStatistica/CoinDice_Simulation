package com.company;
import java.util.Random;
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

*/


public class Main {
//Coin
    private int result;
    private int heads = 0;
    private int tails = 1;
// Dice


    //Coin Method
    public static int coinFlip(int number)
    {
        int num = 0;
        Random ranNum = new Random();
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


    public static void main(String[] args) {
	// write your code here
    }
}
