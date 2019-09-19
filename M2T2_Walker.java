/*
M2T2
Christian Walker
9/19/19
 */
package m2t2_walker;
import java.util.Scanner;

/**
//M2T2
//Christian Walker
//9/19/19
 * @author walkerc8941
 */
public class M2T2_Walker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask the user for name, hours worked, hourly pay rate
        // Display their gross pay
        
        //Declare variables
        Scanner keyboard = new Scanner(System.in);
        //Declare string name
        String name;
        //Declare real hourlyRate
        double hourlyRate;
        //Declare real hoursWorked
        double hoursWorked;
        //Declare real grossPay
        double grossPay;
        
        // Ask user their name
        // Display "What is your name?"
        System.out.println("What is your name? ");
        // Input name
        name = keyboard.nextLine();
        
        // Ask for hourlyRate
        //Display "How much do you get paid per hour?"
        System.out.println("How much do you get paid per hour?");
        //Input hourlyRate
        hourlyRate = keyboard.nextDouble();
        
        // Ask for hoursWorked 
        //Display "How many hours did you work?"
        System.out.println("How many hours did you work?");
        //Input hoursWorked
        hoursWorked = keyboard.nextDouble();
        
        //Calculate grossPay
        //Set grossPay = hourlyRate * hoursWorked
        grossPay = hourlyRate * hoursWorked;
        
        //Display name and grossPay
        //Display "(name), your paycheck is $(grossPay)."
        System.out.println(name + " your paycheck is $" + grossPay);
        
    }
    
}
