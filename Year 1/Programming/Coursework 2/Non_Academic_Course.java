/*
 * This is another sub-class Non_Academic_Course which extends
 * the super class Course.
   */
  
// creating a sub-class Non_Academic_Course


public class Non_Academic_Course extends Course
{
  
  // declaring numerous instance variables with access modifier as 'private'
  
  private String instructorName;
  private String startDate;
  private String completionDate;
  private String examDate;
  private String prerequisite;
  private boolean isRegistered;
  private boolean isRemoved;
  
  /*
   * creating parameterized constructor of Non_Academic_Course class
     */
    
  Non_Academic_Course(String courseID, String courseName, int duration, String prerequisite){
      
      super(courseID,courseName,duration);  //calls the super class constructor with parameters
      
      this.prerequisite = prerequisite;     // assigns the value of instance variable with parameter's value
      
      startDate = "";
      completionDate = "";
      examDate = "";
      isRegistered = false;
      isRemoved = false;
      
  }
  
  /* creating public get method for instructorName
       with String as return type
       */
      
  public String getinstructorName(){
      return instructorName;  
  }
  
  /* creating public get method for startDate
       with String as return type
       */
      
  public String getstartDate(){
      return startDate;
  }
  
  /* creating public get method for completionDate
       with String as return type
       */
      
  public String getcompletionDate(){
      return completionDate;
  }
  
  /* creating public get method for examDate
       with String as return type
       */
      
  public String getexamDate(){
      return examDate;
  }
  
  /* creating public get method for prerequisite
       with String as return type
       */
  public String getprerequisite(){
      return prerequisite;
  }
  
  /* creating public get method for isRegistered
       with boolean as return type
       */
  public boolean getisRegistered(){
      return isRegistered;
  }
  
  /* creating public get method for isRemoved
       with boolean as return type
       */
      
  public boolean getisRemoved(){
      return isRemoved;
  }
  
  /*  creating public set method for instructorName
        with no return type
       */
      
  public void setinstructorName(String instructorName){
      
      // checks if the non-academic course is registered or not
      
      if(isRegistered != true){
          this.instructorName = instructorName;     //assigns value of parameter to the instance variable
      }
        
      else{ 
          // prints the course registration message
          
          System.out.println("Error: The Instuctor Name can't be changed because a Non-Academic Course already exists");    
      }
        
  }
  
  /*  
     * creating register method for registering 
         unregistered non-academic courses.
       */
      
  public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
      
      // registers only unregistered course otherwise display message indicating course is pre-registered
      
      if(isRegistered == false){
          super.setcourseLeader(courseLeader);      //calls the superclass method setcourseLeader with parameter
          setinstructorName(instructorName);        //calls the method setinstructorname within the same class
          
          
          //assigns value of parameters to the instance variables
          
          this.startDate = startDate;
          this.completionDate = completionDate;
          this.examDate = examDate;
          
          this.isRegistered = true;
                    
      }
      
      else{
          System.out.println("The Course you are trying to register is already entered.");
      }
      
  }
  
  /*
   * creating remove method to remove the outlisted non-academic course
     */
  public void remove(){
      
      //checks if the course is removed or not
      if(isRemoved == true){
          System.out.println("The Course is removed successfully");     //displays when condition is true
      }
      
      else{
          super.setcourseLeader("");        //calls the setcourseLeader method of super class with empty string
          
          //assigns empty string for all instance variables
          
          this.instructorName = "";
          this.startDate = "";
          this.completionDate = "";
          this.examDate = "";
          
          this.isRegistered = false;
          this.isRemoved = true;
          
      }
      
  }
  
  /*
   * creating a display method for giving necessary output
     */
    
  void display(){
      super.display();      // calls the super class display method
      
      //displays the output after checking the registration of the course
      if(isRegistered == true){
          System.out.println("Name of the Instructor: " + instructorName);
          System.out.println("The date for it's start is: " + startDate);
          System.out.println("The date for course completion is: " + completionDate);
          System.out.println("The exact date for exam is: " + examDate);
      }
  }
  
}
