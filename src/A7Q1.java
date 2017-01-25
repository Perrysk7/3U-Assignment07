
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the user to enter in the number of students in the class
        System.out.println("How many students are in the class");
        int students =  input.nextInt();
        
        // make slots for the number of students 
        double[] marks = new double[students];
        
        // get the user to enter in the marks
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in mark " + (i +1));
            marks[i] = input.nextDouble(); 
        }
       // get the total of the entered in marks by the user 
        double total = 0; 
        for(int i = 0; i  < marks.length; i++){
            // add the number into total 
            total = total + marks[i]; 
        }
        // calculate the average of the entered marks and round the answer to 2 decimal places  
        double avg = total/marks.length; 
        avg = Math.round(avg * 100) / 100.00; 
        System.out.println("Average: " + avg+"%");    
    }
}
