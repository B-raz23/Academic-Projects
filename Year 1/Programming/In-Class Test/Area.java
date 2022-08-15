/*
 * Question-5 Solution part-b
   */
  
public class Area extends Shape          //creating a concrete class area which extends shape 
{
    
    // over-riding the RectangleArea method of the abstract class
    public void RectangleArea(int length, int breadth){     
        
        int area = length * breadth;        // calculating area
        System.out.println("The area of rectangle is: " + area);        // printing the area
        
    }
    
    // over-riding the SquareArea method of the abstract class
    public void SquareArea(int side){
    
        int area = side * side;         // calculating area
        System.out.println("The area of square is: " + area);           // printing the area
    
    }
    
    // over-riding the CircleArea method of the abstract class
    public void CircleArea(int radius){
    
        double area = 3.142 * (radius * radius);        // calculating area
        System.out.println("The area of circle is: " + area);           // printing the area
    
    }
    
    public static void main(String[]args){      //main method
        
        // creating an object of area class
        Shape obj = new Area();
        
        // calling all the methods with certain values
        obj.RectangleArea(23, 11);
        obj.SquareArea(37);
        obj.CircleArea(22);
        
    }
    
}
