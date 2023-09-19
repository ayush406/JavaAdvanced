package com.company;

class Mod{

    public int a = 56;
    protected int b = 60;
    int c = 78;
    private int d = 6;

    public void meth1()
    {
        //this method shows that all modifiers can be accessed in same class.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class accessModifier {

    public static void main(String[] args) {

        Mod m = new Mod();
        m.meth1();

//        Below 4 lines of code explains the accessibility of modifiers in a same package.
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
//        System.out.println(m.d); .This line will give error as we can't access private modifier in same package.
    }
}
