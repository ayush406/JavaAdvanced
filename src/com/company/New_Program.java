package com.company;

public class New_Program {

    public static void main(String[] args) {
//        Input is a string & you have to perform 2 activities:
//
//        Inverse the case & reciprocate the alphabet. I.e a becomes z, c becomes x or if the alphabet is 10th alphabet from start, it is to be replaced by 10th last alphabet


        String s = "This is my String";
        String f  = "";
        char c;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                if(Character.isLowerCase(s.charAt(i)))
                {
                    c = Character.toUpperCase(s.charAt(i));
                    f = f+c;
                }
                else
                {
                    c = Character.toLowerCase(s.charAt(i));
                    f = f+c;
                }
            }
        }

       for(int i=0; i<s.length(); i++)
       {
           c = (char)(26-s.charAt(i));
           System.out.println(c);

           f = f+c;
       }


       System.out.println(s);

//        String c  ="z";
//
//        System.out.println(c.hashCode());

    }
}
