
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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input =  new Scanner(System.in); 
        
        // make an array to store 2 values 
        double[] nums = new double[2]; 
        
        // ask the user for the 2 values 
        for(int L = 0; L < nums.length; L++){
            System.out.println("Please enter in value " + (L+1));
            nums[L] = input.nextDouble(); 
        }
        // create an if statement to display the values in ascending order
        if(nums[0] < nums[1]){ 
          double Snum = nums[0]; 
          double Lnum = nums[1];
          nums[0] = Snum; 
          nums[1] = Lnum; 
          System.out.println("The numbers in ascending order are " + nums[0] +" ," + nums[1]);
        }else{
          double Snum = nums[1];
          double Lnum = nums[0]; 
          nums[0] = Lnum; 
          nums[1] = Snum;
          System.out.println("The numbers in ascending order are " + nums[1] +" ,"+ nums[0]);     
        }    
    }
}
