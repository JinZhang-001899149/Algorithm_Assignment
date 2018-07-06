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



public class SelectionSort<X extends Comparable<X>> implements Sort<X> {

    @Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement selection sort
        int n = to - from;
        for(int i = from; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(less(xs[j],xs[min])) min = j;
            }
            swap(xs, i, min);
        }
    }
}
