package com.company;

class Thread1 implements Runnable{

    @Override
    public void run()
    {
        int i = 0;
        while (i<1000)
        {
            System.out.println("Thread1 Hi");
            i++;
        }
    }

}

class Thread2 implements Runnable{

    @Override
    public void run()
    {
        int j = 0;
        while (j<1000)
        {
            System.out.println("Thread2 Bye");
            j++;
        }
    }
}
public class ThreadRunnable{

    public static void main(String[] args) {

        Thread1 T1 = new Thread1();

        Thread t = new Thread(T1);
        Thread2 T2 = new Thread2();

        Thread th = new Thread(T2);

        t.start();
        th.start();

    }
}
