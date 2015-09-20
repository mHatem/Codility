/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author MHatem
 */
public class CountingElements {

    public int FrogRiverOne(int X, int[] A) {
        int steps = X;
        boolean[] check = new boolean[X + 1];
        for (int k = 0; k < A.length; k++) {
            if (!check[A[k]]) {
                check[A[k]] = true;
                steps--;
            }
            if (steps == 0) {
                return k;
            }
        }
        return -1;
    }

    public int PermCheck(int[] A) {
        int max = 0;
        long sum = 0;
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!check.add(A[i])) {
                return 0;
            }
            if (A[i] > max) {
                max = A[i];
            }
            sum = sum + A[i];
        }
        if (sum == ((max * (max + 1)) / 2)) {
            return 1;
        }
        return 0;
    }

    public int MissingInteger(int[] A) {
        int i;
        HashMap<Integer, Boolean> check = new HashMap<>();

        for (i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                check.put(A[i], Boolean.TRUE);
            }
        }
        i = 1;
        while (check.containsKey(i)) {
            i++;
        }
        return i;
    }

    public int[] MaxCounters(int N, int[] A) {

        int max = 0;
        int[] Arr = new int[N];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                for (int j = 0; j < N; j++) {
                    Arr[j] = max;
                }
            } else {
                Arr[A[i] - 1] += 1;
                if (Arr[A[i] - 1] > max) {
                    max = Arr[A[i] - 1];
                }
            }
        }
        return Arr;
    }
}
