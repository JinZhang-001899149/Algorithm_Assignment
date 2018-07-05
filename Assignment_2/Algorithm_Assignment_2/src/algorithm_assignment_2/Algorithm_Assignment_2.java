/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_assignment_2;

/**
 *
 * @author JIN
 */

import java.util.Random;
import java.util.Scanner;

public class Algorithm_Assignment_2  {

    public static int count(int n){

         WQUPC demo = new WQUPC(n);

        int count = 0;

        while (demo.count() != 1) {
            Random random = new Random();
            int p = random.nextInt(n);
            int q = random.nextInt(n);

            if (demo.connected(p, q) == true) {
                count++;
                continue;
            } else if (demo.connected(p, q) == false) {
                demo.union(p, q);
                count++;
                continue;
            }
        }

        return count;
    }

    public static void main(String argus[]) {
     /**
     * @param args the command line arguments
     */
     for(int j=0; j<10; j++ )
     {
        System.out.print("Please enter value of n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      



        // The number of generated connections base on the formula n * 0.5 * Math.log(n)
        // this part is using to compare to the WQUPC Algorithm
        
        double y = n * 0.5 * Math.log(n);
        
        
        int sum = 0;
    


        //To make result more accurate,
        //run the count() method 100 times and calculate the average result
        
        for(int i = 0; i < 100; i++){
            int co = count(n);
            sum = sum + co;
        }
        double ave = sum / 100;
        


       // And in order to compare the outcome My conclusion is to caculation the reletive error
       double z = Math.abs(y - ave)/y ;
       
        System.out.println("=======================================================================================================");       
        System.out.println("The Average number of generated connections after running 100 times of count() is: "+ ave);
        System.out.println("The Number of generated connections base on the formula n * 0.5 * Math.log(n)  is: "+ y);
        System.out.println("The Reletive Error is: "+ z);
        System.out.println("======================================================================================================"); 
        
     }
    }

}
