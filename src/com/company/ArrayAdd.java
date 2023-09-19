package com.company;

public class ArrayAdd {

    public static void main(String[] args) {

        int[][] A = {{1,3,6}, {2,7,9}};

        int[][] B = {{6,9,11}, {31,45,67}};

        int[][] result = {{0,0,0}, {0,0,0}};

        for(int i=0; i<A.length; i++)
        {
            for (int j=0; j<A[i].length; j++)
            {
                result[i][j] = A[i][j] + B[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        int[] arr ={1,3,45,76,89,110};
        int max =arr[0];

        for(int a : arr)
        {
            if(a<max)
            {
                max = a;
            }
        }
        System.out.println(max);

        boolean sort = true;
        for(int a =0 ; a<arr.length-1 ;a++)
        {
            if(arr[a] > arr[a+1])
            {
                sort = false;
                break;
            }
        }
        if (sort)
        {
            System.out.println("yes");
        }
        else
            System.out.println("No");


    }




}
