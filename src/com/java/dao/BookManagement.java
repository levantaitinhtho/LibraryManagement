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
                book.setAuthor(updatedBook.getAuthor());
                book.setReleaseNumber(updatedBook.getReleaseNumber());
                book.setProducer(updatedBook.getProducer());
                book.setPage(updatedBook.getPage());
                }
            return;
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
