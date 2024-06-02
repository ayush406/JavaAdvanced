package com.freecharge;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        /*String s, s1;

        Scanner sc = new Scanner(System.in);

        System.out.println("user input requested");

        s = sc.nextLine();

        System.out.println("user input requested for second time");

        s1 = sc.next();

        System.out.println(s);

        System.out.println(s1);*/

      /*  int i = 1;
        int b = i++;
//        int c = ++i;
        System.out.println(b);
        System.out.println(i);*/

//        System.out.println(i);
//        System.out.println(c);

        /*String s = "Ayush a good boy";

        System.out.println(s.length());
        s = s.toLowerCase();
        System.out.println(s);

        System.out.println(s.trim());

        System.out.println(s.substring(4));
        System.out.println(s.substring(4,8));*/

       /* int i = 10;

       switch (12) {
           case 10 :
               System.out.println("bhot bdhia");
               break;

           case 12 :
               System.out.println("fuddu sperm");
               break;

           default :
               System.out.println("koi fayda nhi");
       }*/
//        int i =10;
//
//        /*while(i>6)
//        {
//            i--;
//            System.out.println(i);
//        }*/
//
//        do{
//            System.out.println(i);
//            i--;
//        }while (i>6);
//
//        for(int j=0; j<5; j++)
//        {
//            System.out.print(j + " ");
//        }

//        int arr[] = {1,3,5,78,9};
//        int swap;
//        int a= Math.floorDiv(arr.length, 2);
//
//        for(int i=0; i<a; i++)
//        {
//            swap = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = swap;
//        }
//
//        for(int i : arr)
//        {
//            System.out.println(i);
//        }

/*        int arr[] = {1,3,5,78,9};
        int max = 0;

        for(int i : arr)
        {
            if(i > max)
                max = i;
        }

        System.out.println(max);
        System.out.println(arr.toString());*/

//        int arr[] = {1,3,5,78,9};
//        boolean isSorted = true;
//
//        for(int i=0; i<arr.length-1; i++)
//        {
//            if(arr[i]>arr[i+1])
//            {
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted)
//        {
//            System.out.println("array is sorted");
//        }
//        else

//            System.out.println("array isn't sorted");

       /* Test t = new Test();

        int a = t.fun();

        System.out.println(a);

    }

    int fun(int ...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum = sum + i;
        }

        return sum;*/

        int arr[] = {23, 67, 1, 9, 5};
        int c;
        int l = arr.length;
        int n = Math.floorDiv(l,2);

        for (int i = 0; i < n; i++)
        {
            c = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = c;
        }

        for (int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
