package com.company;

public class Break_Continue {

    public static void main(String[] args) {

        int b = 0;
        while(b<50)
        {
            System.out.println(b);
            if(b==2)
            {
                System.out.println("Ending the loop with help of BREAK keyword.");
                break;
            }
            b++;
        }

        for(int i =0; i<5; i++)
        {
            if(i==3)
            {
                System.out.println("using continue here for 3rd iteration.");
                continue;
            }
            System.out.println(i);
        }
    }
}
