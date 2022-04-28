package com.learnjava;

public class jump {
    static int stepRequired(int N)
    {





        int cnt = 0;

        // Till N becomes 0
        while (N > 0) {

            // Removes the set bits from
            // the right to left
            N = N & (N - 1);
            cnt++;
        }

        return cnt;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Number of stairs
        int N = 7;

        // Function Call
        System.out.print(stepRequired(N));
    }
}
