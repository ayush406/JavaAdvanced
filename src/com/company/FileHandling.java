package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

//        File myFile = new File("Firsts.txt");
//        myFile.createNewFile();
//

//        FileWriter fileWriter = new FileWriter("Firsts.txt");
//        fileWriter.write("this is my first file created using Java.");
//        fileWriter.close();

//        File f = new File("Firsts.txt");
//        Scanner sc = new Scanner(f);
//        while (sc.hasNextLine())
//        {
//            System.out.println(sc.nextLine());
//        }

        File df = new File("Firsts.txt");

        if (df.delete())
        {
            System.out.println("deleted "+df.getName()+" successfully.");
        }
        else
        {
            System.out.println("error in deleting file.");
        }

    }
}
