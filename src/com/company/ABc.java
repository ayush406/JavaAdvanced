package com.company;

public class ABc {

    public static void main(String[] args) {

        for(int i=0; i< 3; i++)
        {
            for(int j=0; j<=i; j++ )
            {
                System.out.print("*");
                if(i!=j)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
