package com.company;

public class VarArgs {

    static int sum(int x, int ...arr)
    {
        int result = 0;
        for(int a :arr) {
            result += a;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("the sum of 4, 5 and 6 is " + sum(4,5,6));
        System.out.println("the sum is " +sum(3,4,5,6,7,8,9) );
    }
}
