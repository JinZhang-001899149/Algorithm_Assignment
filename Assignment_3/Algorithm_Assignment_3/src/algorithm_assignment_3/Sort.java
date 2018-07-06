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

public interface Sort<X extends Comparable<X>> {

    /**
     * Generic sort method.
     *
     * @param xs sort the array xs in place
     */
    default void sort(X[] xs) {
        sort(xs, 0, xs.length);
    }

    /**
     * Generic sort method.
     *
     * @param xs   sort the array xs in place
     * @param from the index of the first element to sort
     * @param to   the index of the first element not to sort
     */
    
    void sort(X[] xs, int from, int to);

}
