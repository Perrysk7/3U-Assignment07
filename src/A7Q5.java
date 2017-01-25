
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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user how many marks are going to be entered 
        System.out.println("How many marks are being entered?");
        int numOfmarks = input.nextInt(); 
        
        // make slots for the number of marks that are going to be entered by the user 
        double[] marks = new double[numOfmarks]; 
        
        // get the user to enter in the marks
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in mark "+ (i+1));
            marks[i] = input.nextDouble(); 
        }
        // create an array to arrange the marks in ascdending order
        // run the loop with the x value starting from 0
        for(int x = 0; x < marks.length; x++){
            // run the loop with the y value starting from 1
            for(int y = x + 1; y < marks.length; y++){
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
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);   
        }
        // find the median for the entered marks 
        // if the number of marks entered are even 
        if(numOfmarks % 2 == 0){
            double median = (marks[numOfmarks/2 - 1] + marks[numOfmarks/2]) / 2;
            System.out.println("The median is " + median); 
        }else{
            // if the number of marks entered are odd 
            double median = marks[numOfmarks / 2]; 
            System.out.println("The median is " + median);
        }    
    } 
}
