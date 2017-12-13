package gamesimulation;

import java.util.Random; //utility for generating random numbers

/**
 * * @author Agata Jelen CSD 141 Fall 2017
 * 
 * Algorithm Notes: for this assignment
 * Started with the random number generator for rolling the dice with the random range between 1-6 (for the face sides of the dice). 
 * Variables declared and start a for loop for the game. 
 */
public class GameSimulation {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
   //Random Number method implemented for dice roll
    Random rand=new Random();
   
    //int declared for index for loop 
    int i;
    //accumulator total for total wins
    int totalWins=0;
    //accumulator total for total loses
    int totalLosses=0;
    //int variable point declared for craps game 
    int point = 0;
    //accumulator total for total games played (based on wins + losses, not total dice rolls)
    int totalGames=(totalWins+totalLosses);

   //for loop started for rolling the dice with the condition to stop once total games is at 10000. (As 0 is the first game, the outcome of the 0 game will be the first game played, at <=10,000, the game would actually be played 10,001 times. i is the number of times the dice is rolled.
   for(i=0;totalGames<10000;i++)
   {//int declaration for dice1 with random number generated between 1-6
       int dice1= rand.nextInt(6)+1;
       //int declaration for dice2 with random number generated between 1-6
       int dice2=rand.nextInt(6)+1;
       //int diceTotal declared with calculation
       int diceTotal=dice1+dice2;
    
/* Original Script for the first few rolls (for debugging):
System.out.printf("Game #"+totalGames+": Roll #:"+i+" dice #1 is: %d, dice #2 is: %d, roll total is: %d\n",dice1,dice2,diceTotal); */  

    //if statement for the first roll
    if(i==0)
    {//if statement for if the dice total 2,3 or 12 on the first roll
       if((diceTotal==2)||(diceTotal==3)||(diceTotal==12))
        {//totalLosses increased by 1
            ++totalLosses;
            //total games increased by 1
            ++totalGames;}
    
        //else statement for if the dice total 7 or 11 on first roll
        else if((diceTotal==7)||(diceTotal==11))
               {//totalWins increased by 1
                ++totalWins;
                //total games increased by 1
                ++totalGames;}
        //else statement for if the dice total 4,5,6,7,8,9 or 10 on first roll for point
        else
           {//point declared if dice total !=2,3,7,11 or 12
           point=diceTotal;}}

    //else if statement added if points remain at 0 (no point aquired for first roll)
    else if(point==0)
       {//if dice total = 4,5,6,8,9 or 10 point=diceTotal
           if((diceTotal==4)||(diceTotal==5)||(diceTotal==6)||(diceTotal==8)||(diceTotal==9)||(diceTotal==10)) 
            {//value assigned to point
                point=diceTotal;}}

    //else statement added for all additional rolls
    else
    {//if statement for if the dice total is equal to the point
        if(diceTotal==point)
        {//totalWins increased by 1
            ++totalWins;
         //totalGames increased by 1
            ++totalGames;}
        
        //else if statement for if diceTotal is 7    
        else if(diceTotal==7)
        {//totalLosses increased by 1
            ++totalLosses;
         // totalGames increased by 1
            ++totalGames;}}
    }
   
//double var winningProbability declared with a muliplier of 1.0 to turn the int values to double
double winningProbability=((totalWins)/(totalWins+totalLosses*1.0));
//additional double variable added to calculate the winning percentage
double winningPercentage=(winningProbability*100.0);

//Output for the Games Played, Point Value, Total Wins, Total Losses, Winning Probability and formated winningPercentage
System.out.printf("Games Played:%,d\nPoint is: %,d\nTotal wins: %,d\nTotal losses:%,d\nWinning Probability:%.4f\nWinning Probability (Percent):%.2f%%\n",totalGames,point,totalWins,totalLosses,winningProbability,winningPercentage); }
}
