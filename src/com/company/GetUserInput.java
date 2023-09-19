package com.company;

import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();

        System.out.println(a);

//        Scanner a2 = new Scanner(System.in);

//        String str = a2.nextLine();
//        System.out.println(str);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);


    }
}
