
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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner 
        Scanner input = new Scanner(System.in); 
        
        // make 10 slots for the number of marks that are going to be entered 
        double[] marks = new double[10]; 
        
        // ask the user for the 10 marks 
        for(int o = 0; o < marks.length; o++){
            System.out.println("Please enter in mark " + (o+1));
            marks[o] = input.nextDouble(); 
        }
        // make a loop to arrange the marks in an ascending order
        // run the loop with the x value starting from 0
        for(int x = 0; x <= 8; x++){
            // run the loop with the y value starting from 1 to end the loop at 10 
            for(int y = x + 1; y <= 9; y++){
                // swap the x value with the y value when x is greater then y
                if(marks[x] > marks[y]){
                    double Lmark = marks[x];
                    double Smark = marks[y]; 
                    marks[x] = Smark;
                    marks[y] = Lmark;   
                } 
            }
        }
        // repeat the first array to display the marks in ascending order
        System.out.println("The marks in ascending order are: ");
        for(int o = 0; o < marks.length; o++){
            System.out.println(marks[o]);
        }  
    }  
}
