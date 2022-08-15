/*
 * This is sub class Academic_Course which extends
 * every properties of Course class.
   */
  
// creating a sub-class Academic_Course

public class Academic_Course extends Course
{
    /* declaring different instance variables with compatible
       data types.
       */
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int number_of_Assessments;
    private boolean isRegistered;
    
    /*
     * creating parameterized constructor for Academic_Course class
        */
       
    Academic_Course(String courseID, String courseName, int duration, String level, String credit, int number_of_Assessments) {
        
        super(courseID, courseName, duration);      // calls the super class constructor with parameters
        
        
        // assigning values of parameters to instance variables
        
        this.level = level;
        this.credit = credit;
        this.number_of_Assessments = number_of_Assessments;
        
        lecturerName = "";
        startingDate = "";
        completionDate = "";
        isRegistered = false;
    }
    
    /* creating public get method for lecturerName
       with String as return type
       */
      
    public String getlecturerName() {
        return lecturerName;
    }
    
    /* creating public get method for level
       with String as return type
       */
      
    public String getlevel() {
        return level;
    }
    
    /* creating public get method for credit
       with String as return type
       */
      
    public String getcredit(){
        return credit;
    }
    
    /* creating public get method for startingDate
       with String as return type
       */
      
    public String getstartingDate(){
        return startingDate;
    }
    
    /* creating public get method for completionDate
       with String as return type
       */
      
    public String getcompletionDate(){
        return completionDate;
    }
    
    /* creating public get method for number_of_Assessments
       with integer as return type
       */
      
    public int getnumber_of_Assessments(){
        return number_of_Assessments;
    }
    
    /* creating public get method for isRegistered
       with boolean as return type
       */
      
    public boolean getisRegistered(){
        return isRegistered;
    }
    
    /*  creating public set method for lecturerName
        with no return type
       */
      
    public void setlecturerName(String newLecturer){
        this.lecturerName = newLecturer;    // setting instance variable with value of parameter
    } 
    
    /*  creating public set method for number_of_Assessments
        with no return type
       */
      
    public void setnumber_of_Assessments(int newNumber){
        this.number_of_Assessments = newNumber;     // sets value of parameter to instance variable 
    }
    
    /*  
     * creating register method for registering 
         unregistered courses.
       */
      
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
        
        // checks the registered status of academic course
        if(isRegistered == true){
            
            // executes this statements for true condition
            
            System.out.println("The Academic Course is already registered with");
            System.out.println("Lecturer Name: " + lecturerName);
            System.out.println("Starting Date: " + startingDate);
            System.out.println("Completion Date: " + completionDate);
        
        }
        
        else{
            
            super.setcourseLeader(courseLeader);    // calls setcourseLeader method of superclass with parameter
            
            // assigns the values of parameter to the instance variables
            
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            
            this.isRegistered = true;
            
        }
                  
    }
    
    /*
     * creating display method that prints the desirable output.
       */
    void display(){
         super.display();   // calls the superclass display methhod
         
         // checks the registered status and operates when condition is true
         if(isRegistered == true){
             
             System.out.println("The Lecturer name is: " + lecturerName);
             System.out.println("Level of the Course is: " + level);
             System.out.println("Credit time for the course is: " + credit);
             System.out.println("It's Starting Date is: " + startingDate);
             System.out.println("It's Ending Date is: " + completionDate);
             System.out.println("The number of assessments in this course is: " + number_of_Assessments);
             
         }
         
    }
    
}