package com.company;

class Lib{

    String [] books;
    int noOfBooks;
    Lib()
    {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book)
    {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("\""+book+"\" has been added.");
    }

    void showAvailableBooks()
    {
        System.out.println("Available books are :-");
        for(String b: this.books)
        {
            if(b == null)
                continue;
            System.out.println("* "+b);
        }
    }
    void issueBook(String b1)
    {
        for(int i=0; i<this.books.length; i++)
        {
            if(this.books[i].equals(b1))
            {
                System.out.println("the Book has been issued");
                this.books[i] = null;
                return;
            }

        }
        System.out.println("The book doesn't exist");
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}

public class Library {

    public static void main(String[] args) {

        Lib l1 = new Lib();
        l1.addBook("Rich Dad Poor Dad");
        l1.addBook("C++");
        l1.addBook("India after Gandhi");
        l1.showAvailableBooks();
        l1.issueBook("India after Gandhi");
    }
}
