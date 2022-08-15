/*
 * Concept of Hierarchical inheritance along with other java features has been use in this project.
 * This Course class is made the super class.
   */


// creating super class Course
public class Course {
    
    // declaring several instance variables marking them private 
    
    private String courseID;            
    private String courseName;
    private String courseLeader;
    private int duration;
    
    /* 
     * creating parameterized constructor of Course class
         */  
        
    Course(String courseID, String courseName, int duration) {    
        
        // initializing instance variables with parameter values
        
        this.courseID = courseID;   
        this.courseName = courseName;
        courseLeader = "";
        this.duration = duration;
        
    }

    /* creating public get method for courseID
       with String as return type
       */ 
    
    public String getcourseID() {
        return courseID;
    }

    /*  creating public get method for courseName
        with String as return type
       */
      
    public String getcourseName() {
        return courseName;
    }

    /*  creating public get method for courseLeader
        with String as return type
       */
      
    public String getcourseLeader() {
        return courseLeader;
    }

    /*  creating public get method for duration
        with String as return type
       */
      
    public int getduration() {
        return duration;
    }

    /*  creating public set method for courseLeader
        with no return type
       */
      
    public void setcourseLeader(String newLeader) {    
        this.courseLeader = newLeader;              // setting instance variable with value of parameter
    }

    /*  creating display method for printing
        specified results.
       */
      
    void display() {
        System.out.println("Course ID is :" + " " + courseID);
        System.out.println("Course Name is :" + " " + courseName);
        System.out.println("The Duration of Course is :" + " " + duration + "years");
        
        // if statement for checking courseLeader as non-empty
        
        if(courseLeader != ""){
        System.out.println("The new Course Leader is :" + " " + courseLeader);  // prints courseLeader for true condition
        }
        
    }
}    
