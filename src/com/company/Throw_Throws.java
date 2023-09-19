package com.company;

class NegativeRadiusException extends Exception{

    @Override
    public String toString()
    {
        return "Radius Supplied is Negative";
    }
}

public class Throw_Throws {

    public static int divide(int a, int b) throws ArithmeticException
    {

        int res = a/b;
        return res;
    }

    public static double Area(int r) throws NegativeRadiusException {
        if(r==0)
        {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;

    }

    public static void main(String[] args) {

        try {
            int c = divide(6,0);
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }

        try{

            Area(0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }




    }
}
