/*
 * Question-1 Solution
   */

// importing scanner class of util package for user input
import java.util.Scanner;

public class Question_1     // creating a class
{
    
    public static void main(String[]args){      // main method
        
        while(true){    // looping statement
            
            try{        // try block for certain needed operations
                
                Scanner input = new Scanner(System.in);     //instanciating the scanner class 
                System.out.print("Enter the number of units consumed: ");       // printing a input message
                int units = input.nextInt();        // stores the user input in units
                
                int min_charge = 100;       // initializing minimum charge
                int amount;     //declaring amount variable
                
                // checking the entered units and calculating the amount charged
                
                if(units <= 10){        //for units less than 10
                
                    amount = min_charge;
                
                }
                
                else if(units > 10 && units <= 50){     // for units 11-50
                    
                    int extra = units - 10;
                    amount = min_charge + extra * 5;
                
                }
                
                else if(units > 50 && units <= 200){        // for units 51-200
                    
                    int extra = units - 50; 
                    amount = min_charge + (40 * 5) + (extra * 10);
                
                }
                
                else if(units > 200 && units <= 500){       // for units 201-500
                
                    int extra = units - 200;
                    amount = min_charge + (40 * 5) + (150 * 10) + (extra * 15);
                
                }
                
                else{       // for units more than 500
                    
                    int extra = units - 500;
                    amount = min_charge + (40 * 5) + (150 * 10) + (300 * 15) + (extra * 20);
                
                }
                
                // prints the amount charged
                System.out.println("The total amount charged is:  Rs " + amount);
                break;      // terminates the loop
                
            }
            
            catch(Exception ex){        // in case any exceptions occur 
                
                // prints an invalid message
                System.out.println("\n Invalid input provided !!! \n");
                
            }
        
        }
    }   
    
}
