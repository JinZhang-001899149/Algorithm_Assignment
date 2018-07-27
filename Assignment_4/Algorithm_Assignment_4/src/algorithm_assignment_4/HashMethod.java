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

import static java.lang.Double.doubleToLongBits;

public class HashMethod {

    public static int hash(double key, int M){

        int index;
        long bits = doubleToLongBits(key);
        // implemention of double hash code
        int med = (int) (bits ^ (bits >>> 32));
        
        // int between 0 and M - 1 (for use as array index).
        index = (med & 0x7fffffff) % M;

        return index;
    }
}
