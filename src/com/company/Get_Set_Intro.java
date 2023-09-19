package com.company;

class StudDetails{

    private int rollNo;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int r)
    {
        rollNo = r;
    }

}
public class Get_Set_Intro {

    public static void main(String[] args) {

        StudDetails s1 = new StudDetails();
        s1.setName("Ayush");
        s1.setRollNo(06);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

    }


}
