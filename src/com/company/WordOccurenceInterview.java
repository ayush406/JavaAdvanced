package com.company;

public class WordOccurenceInterview {

    public static void main(String[] args) {

        String s1 = "Bat cat mat Bat Mat Cat Bat";

        String[] sp = s1.split(" ");
        int [] occ = new int[sp.length];

        int visited = -1;
        for(int i=0; i<sp.length; i++)
        {
            int count =1;
            for(int j=i+1; j<sp.length; j++)
            {
                if(sp[i].equalsIgnoreCase(sp[j]))
                {
                    count++;
                    occ[j] =visited;
                }
            }
            if (occ[i]!=visited)
                occ[i] = count;
        }

        for(int i=0;i<sp.length;i++)
        {
            if(occ[i]!=visited)
                System.out.println(occ[i]+" "+sp[i]);
        }
    }


}
