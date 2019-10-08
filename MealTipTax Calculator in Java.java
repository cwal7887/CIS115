/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3t2_walker;

/**
 *
 * @author walkerc8941
 */
import java.util.Scanner;
public class M3T2_Walker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Scanner keyboard = new Scanner(System.in);
        meal = getDouble("Enter price of the meal: $");
        taxAmount = calcTax(meal);
        tipAmount = calcTip(meal);
        fullMeal = displayReceipt(taxAmount, tipAmount, meal);
        
        
    }
    public static double getDouble(String prompt) {
         Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        double meal;
        meal = keyboard.nextDouble();
        return meal;   
            }
    public static double calcTax(double meal) {
        double taxPercent = 0.15;
        double taxAmount;
        taxAmount = taxPercent * meal;
        return taxAmount;
    }
    public static double calcTip(double meal) {
        double tipAmount;
        double tipPercent = 0.06;
        tipAmount = tipPercent * meal;
        return tipAmount;
    }
    public static double displayReceipt(double taxAmount, double tipAmount, double meal){
        double fullMeal;
        fullMeal = meal + tipAmount + taxAmount;
        System.out.println("-----------------------------------");
        System.out.println( "Tax: " + formatter.format(taxAmount) );
        System.out.println( "Tip: " + formatter.format(tipAmount) );
        System.out.println( "Grand Total : " + formatter.format(fullMeal) );
        return fullMeal;
        
    }
}
