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

import java.util.Random;

public class Birthday {
    public static int birthday(int M){
        int count = 0;
        int[] array = new int[M];

        while(true){
            count++;
            Random r1 = new Random();
            double k = r1.nextDouble();
            int index = HashMethod.hash(k, M);
            array[index]++;
            if (array[index] == 2){
                break;
            }
        }
        return count;
    }
}
