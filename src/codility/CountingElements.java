/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author MHatem
 */
public class CountingElements {
    public int FrogRiverOne(int X, int[] A){
        int steps = X;
        boolean [] check = new boolean[X+1];
        for(int k = 0 ; k < A.length ; k++){
            if(!check[A[k]]){
                check[A[k]] = true;
                steps--;
            }
            if(steps == 0)
                return k;
        }
        return -1;
    }
}
