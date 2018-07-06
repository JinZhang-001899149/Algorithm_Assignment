/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_assignment_3;
/**
 *
 * @author JIN
 */

import static algorithm_assignment_3.Helper.*;

//import static algorithm_assignment_3.Helper.less;
//import static algorithm_assignment_3.Helper.swap;


public class InsertionSort<X extends Comparable<X>> implements Sort<X> {
    @Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement insertionSort
        int n = to - from;
        for(int i = from + 1; i < n; i++){
            for(int j = i; j > from && less(xs[j], xs[j-1]); j--){
                swap(xs, j, j-1);
            }
        }
    }
}
