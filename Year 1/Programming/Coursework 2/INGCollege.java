/* 
 * This is the class meant for creating a GUI interface for the ease of user interaction.
 * 
    */
 

//importing several classes within the java in-built packages for several purposes

import javax.swing.*;          
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;         

// creating INGCollege class that implements the ActionListener interface

public class INGCollege implements ActionListener
{
    
    // Declaring private instance variables for GUI components
    
    private JFrame frame;   // for JFrame
    
    private JPanel academic_Course, non_academic_Course;    // for panels
    
    private JMenuBar menu_bar;      // for menu bar
    private JMenu menu_1, menu_2, menu_3;   // for menu's
    private JMenu menu_2_1, menu_2_2;       // for sub-menu's
    private JMenuItem item_1, item_2, item_3, item_4, item_5, item_6;   //for menu items
    
    private JLabel acad, non_acad;      // label for title of panel
    
    // declaring labels for academic_Course and non_academic_Course panels respectively
    private JLabel courseID, courseName, duration, level, credit, number_of_Assessments, courseLeader, lecturerName, startingDate, completionDate;          
    private JLabel course_ID, course_Name, dura_tion, prerequisite, course_Leader, instructorName, startDate, completion_Date, examDate;
    
    // declaring labels for academic_Course and non_academic_Course panels respectively
    private JTextField tfCourseID, tfCourseName, tfDuration, tfLevel, tfCredit, tfNumberOfAssessment, tfCourseLeader, tfLecturerName, tfStartingDate, tfCompletionDate;
    private JTextField tf_CourseID, tf_CourseName, tf_Duration, tf_Prerequisite, tf_CourseLeader, tf_InstructorName, tf_StartDate, tf_CompletionDate, tf_ExamDate;
    
    // declaring buttons for academic_Course and non_academic_Course panels respectively
    private JButton btnAdd, btnRegister, btnDisplay, btnClear;
    private JButton btn_Add, btn_Register, btn_Remove, btn_Display, btn_Clear;
    
    // creating an arraylist of Course class type
    ArrayList<Course> courseList = new ArrayList<Course>();
     
    // creatong objects of classes
    Course acad_obj, non_acad_obj;
    
    // creating a non-parameterized constructor for INGCollege class 
    INGCollege(){
        
        frame = new JFrame("Add/Register Courses");     // initializing Jframe
        frame.setLayout(null);              // setting layout as null
        
        menu_bar = new JMenuBar();          // initializing JMenuBar
        menu_bar.setBounds(0, 2, 700, 30);      // giving actual position for the menu bar
        frame.add(menu_bar);                //adding menubar to the frame
        
        // initializing JMenu's
        menu_1 = new JMenu("New Form");
            item_1 = new JMenuItem("Academic Course");     
            item_2 = new JMenuItem("Non-Academic Course");
        menu_1.add(item_1);
        menu_1.add(item_2);
        
        // adding actionlistener for menu items
        item_1.addActionListener(this);
        item_2.addActionListener(this);
        
        menu_2 = new JMenu("About");
        
        menu_2_1 = new JMenu("Used tools");
            //initializing menu items
            item_3 = new JMenuItem("Java JDK");
            item_4 = new JMenuItem("BlueJ");
        
        // adding menu items to the sub menu
        menu_2_1.add(item_3);
        menu_2_1.add(item_4);
        
        //initializing sub menu's
        menu_2_2 = new JMenu("Owner");
            item_5 = new JMenuItem("Biraj Sapkota");
        menu_2_2.add(item_5);
        
        // adding sub-menu's to menu
        menu_2.add(menu_2_1);
        menu_2.add(menu_2_2);
        
        menu_3 = new JMenu("Exit");
            item_6 = new JMenuItem("Close");
        menu_3.add(item_6);
        
        // adding menu's to the menu bar
        menu_bar.add(menu_1);
        menu_bar.add(menu_2);
        menu_bar.add(menu_3);
        
        item_6.addActionListener(this);
        
        // initializing academic_Course panel
        academic_Course = new JPanel();
        academic_Course.setLayout(null);        // setting layout as null
        academic_Course.setBounds(0, 35, 700, 425);         // actual positioning of panel
        academic_Course.setBackground(new Color(245, 224, 184));            // setting a background color for panel
        
        // initializing heading label for academic_Course panel
        acad = new JLabel("Academic Course");
        acad.setFont(new Font("Algerian", Font.PLAIN, 26));         // setting a new font for the heading label
        acad.setBounds(225, 20, 270, 25);           // defining actual position
        academic_Course.add(acad);              // adding the label to the panel
        
        
        /* 
         * initializing different labels and text fields that are required for academic_Course panel
         * using the concept of actual positioning using setBounds
         * finally, adding each gui components in academic_Course panel
        */
       
        courseID = new JLabel("Course ID");         
        courseID.setBounds(25, 85, 80, 20);         // for course ID
        academic_Course.add(courseID);
        
            tfCourseID = new JTextField();
            tfCourseID.setBounds(100, 85, 110, 20);     // text field for courseID
            academic_Course.add(tfCourseID);
        
        courseName = new JLabel("Course Name");
        courseName.setBounds(230, 85, 90, 20);          // for course name
        academic_Course.add(courseName);
        
            tfCourseName = new JTextField();
            tfCourseName.setBounds(320, 85, 200, 20);       // textfield for course name
            academic_Course.add(tfCourseName);
        
        duration = new JLabel("Duration");
        duration.setBounds(540, 85, 50, 20);            // for duration
        academic_Course.add(duration);
        
            tfDuration = new JTextField();
            tfDuration.setBounds(600, 85, 50, 20);      // textfield for duration
            academic_Course.add(tfDuration);
        
        level = new JLabel("Level");
        level.setBounds(37, 130, 35, 20);               // for level
        academic_Course.add(level);
        
            tfLevel = new JTextField();
            tfLevel.setBounds(100, 130, 70, 20);            // textfield for level
            academic_Course.add(tfLevel);
            
        credit = new JLabel("Credit");
        credit.setBounds(230, 130, 40, 20);             // for credit
        academic_Course.add(credit);
        
            tfCredit = new JTextField();
            tfCredit.setBounds(280, 130, 90, 20);           // textfield for credit
            academic_Course.add(tfCredit);
            
        number_of_Assessments = new JLabel("No. of Assessments");
        number_of_Assessments.setBounds(430, 130, 150, 20);             // for no. of assessment
        academic_Course.add(number_of_Assessments);
        
            tfNumberOfAssessment = new JTextField();
            tfNumberOfAssessment.setBounds(563, 130, 87, 20);           // textfield for no. of assessment
            academic_Course.add(tfNumberOfAssessment);    
        
        // initializing add button for academic_Course panel
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(300, 180, 90, 25);     // actual positioning
        academic_Course.add(btnAdd);            // adding the button to the panel
        btnAdd.addActionListener(this);     // adding action listener
        
        courseLeader = new JLabel("Course Leader");
        courseLeader.setBounds(25, 250, 120, 20);           // for courseleader
        academic_Course.add(courseLeader);
        
            tfCourseLeader = new JTextField();
            tfCourseLeader.setBounds(130, 250, 165, 20);        // textfield for course leader
            academic_Course.add(tfCourseLeader);
            
        lecturerName = new JLabel("Lecturer Name");
        lecturerName.setBounds(380, 250, 120, 20);          // for lecturer name
        academic_Course.add(lecturerName);
        
            tfLecturerName = new JTextField();
            tfLecturerName.setBounds(485, 250, 165, 20);            // textfield for lecturer name
            academic_Course.add(tfLecturerName);
      
        startingDate = new JLabel("Starting Date");
        startingDate.setBounds(25, 295, 120, 20);               // for starting date
        academic_Course.add(startingDate);
        
            tfStartingDate = new JTextField();
            tfStartingDate.setBounds(130, 295, 130, 20);        // textfield for starting date
            academic_Course.add(tfStartingDate);
            
        completionDate = new JLabel("Completion Date");
        completionDate.setBounds(380, 295, 120, 20);                // for completion date
        academic_Course.add(completionDate);
        
            tfCompletionDate = new JTextField();
            tfCompletionDate.setBounds(485, 295, 130, 20);              //textfield for completion date
            academic_Course.add(tfCompletionDate);
        
        // initializing register button
        btnRegister = new JButton("Register");
        btnRegister.setBounds(40, 352, 90, 25);     // giving actual position
        academic_Course.add(btnRegister);           // adding the button to the panel
        btnRegister.addActionListener(this);            // adding actionlistener
        
        // initializing clear button
        btnClear = new JButton("Clear");
        btnClear.setBounds(450, 352, 90, 25);       // actual position
        academic_Course.add(btnClear);          // adding button for academic course panel
        btnClear.addActionListener(this);           // adding actionlistener
        
        // initializing display button
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(550, 352, 90, 25);     // actual positioning
        academic_Course.add(btnDisplay);            // adding to panel
        btnDisplay.addActionListener(this);             // adding action listener
            
        // adding the academic_Course panel to the frame
        frame.add(academic_Course);
        
        // initializing non_academic_Course panel
        non_academic_Course = new JPanel();
        non_academic_Course.setLayout(null);            // setting layout manager as null
        non_academic_Course.setBounds(0, 35, 700, 425);     //actual positioning 
        non_academic_Course.setBackground(new Color(245, 224, 184));            // setting a background for the panel
        
        /* 
         * initializing different labels and text fields that are required for academic_Course panel
         * using the concept of actual positioning using setBounds
         * finally, adding each gui components in academic_Course panel
        */
       
        non_acad = new JLabel("Non-Academic Course");           // for heading label
        non_acad.setFont(new Font("Algerian", Font.PLAIN, 26));     // setting a new font for the heading label
        non_acad.setBounds(211, 20, 290, 25);
        non_academic_Course.add(non_acad);
        
        course_ID = new JLabel("Course ID");
        course_ID.setBounds(25, 85, 80, 20);            // for course ID
        non_academic_Course.add(course_ID);
        
            tf_CourseID = new JTextField();
            tf_CourseID.setBounds(100, 85, 150, 20);        // course ID textfield
            non_academic_Course.add(tf_CourseID);
        
        course_Name = new JLabel("Course Name");
        course_Name.setBounds(350, 85, 90, 20);         // course Name
        non_academic_Course.add(course_Name);
        
            tf_CourseName = new JTextField();
            tf_CourseName.setBounds(450, 85, 200, 20);      // course name textfield
            non_academic_Course.add(tf_CourseName);
        
        dura_tion = new JLabel("Duration");
        dura_tion.setBounds(30, 130, 50, 20);           // duration
        non_academic_Course.add(dura_tion);
        
            tf_Duration = new JTextField();
            tf_Duration.setBounds(100, 130, 100, 20);           // duration textfield
            non_academic_Course.add(tf_Duration);
        
        prerequisite = new JLabel("Prerequisites");
        prerequisite.setBounds(350, 130, 80, 20);           //for prerequisites
        non_academic_Course.add(prerequisite);
        
            tf_Prerequisite = new JTextField();
            tf_Prerequisite.setBounds(450, 130, 165, 20);           // prerequisites textfield
            non_academic_Course.add(tf_Prerequisite);
        
        // initializing register button
        btn_Add = new JButton("ADD");
        btn_Add.setBounds(300, 180, 90, 25);            // setting actual position
        non_academic_Course.add(btn_Add);           // adding button in the panel
        btn_Add.addActionListener(this);                // adding action listener
        
        course_Leader = new JLabel("Course Leader");
        course_Leader.setBounds(25, 250, 120, 20);          // for course leader
        non_academic_Course.add(course_Leader);
        
            tf_CourseLeader = new JTextField();
            tf_CourseLeader.setBounds(130, 250, 165, 20);           // text field for course leader
            non_academic_Course.add(tf_CourseLeader);
            
        instructorName = new JLabel("Instructor Name");
        instructorName.setBounds(380, 250, 120, 20);            // instructor name
        non_academic_Course.add(instructorName);
        
            tf_InstructorName = new JTextField();
            tf_InstructorName.setBounds(485, 250, 165, 20);     //text field for instructor name
            non_academic_Course.add(tf_InstructorName);
            
        startDate = new JLabel("Start Date");
        startDate.setBounds(25, 295, 120, 20);          // for start date
        non_academic_Course.add(startDate);
        
            tf_StartDate = new JTextField();
            tf_StartDate.setBounds(100, 295, 110, 20);      // text field for start date
            non_academic_Course.add(tf_StartDate);
            
        completion_Date = new JLabel("Completion Date");
        completion_Date.setBounds(230, 295, 120, 20);           //for completion date
        non_academic_Course.add(completion_Date);
        
            tf_CompletionDate = new JTextField();
            tf_CompletionDate.setBounds(340, 295, 110, 20);             // text field for completion date
            non_academic_Course.add(tf_CompletionDate);
            
        examDate = new JLabel("Exam Date");
        examDate.setBounds(480, 295, 80, 20);           //for exam date
        non_academic_Course.add(examDate);
        
            tf_ExamDate = new JTextField();
            tf_ExamDate.setBounds(550, 295, 100, 20);           // text field for exam date
            non_academic_Course.add(tf_ExamDate);
            
        // initializing register button
        btn_Register = new JButton("Register");
        btn_Register.setBounds(40, 352, 90, 25);            // setting actual position
        non_academic_Course.add(btn_Register);          // adding the button to the panel
        btn_Register.addActionListener(this);       //adding action listener
        
        // initializing register button
        btn_Remove = new JButton("Remove");
        btn_Remove.setBounds(140, 352, 90, 25);         // setting actual position    
        non_academic_Course.add(btn_Remove);        // adding the button to the panel
        btn_Remove.addActionListener(this);         //adding action listener
        
        // initializing register button
        btn_Clear = new JButton("Clear");
        btn_Clear.setBounds(450, 352, 90, 25);          // setting actual position
        non_academic_Course.add(btn_Clear);         // adding the button to the panel
        btn_Clear.addActionListener(this);      //adding action listener
        
        // initializing register button
        btn_Display = new JButton("Display");
        btn_Display.setBounds(550, 352, 90, 25);                // setting actual position
        non_academic_Course.add(btn_Display);               // adding the button to the panel
        btn_Display.addActionListener(this);            //adding action listener
        
        // adding the non_academic_Course panel to the frame
        frame.add(non_academic_Course);
        
        academic_Course.setVisible(true);           // setting visible as true for academic_Course panel
        non_academic_Course.setVisible(false);          // setting visible as false for non_academic_Course panel
        frame.setVisible(true);                     //making the frame as visible
        frame.setBounds(300, 150, 700, 500);            // giving setBounds values for the frame
        frame.setResizable(false);          // making the frame irresizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // exits the frame on closing
        
    }
    
    // creating java main method
    public static void main(String[]args){
        
        new INGCollege();           // calling the constructor of INGCollege()    
        
    }
    
    // overriding abstract method meant for handling different sort of events
    public void actionPerformed(ActionEvent e){
        
        //if the menu item (item_1) is clicked below things happen
        if(e.getSource() == item_1){        
            
            // sets academic_Course as visible and hides the other panel
            non_academic_Course.setVisible(false);
            academic_Course.setVisible(true);
            
        }
        
        // if the menu item (item_2) is clicked below things happen
        else if(e.getSource() == item_2){
            
            // sets non_academic_Course as visible and hides the other panel
            non_academic_Course.setVisible(true);
            academic_Course.setVisible(false);
            
        }
        
        // if the menu item (item_6) is clicked below things happen
        else if(e.getSource() == item_6){
        
            System.exit(0);         // exits the Jframe
            
        }
        
        // if the button pressed is the btnAdd below things happen
        if(e.getSource() == btnAdd){
            
            // checking whether necessary text fields are blank or not
            if(tfCourseID.getText().isBlank() || tfCourseName.getText().isBlank() || tfDuration.getText().isBlank() || tfLevel.getText().isBlank() || tfCredit.getText().isBlank() || tfNumberOfAssessment.getText().isBlank()){
                
                // if found blank show a warning message
                JOptionPane.showMessageDialog(frame, "Required fields must be entered.", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }   
            
            else{       //if not
                
                try{        // using try for the codes to be executed
                    
                    // fetching data from the textfields and storing to the compatible variables
                    String courseID = tfCourseID.getText(); 
                    String courseName = tfCourseName.getText();
                    int duration = Integer.parseInt(tfDuration.getText());      //typecasting string values from textfield to integer
                    String level = tfLevel.getText();
                    String credit = tfCredit.getText();
                    int number_of_Assessments = Integer.parseInt(tfNumberOfAssessment.getText());       //typecasting string values from textfield to integer
                    boolean isAdded = false;        // initializing isAdded as false
                    
                    for(Course c : courseList){         // iterating through the arraylist
                
                        if(c.getcourseID().equals(courseID)){       // checks whether the courseID is valid or not   
                        
                            isAdded = true;     //changes isAdded to true
                            break;                  //terminates the loop
                        
                        }   
                        
                    }
                    
                    if(isAdded == false){       // for not added courseID
                        
                        // calls the constructor of Academic_Course class
                        acad_obj = new Academic_Course(courseID, courseName, duration, level, credit, number_of_Assessments);
                        courseList.add(acad_obj);       //adds the object created to the arraylist
                        JOptionPane.showMessageDialog(frame, "Academic Course added successfully.");        //show a message dialog for success 
                    
                    }
                    
                    else{       // for already added courseID
                        
                        // shows a warning message
                        JOptionPane.showMessageDialog(frame,"This Academic Course is already added.", "Warning", JOptionPane.WARNING_MESSAGE);    
                    
                    }
                
                }
                
                catch(Exception expt){      //catch block if any number format exception occurs
                    
                    JOptionPane.showMessageDialog(frame, "Invalid data entered. Please re-enter in correct format.", "Error", JOptionPane.ERROR_MESSAGE); 
                
                }
                               
            }            
            
        }
        
        // if the button pressed is the btnRegister below things happen
        if(e.getSource() == btnRegister){
            
            // checking whether necessary text fields are blank or not
            if(tfCourseID.getText().isBlank() || tfCourseLeader.getText().isBlank() || tfLecturerName.getText().isBlank() || tfStartingDate.getText().isBlank() || tfCompletionDate.getText().isBlank()){
                
                // if found blank show a warning message
                JOptionPane.showMessageDialog(frame, "Fields that needs to be filled for registration are empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }    
            
            else{       //if not
                
                // fetching data from the textfields and storing to the compatible variables
                String courseLeader = tfCourseLeader.getText();
                String lecturerName = tfLecturerName.getText();
                String startingDate = tfStartingDate.getText();
                String completionDate = tfCompletionDate.getText();
                
                for(Course c : courseList){     // iterating through the arraylist
                    
                    try{    // using try for the codes to be executed
                        
                        if(c.getcourseID().equals(tfCourseID.getText())){       // checks whether the courseID is valid or not  
                    
                            if(c instanceof Academic_Course){   // checks whether c belongs in Academic_Course class or not
                                
                                // downcasting course class object as Academic_Course type
                                Academic_Course acad_obj = (Academic_Course) c;
                            
                                if(acad_obj.getisRegistered() == false){        // checks whether the course is previously registered or not
                                
                                    // call register method in Academic_Course class for registration
                                    acad_obj.register(courseLeader, lecturerName, startingDate, completionDate);
                                    JOptionPane.showMessageDialog(frame,"Academic Course registered successfully.");    //shows a message dialog for success
                                    break;      //terminates the loop
                                
                                }
                                
                                else{       //if found registered
                                
                                    // shows a warning dialog box
                                    JOptionPane.showMessageDialog(frame, "This Academic Course is already registered.", "Warning", JOptionPane.WARNING_MESSAGE);   
                            
                                }
                            
                            }
                        
                        } 
                        
                    } 
                    
                    catch(Exception expt){      //catch block if any exception occurs    
                        
                        // shows an error dialog if courseID found is invalid
                        JOptionPane.showMessageDialog(frame, "The Course ID you gave is not added.", "Error", JOptionPane.ERROR_MESSAGE);    
                        
                    } 

                }
                
            }
        
        }
        
        // if the button pressed is the btnClear below things happen
        if(e.getSource() == btnClear){
            
            // pass empty string for every textfields using setText()
            tfCourseID.setText(" ");
            tfCourseName.setText(" ");
            tfDuration.setText(" ");
            tfLevel.setText(" ");
            tfCredit.setText(" ");
            tfNumberOfAssessment.setText(" ");
            tfCourseLeader.setText(" ");
            tfLecturerName.setText(" ");
            tfStartingDate.setText(" ");
            tfCompletionDate.setText(" ");
            
            // shows a dialog box for success clearance
            JOptionPane.showMessageDialog(frame, "All fields cleared.");
            
        }
        
        // if the button pressed is the btnDisplay below things happen
        if(e.getSource() == btnDisplay){
            
            try{        // using try for the code to be executed
                
                // calls the display method in Academic_Course
                acad_obj.display();
            
            }
            
            catch(Exception ex){            //catch block if any exception occurs
                
                // shows a warning dialog box
                JOptionPane.showMessageDialog(frame, "Add/Register the Academic Course first.","Warning", JOptionPane.WARNING_MESSAGE);    
            
            }    
            
        }
        
        // if the button pressed is the btn_Add below things happen
        if(e.getSource() == btn_Add){
            
            // checking whether necessary text fields are blank or not
            if(tf_CourseID.getText().isBlank() || tf_CourseName.getText().isBlank() || tf_Duration.getText().isBlank() || tf_Prerequisite.getText().isBlank()){
                
                // if found blank show a warning message
                JOptionPane.showMessageDialog(frame, "Required fields must be entered.", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }    
            
            else{       //if not
            
                try{        // using try for the codes to be executed
                    
                    // fetching data from the textfields and storing to the compatible variables
                    String courseID = tf_CourseID.getText();            
                    String courseName = tf_CourseName.getText();
                    int duration = Integer.parseInt(tf_Duration.getText());     //typecasting string values from textfield to integer
                    String prerequisites = tf_Prerequisite.getText();
                    boolean isAdded = false;            // initializing isAdded as false
                    
                    for(Course c : courseList){         // iterating through the arraylist
                
                        if(c.getcourseID().equals(courseID)){       // checks whether the courseID is added previously or not  
                        
                            isAdded = true;     // changes isAdded to true
                            break;      // terminates the loop
                        
                        }
                        
                    }
                    
                    if(isAdded == false){       // if course is not added 
                        
                        // call the constructor of Non_Academic_Course class
                        non_acad_obj = new Non_Academic_Course(courseID, courseName, duration, prerequisites);
                        courseList.add(non_acad_obj);       // add the created object in the arraylist
                        JOptionPane.showMessageDialog(frame, "Non-Academic Course added successfully.");        // show a message dialog for success
                    
                    }
                    
                    else{   //for already added case
                        
                        // generates a warning message dialog
                        JOptionPane.showMessageDialog(frame,"This Non-Academic Course is already added.", "Warning", JOptionPane.WARNING_MESSAGE);    
                    
                    }
                    
                }
            
                catch(Exception expt){      //catch block if any number format exception occurs
                
                    // shows an error message for number format exception
                    JOptionPane.showMessageDialog(frame, "Invalid data entered. Please re-enter in correct format.", "Error", JOptionPane.ERROR_MESSAGE); 
                
                }
            
            }
            
        }
        
        // if the button pressed is the btn_Register below things happen
        if(e.getSource() == btn_Register){
            
            // checking whether necessary text fields are blank or not
            if(tf_CourseID.getText().isBlank() || tf_CourseLeader.getText().isBlank() || tf_InstructorName.getText().isBlank() || tf_StartDate.getText().isBlank() || tf_CompletionDate.getText().isBlank() || tf_ExamDate.getText().isBlank()){
                
                // if found blank show a warning message
                JOptionPane.showMessageDialog(frame, "Fields that needs to be filled for registration are empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }    
            
            else{           //if not
                
                // fetching data from the textfields and storing to the compatible variables
                String courseLeader = tf_CourseLeader.getText();
                String instructorName = tf_InstructorName.getText();
                String startDate = tf_StartDate.getText();
                String completionDate = tf_CompletionDate.getText();
                String examDate = tf_ExamDate.getText();
                
                for(Course c : courseList){         // iterating through the arraylist
                    
                    try{            // using try for the codes to be executed
                    
                        if(c.getcourseID().equals(tf_CourseID.getText())){      // checks whether the courseID valid or not  
                        
                            if(c instanceof Non_Academic_Course){       // checks whether c belongs in Non_Academic_Course class or not
                                
                                // downcasting course class object as Non_Academic_Course type
                                Non_Academic_Course non_acad_obj = (Non_Academic_Course) c;
                            
                                if(non_acad_obj.getisRegistered() == false){        //checks whether the course is registered or not
                                    
                                    // calls the register method with parameters in Non_Academic_Course
                                    non_acad_obj.register(courseLeader, instructorName, startDate, completionDate, examDate); 
                                    JOptionPane.showMessageDialog(frame, "The Non-Academic Course is registered successfully.");        //generates a message dialog for success
                                    break;      //terminates the loop
                                
                                }
                            
                                else{       //for already registered case
                                    
                                    // shows a warning message
                                    JOptionPane.showMessageDialog(frame, "This Non-Academic Course is already registered.", "Warning", JOptionPane.WARNING_MESSAGE);
                            
                                }
                        
                            }
                        
                        }
                    
                    }
                    
                    catch(Exception expt){      //catch block if any exception occurs
                        
                        // shows an error for invalid courseID
                        JOptionPane.showMessageDialog(frame, "The Course ID you gave is not added.", "Error", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                }
            
            } 
        
        }
        
        // if the button pressed is the btn_Remove below things happen
        if(e.getSource() == btn_Remove){
            
            // checking whether text field for courseID is blank or not
            if(tf_CourseID.getText().isBlank()){
                
                // if found blank show a warning message
                JOptionPane.showMessageDialog(frame, "Give the Course ID of the course to be removed.", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }
            
            else{       //if not      
                                
                for(Course c : courseList){         // iterating through the arraylist
                    
                    try{            // using try for the codes to be executed
                        
                        if(c.getcourseID().equals(tf_CourseID.getText())){          // checks whether the courseID is valid or not  
                        
                            if(c instanceof Non_Academic_Course){           // checks whether c belongs in Non_Academic_Course class or not
                                
                                // downcasting course class object as Non_Academic_Course type
                                Non_Academic_Course non_acad_obj = (Non_Academic_Course) c;
                        
                                if(non_acad_obj.getisRegistered() == true){     //checking for course registered status
                                    
                                    if(non_acad_obj.getisRemoved() == false){           //checking if the course is already removed 
                                        
                                        // calls the remove method for course removal
                                        non_acad_obj.remove();  
                                        JOptionPane.showMessageDialog(frame, "Non-Academic Course removed successfully.");  //shows a message dialog for success removal
                                        
                                    }
                                    
                                }
                                
                                else{       //for unregistered status
                                    
                                    // shows an error message dialog
                                    JOptionPane.showMessageDialog(frame, "Couldn't remove unregistered course.", "Error", JOptionPane.ERROR_MESSAGE);    
                                
                                }
                            
                            }
                        
                        }
                        
                    }
                    
                    catch(Exception expt){          //catch block if any exception occurs
                         
                        // gives an error dialog box for invalid course id
                        JOptionPane.showMessageDialog(frame,"Invalid Course ID found.","Error", JOptionPane.ERROR_MESSAGE);    
                    
                    }
            
                }
            
            }
            
        }
        
        // if the button pressed is the btn_Clear below things happen
        if(e.getSource() == btn_Clear){
            
            // pass empty string for every textfields using setText()
            tf_CourseID.setText(" ");
            tf_CourseName.setText(" ");
            tf_Duration.setText(" ");
            tf_Prerequisite.setText(" ");
            tf_CourseLeader.setText(" ");
            tf_InstructorName.setText(" ");
            tf_StartDate.setText(" ");
            tf_CompletionDate.setText(" ");
            tf_ExamDate.setText(" ");
            
            // shows a dialog box for success clearance
            JOptionPane.showMessageDialog(frame, "All fields cleared.");
            
        }
        
        // if the button pressed is the btn_Display below things happen
        if(e.getSource() == btn_Display){
            
            try{               // using try for the code to be executed
                
                // calls the display method in Non_Academic_Course
                non_acad_obj.display();
            
            }
            
            catch(Exception ex){        //catch block if exception occurs
                
                // shows a warning dialog box
                JOptionPane.showMessageDialog(frame, "Add/Register the Non-Academic Course first.","Warning", JOptionPane.WARNING_MESSAGE);    
            
            }    
            
        }
        
    }
    
}