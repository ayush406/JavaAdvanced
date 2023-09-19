package com.company;

class MyThr extends Thread{

    public MyThr(String name)
    {
        super(name);

    }

    @Override
    public void run()
    {
        System.out.println("Thanks to you!");
    }

}

class MyThr1 implements Runnable{


    @Override
    public void run()
    {
        System.out.println("This is run method of MyThr1");
    }

}

public class ThreadConstructors {

    public static void main(String[] args) {

        MyThr t1 = new MyThr("Ayush");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());

        MyThr1 t2 = new MyThr1();
        Thread th = new Thread(t2, "Ayush");
        th.start();




    }

}
