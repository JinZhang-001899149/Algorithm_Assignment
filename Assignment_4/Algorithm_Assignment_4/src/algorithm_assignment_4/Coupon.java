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

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Coupon {

    public static int Coupon(int M) {
        int count = 0;
        int[] array = new int[M];
        Set<Integer> set = new HashSet<>();

        while (true) {
            count++;
            Random r1 = new Random();
            double k = r1.nextDouble();
            int index = HashMethod.hash(k, M);
            //array[index]++;
            
            add(array,k,M);
            set.add(index);
            if (set.size() == M) {
                break;
            }
        }

        return count;
    }


    //for AddTest
    public int[] result;
    public Coupon(int m){
        result = new int[m];
    }

    public static void add(int[] arr, double k, int M){
        int index = HashMethod.hash(k, M);
        arr[index]++;
    }

    public int getNum(int k){
        return result[k];
    }

}
