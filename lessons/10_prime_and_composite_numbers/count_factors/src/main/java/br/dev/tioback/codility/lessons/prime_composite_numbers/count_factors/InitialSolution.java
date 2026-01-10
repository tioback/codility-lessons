package br.dev.tioback.codility.lessons.prime_composite_numbers.count_factors;

import java.util.Collections;
import java.util.List;

public class InitialSolution {

    private final boolean debug;
    private int n;
    private int result;
    private List<Integer> temp;

    public InitialSolution(boolean debug) {
        this.debug = debug;
    }

    public InitialSolution() {
        this(false);
    }

    private void add(int i) {
        if (debug) {
            System.out.println("+" + i);
            temp.add(i);
        }
        result++;
    }

    private void print() {
        if (!debug) {
            return;
        }

        Collections.sort(temp);
        System.out.printf("N: %d | r: %d | s: %d | f: %s%n", n, result, temp.size(), temp);
    }

    public int solution(int N) {
        // reset values for each call
        this.n = N;
        this.result = 0;

        if (debug) {
            this.temp = new java.util.ArrayList<>();
        }

        if (N == 1) {
            add(1);
            print();
            return 1;
        }

        add(1);

        boolean even = (N % 2 == 0);
        // no need to count beyond half of N, as no factors exist beyond that
        int half = N / 2, 
        // if N is odd, skip 2 and use increment of 2 to only check odd numbers
        i = even ? 2 : 3, increment = even ? 1 : 2, last = half;
        while (i < last) {
            if (N % i == 0) {
                add(i);
                last = N / i;
                if (i < last) {
                    add(N / i);
                }
            }
            i += increment;
        }

        add(N);

        print();

        return result;
    }
}
