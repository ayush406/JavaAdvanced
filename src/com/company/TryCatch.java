package com.company;

public class TryCatch {

    public static void main(String[] args) {

        int a = 100;
        int b = 0;

        try{
            System.out.println(a/b);

        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e);

        }
        finally {
            System.out.println("this is finally.");
        }
        System.out.println("end of the program");


    }
}
