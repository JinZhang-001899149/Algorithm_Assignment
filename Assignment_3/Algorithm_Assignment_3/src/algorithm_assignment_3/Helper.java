/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_assignment_3;

public class Helper {

    static <X extends Comparable<X>> boolean less(X v, X w) {
        return v.compareTo(w) < 0;
    }

    static <X extends Comparable<X>> void swap(X[] a, int i, int j) {
        X temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
