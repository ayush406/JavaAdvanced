package com.company;

public class Progr_int {

    static int count;
    public Progr_int()
    {
        count++;
    }

    public static void main(String[] args) {

        Progr_int p1 = new Progr_int();
        Progr_int p2 = new Progr_int();

        System.out.println(count);

//        if(p1 instanceof Progr_int)
//            System.out.println("Yes");

//        input : aaaaabbbbcccdeeeeaabbbggg
//
//        output : a5b4c3de4a2b3g3

//
        String s = "aaaaabbbbcccdeeeeaabbbggg";
        int count = 1;
        for(int i=0; i<s.length()-1; i++)
        {

            if(s.charAt(i) == s.charAt(i+1))
            {
//                System.out.print(s.charAt(i));
                count++;
//                break;
            }
            else
            {
                System.out.println(s.charAt(i)+""+count);
                count =1;

            }


        }


//
//        Ayush
//                hua



//        String s = "Ayusha";
//
//        String rev = "";  //hsuyA
//
//        for(int i=0; i<s.length(); i++)
//        {
//            rev = s.charAt(i) + rev;
//        }
//
//        for(int i=0; i<rev.length(); i++)
//        {
//            if(i%2==0)
//                System.out.print(rev.charAt(i));
//        }
    }
}
