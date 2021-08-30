package com.java.dao;

import com.java.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    Scanner input = new Scanner(System.in);
    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getList() {
        return bookList;
    }
    public void addBooks(Book book){
        bookList.add(book);
    }
    public void removeBooks(Book book){
        bookList.remove(book);
    }

    public void updateBook(Book updatedBook) {
        for (Book book: bookList) {
            if(book.getID() == updatedBook.getID()){
                System.out.println("1.Edit ID Of Book");
                System.out.println("2.Edit Author Of Book");
                System.out.println("3.Edit Page Of Book");
                System.out.println("4.Edit Producer Of Book ");
                System.out.println("5.Edit Release Number Of Book");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.print("Enter New ID Of Book: ");
                        book.setID(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New Author Of Book");
                        book.setAuthor(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New Page Of Book");
                        book.setPage(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 4:
                        System.out.println("Enter New Producer Of Book");
                        book.setProducer(input.nextLine());
                        System.out.println("-----------------------");
                        break;
                    case 5:
                        System.out.println("Enter New Release Number");
                        book.setReleaseNumber(Integer.parseInt(input.nextLine()));
                        System.out.println("-----------------------");
                        break;
                    default:
                        System.err.println("Please Select The Information To Be Corrected !!!");
                }
            } else{
                System.out.println("Not Found");
            }
        }
    }

    public Book searchByID(int ID) {
        for (Book book: bookList) {
            if (book.getID() == ID) {
                return book;
            }
        }
        return null;
    }
}
