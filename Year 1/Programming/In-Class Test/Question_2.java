/*
 * Question-2 Solution
   */

public class Question_2     // class for specific pattern printing
{
    
    public static void main(String[]args){      // main method
        
        String pattern = "*";       // initializing pattern as '*'
        
        for(int i = 1; i <= 5; i++){        // looping statements
            
            // prints the value in pattern with a line break
            System.out.println(pattern + "\n");
            pattern = pattern + "*";        //concatenating pattern with '*'
        
        }   
    
    }
    
}
