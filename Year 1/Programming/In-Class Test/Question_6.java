/*
 * Question-6 Solution
   */

// importing several java packages for GUI
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Question_6 implements ActionListener       // creating a class that implements actionlistener interface for event hadling
{
    
    JFrame frame;       // declaring Jframe
    
    // declaring Jlabels
    JLabel title, firstName, lastName, gender, street1, street2, city, zipCode, country;
    
    // All Jtextfields needed
    JTextField tf_firstName, tf_lastName, tf_street1, tf_street2, tf_city, tf_zipCode;
    
    // required Radio buttons
    JRadioButton radio1, radio2;
    
    // declaring combobox
    JComboBox combo;
    
    // declaring Jbuttons
    JButton ok, cancel, register;    
    
    Question_6(){   // constructor of the same class
    
        frame = new JFrame("FORM");   //initializing Jframe
        
        // initializing heading label for title
        title = new JLabel("User Information Form");
        title.setFont(new Font("Algerian", Font.PLAIN, 20));        // setting a new font for the heading label
        title.setBounds(10, 10, 240, 20);        // defining actual position
        frame.add(title);           // adding the label to the panel
        
        /* 
         * initializing different labels and text fields that are required for frame
         * using the concept of actual positioning using setBounds
         * finally, adding each gui components in the frame
        */
       
        firstName = new JLabel("First Name");
        firstName.setBounds(25, 70, 70, 15);        // for first name
        frame.add(firstName);
        
            tf_firstName = new JTextField("FirstName");
            tf_firstName.setBounds(110, 67, 200, 25);           // text field for first name
            frame.add(tf_firstName);
            
        lastName = new JLabel("Last Name");             // for last name
        lastName.setBounds(25, 120, 70, 15);
        frame.add(lastName);
        
            tf_lastName = new JTextField("LastName");       // textfield for last name
            tf_lastName.setBounds(110, 117, 200, 25);
            frame.add(tf_lastName);
        
        gender = new JLabel("Gender");                  // for gender label
        gender.setBounds(33, 170, 70, 15);
        frame.add(gender);
            
            ButtonGroup group = new ButtonGroup();          //defining a group for radio buttons
            radio1 = new JRadioButton("Male");
            radio1.setBounds(110, 167, 70, 25);         // radiobutton for male
            group.add(radio1);
            frame.add(radio1);
            
            radio2 = new JRadioButton("Female");
            radio2.setBounds(185, 167, 100, 25);            // radiobutton for female
            group.add(radio2);
            frame.add(radio2);
                
        street1 = new JLabel("Street 1");
        street1.setBounds(32, 220, 70, 15);         // for street 1 label
        frame.add(street1);
        
            tf_street1 = new JTextField("Street1");
            tf_street1.setBounds(110, 217, 200, 25);        // for the textfield
            frame.add(tf_street1);
        
        street2 = new JLabel("Street 2");
        street2.setBounds(32, 270, 70, 15);          // for street 2 label   
        frame.add(street2);
        
            tf_street2 = new JTextField("Street2");
            tf_street2.setBounds(110, 267, 200, 25);            // for the textfield
            frame.add(tf_street2);
        
        city = new JLabel("City");
        city.setBounds(43, 320, 50, 15);              // for city label      
        frame.add(city);
        
            tf_city = new JTextField("City");               // textfield for city
            tf_city.setBounds(110, 317, 200, 25);       
            frame.add(tf_city);
        
        zipCode = new JLabel("Zip Code");
        zipCode.setBounds(360, 320, 70, 15);            // zip code label
        frame.add(zipCode);
        
            tf_zipCode = new JTextField("ZipCode");
            tf_zipCode.setBounds(430, 317, 70, 25);     // corresponding text field
            frame.add(tf_zipCode);
        
        String items[] = {"Item 1", "Nepal", "USA", "UK", "Canada"};            // creating an array for combobox
        country = new JLabel("Country");
        country.setBounds(30, 370, 100, 15);        //Jlabel for country
        frame.add(country);
        
            combo = new JComboBox(items);       // placing the items of an array in combobox
            combo.setBounds(110, 367, 200, 25);     
            frame.add(combo);
        
        // initializing ok button
        ok = new JButton("OK");
        ok.setBounds(180, 430, 60, 25);         // giving actual position
        frame.add(ok);              // adding the button to the frame
        ok.addActionListener(this);         // adding actionlistener
        
        // initializing cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(250, 430, 90, 25);             // giving actual position
        frame.add(cancel);              // adding the button to the frame
        cancel.addActionListener(this);         // adding actionlistener
        
        // initializing register button
        register = new JButton("Register me later");
        register.setBounds(350, 430, 150, 25);      // giving actual position
        frame.add(register);                // adding the button to the frame
        register.addActionListener(this);               // adding actionlistener
            
        frame.setLayout(null);          // setting layout as null
        frame.setVisible(true);                     //making the frame as visible
        frame.setBounds(300, 150, 550, 525);            // giving setBounds values for the frame
        frame.setResizable(false);          // making the frame irresizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // exits the frame on closing
    
    }
    
    // creating java main method
    public static void main(String[]args){
            
        new Question_6();       // calling the constructor
        
    }
    
    // overriding abstract method meant for handling different sort of events
    public void actionPerformed(ActionEvent event){
        
        // if the ok button is pressed 
        if(event.getSource() == ok){
            
            // shows a specified message
            JOptionPane.showMessageDialog(frame, "The information is successfully registered");
        
        }
        
        // if the cancel button is pressed 
        else if(event.getSource() == cancel){
            
            // shows an error message
            JOptionPane.showMessageDialog(frame, "You cancelled", "Error", JOptionPane.ERROR_MESSAGE);   
        
        }
        
        // if the register button is pressed 
        else{
            
            // shows a warning message
            JOptionPane.showMessageDialog(frame, "Your registration will be done later", "Warning", JOptionPane.WARNING_MESSAGE);   
        
        }
    }
    
}
