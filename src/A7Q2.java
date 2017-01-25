
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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the user to enter in the number of people 
        System.out.println("How many heights of people are being measured?");
        int peeps = input.nextInt(); 
        
        // make slots for the number of people's height being measured 
        double[] heightOfPeeps = new double[peeps]; 
        
        // get the user to enter in the heights of the measured peeps
        for(int L = 0; L < heightOfPeeps.length; L++){
            System.out.println("Please enter in the height (cm) " + (L+1));
            heightOfPeeps[L] = input.nextDouble(); 
        }
        // get the total of heights and then calculate the average to determine the above average heights 
        double total = 0 ; 
        for(int L = 0; L < heightOfPeeps.length; L++){
            // add the number into total 
            total = total + heightOfPeeps[L]; 
        }
        // now calculate the average and then determine the above average heights
        double avg = total/heightOfPeeps.length; 
        // round the average to 2 decimal places 
        avg = Math.round(avg * 100) / 100.00; 
        // give user the average height of people 
        System.out.println("The average height (cm) of people is "+avg+"%");
        
        // also give user the above average heights in measured people 
        for(int L = 0; L < heightOfPeeps.length; L++){
            // make an if statement to give user above average heights
            if(heightOfPeeps[L] > avg){
                // print out the above average heights of people 
                System.out.println("The above average height is " + heightOfPeeps[L]);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
