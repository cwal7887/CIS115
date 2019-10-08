/*
M3T2
Christian Walker
10/3/2019
Tax and Tip Calculator
A program that calculates the total amount
of a meal purchased at a restaurant
 */
package m3t1_walker;

/**
 *
 * @author walkerc8941
 */
import java.util.Scanner;
public class M3T1_Walker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////Intro
        //Display how to use calculator
        //Declare variables
        Scanner keyboard = new Scanner(System.in);
        //Declare Real meal
        double meal;
        //Declare Real taxPercent
        double taxPercent;
        //Declare Real taxAmount
        double taxAmount;
        //Declare Real tipPercent
        double tipPercent;
        //Declare Real tipAmount
        double tipAmount;
        //Declare Real fullMeal
        double fullMeal;

        ////Ask user to enter the charge for food
        //Display "Enter price of the meal: $"
        System.out.println("Enter price of the meal");
        //Input variable meal
        meal = keyboard.nextDouble();        
        ////Calculate tip
        //tipAmount = meal * tipPercent
        tipPercent = 0.06;
        tipAmount = meal * tipPercent;        
        ////Calculate tax
        //taxAmount = meal * taxPercent
        taxPercent = 0.15;
        taxAmount = meal * taxPercent;
        ////Calculate full price
        //fullMeal = meal + taxAmount + tipAmount
        fullMeal = meal + taxAmount + tipAmount;
        ////Display cost of meal
        //Display "Your food cost: $" + "meal"
        System.out.println("Your food cost: $" + meal);
        ////Display tax amount
        //Display "Your tax amount is: $" + taxAmount
        System.out.println("Your tax amount is: $" + taxAmount);
        ////Display tip amount
        //Display "Your tip amount is: $" + tipAmount
        System.out.println("Your tip amount is: $" + tipAmount);
        ////Display full price
        //Display "Your grand total is: $" + fullMeal
        System.out.println("Your grand total is: $" + fullMeal);
    }
    
}
