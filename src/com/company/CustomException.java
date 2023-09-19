package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Except extends Exception{

    @Override
    public String toString()
    {
        return super.toString() + " this is to string of Except class.";
    }

    @Override
    public String getMessage()
    {
//        return super.getMessage() +" this is get message of Except class.";
        return " this is get message of Except class.";
    }
}

public class CustomException{

    public static void main(String[] args) throws IOException {

        int a =9;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to be divided");
        int b = sc.nextInt();

        File m = new File("abc.txt");
        m.createNewFile();

        if (b==0)
        {
            try{
                throw new Except();
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
//                System.out.println(e.getMessage());
//                e.printStackTrace();
                System.out.println("finished");

            }

        }



    }
}
