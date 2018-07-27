/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_assignment_4;

/**
 *
 * @author JIN
 */
public class Algorithm_Assignment_4 {

    /**
     * @param args the command line arguments
     */
   
        
         public static void main(String[] args){
         // TODO code application logic here

        int[] Ms = {10, 50, 100, 200, 500, 800, 1000, 1500, 2000, 3000};

        for(int a = 0; a < 10; a++) {
            int M = Ms[a];
            int count1 = 0;
            for (int i = 0; i < 1000; i++) { //average
                count1 = count1 + Birthday.birthday(M);
            }
            int re1 = count1 / 1000;
            System.out.println("M = "+M);
            System.out.println("C1(m): ");
            System.out.println("Experiment: "+re1);
            double cal1 = Math.sqrt((Math.PI * M) / 2);
            System.out.println("Calculated: "+ (new Double(cal1)).intValue());

            
            int count2 = 0;
            for (int i = 0; i < 1000; i++) {
                count2 = count2 + Coupon.Coupon(M);
            }
            int re2 = count2 / 1000;
            System.out.println("B0(m): ");
            System.out.println("Experiment: "+re2);
            double cal2 = Math.log(M) * M;
            System.out.println("Calculated: "+ (new Double(cal2)).intValue());
            System.out.println();
        }
    }

    
}
