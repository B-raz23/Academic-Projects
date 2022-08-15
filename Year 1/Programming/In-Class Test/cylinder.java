/*
 * Question-3 Solution
   */
  
public class cylinder   // creating a class
{

    private int radius, height;     //declaring variables as private 
    
    cylinder(){         // constructor for cylinder class
        
        // initializing the instance variables
        this.radius = 10;       
        this.height = 10;
        
    }
    
    public void cylinder_volume(){      // method for computing volume
        
        // storing the obtained result in volume
        double volume = 3.142 * (radius * radius * height);  
        
        // printing out the result
        System.out.println("The volume of cylinder is: " + volume);
        
    }
  
    public int getradius(){     // getter method for radius with int return type
        
        return radius;
        
    }
    
    public int getheight(){     // getter method for height with int return type
    
        return height;
    
    }
    
    public void setradius(int radius){      // setter method for radius 
        
        if(radius > 0){     //checking for positive input
        
            this.radius = radius;       // executes if condition is true
        
        }
        
        else{
            
            // prints error for invalid input
            System.out.println("Provide a positive value !!");
        
        }
    
    }
    
    public void setheight(int height){      // setter method for height 
    
        if(height > 0){     //checking for positive input
        
            this.height = height;       // executes if condition is true
        
        }
        
        else{
            
            // prints error for invalid input
            System.out.println("Provide a positive value !!");
        
        }
        
    }
    
}