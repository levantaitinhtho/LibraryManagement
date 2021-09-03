package com.java.model;

public class Book extends Document{
    private String author;
    private int page;

    public Book(int ID, String producer, int releaseNumber,String author, int page) {
        super(ID,producer,releaseNumber);
        this.author = author;
        this.page = page;
    }

    public Book() {
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public double calcualateCost() {
        return page * 5000;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", ID=" + ID +
                ", producer='" + producer + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", CalculatorCost = "+ calcualateCost()+
                '}';
    }
}
