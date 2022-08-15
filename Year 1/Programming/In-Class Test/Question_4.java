/*
 * Question-4 Solution
   */
  
public class Question_4     // creating a class
{
    
    public static int isFilter(int arr[]){      //defining a function with a parameter for filtering given array
        
        int filter = 1;     //initializing filter as 1
        
        for(int x = 0; x < arr.length; x++){        // loop for traversing through the array
            
            if(arr[x] == 9){    // checks for '9' in the array
                
                // executes on satisfaction
                for(int y = 0; y < arr.length; y++){    //again traversing through the same array
                
                    if(arr[y] == 11){   // checks for '11' in the array
                    
                        filter = 1;     //updates filter value
                        break;      //terminates the inside loop
                    
                    }
                    
                    else{       // if not 11
                    
                        filter = 0;
                    
                    }
                
                }
                
            }
            
            if(arr[x] == 7){    // now checks for '7' in the array
                
                // if found
                for(int z = 0; z < arr.length; z++){        // traverse through array again
                
                    if(arr[z] == 13){   // checks for 13 in the array
                    
                        filter = 0;         // updates the filter
                        break;      //terminates the inner loop
                        
                    }
                
                }  
                
                break;  //terminates the outer loop
                
            }
            
        }
    
        return filter;          // returns the final value in filter
        
    }
    
}
