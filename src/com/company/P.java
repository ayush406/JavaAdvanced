package com.company;

abstract class XY{

    abstract void show();
}
public class P{

    public static void main(String[] args) {

        System.out.println("main");

        int[] arr1 = {1,2,3,4,5};
        int le = arr1.length;
        int l = Math.floorDiv(le,2);
        int c;
        for(int i =0; i<l ;i++)
        {
            c = arr1[i];
            arr1[i] = arr1[le-i-1];
            arr1[le-i-1] = c;
        }
        for(int a :arr1)
            System.out.print(a+" ");


    }
}
