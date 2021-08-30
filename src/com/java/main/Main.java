package com.java.main;

import com.java.dao.BookManagement;
import com.java.dao.MagazineManagement;
import com.java.dao.NewspaperManagement;
import com.java.model.Book;
import com.java.model.Magazine;
import com.java.model.Newspaper;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        ArrayList<Book> booksList = bookManagement.getList();
        MagazineManagement magazineManagement = new MagazineManagement();
        ArrayList<Magazine> magazineList = magazineManagement.getList();
        NewspaperManagement newspaperManagement = new NewspaperManagement();
        ArrayList<Newspaper> newspaperList = newspaperManagement.getList();
        Scanner input = new Scanner (System.in);
        int choose;
        System.out.println("Select The Document Type, pls");
        System.out.println("1.Books");
        System.out.println("2.Magazine");
        System.out.println("3.Newspaper");
        System.out.println("---------------------");
        System.out.println("Your Choice Is");
        choose = Integer.parseInt(input.nextLine());
        if(choose==1){
            do {
                menuBook();
                System.out.println("-------------------------------");
                System.out.println("Welcome To The List Of Books.");
                System.out.println("Enter Choose Of You For Book");
                choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        Book book = InfoBook();
                        bookManagement.addBooks(book);
                        break;
                    case 2:
                        System.out.println("Enter ID Of Book You Need Delete");
                        int inpuID =Integer.parseInt(input.nextLine());
                        Book book1 = bookManagement.searchByID(inpuID);
                        if(book1 == null){
                            break;
                        }else{
                            bookManagement.removeBooks(book1);
                            System.out.println("Deleted !!!!!!");
                            System.out.println("------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID Of Book You Need Update");
                        int inputID = Integer.parseInt(input.nextLine());
                        Book book2 = bookManagement.searchByID(inputID);
                        if(book2 == null){
                            System.out.println("Not Found ListBook You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            System.out.println("Here's The Book Information You Need.");
                            showBook(book2);
                            System.out.println("---------------------------");
                            bookManagement.updateBook(book2);
                            System.out.println("Successful Updates !!!");
                            System.out.println("-----------------------");
                        }
                        break;
                    case 4:
                        Collections.sort(booksList, new Comparator<Book>() {
                            @Override
                            public int compare(Book book, Book t1) {
                                if(book.getPage() > t1.getPage()){
                                    return -1;
                                }else if(book.getID() < t1.getID()){
                                    return 1;
                                }else{
                                    return 0;
                                }
                            }
                        });
                        for(Book book3 : booksList){
                            showBook(book3);
                        }
                        break;
                    case 5:
                        System.out.println("Here's The Book Information You Need.");
                        for(Book book3 : booksList){
                            showBook(book3);
                        }
                        break;
                    case 6:
                        menuBook();
                        System.out.println("-----------------------------");
                        break;
                    case 7:
                        System.out.println("GoodBye ~~~");
                        break;
                    default:
                        System.err.println("Choose One Of Seven Options.");
                }
            }while (choose!=7);
        }
        if(choose ==2 ){
            do {
                menuMagazine();
                System.out.println("-------------------------------");
                System.out.println("Welcome To The List Of Magazine.");
                System.out.println("Enter Choose Of You For Magazine");
                choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        Magazine magazine = InfoMagazine();
                        magazineList.add(magazine);
                        break;
                    case 2:
                        System.out.println("Enter ID Of Magazine You Need Delete");
                        int inpuID =Integer.parseInt(input.nextLine());
                        Magazine magazine1 = magazineManagement.searchByID(inpuID);
                        if(magazine1 == null){
                            System.out.println("Not Found ListBook You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            magazineManagement.removeMagazine(magazine1);
                            System.out.println("Deleted !!!!!!");
                            System.out.println("------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID Of Magazine You Need Update");
                        int inputID = Integer.parseInt(input.nextLine());
                        Magazine magazine2 = magazineManagement.searchByID(inputID);
                        if(magazine2 == null){
                            System.out.println("Not Found ListMagazine You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            System.out.println("Here's The Book Information You Need.");
                            showMagazine(magazine2);
                            System.out.println("---------------------------");
                            magazineManagement.updateMagazine(magazine2);
                            System.out.println("Successful Updates !!!");
                            System.out.println("-----------------------");
                        }
                        break;
                    case 4:
                        for(Magazine magazine3 : magazineList){
                            showMagazine(magazine3);
                        }
                        break;
                    case 5:
                        menuMagazine();
                        break;
                    case 6:
                        System.out.println("GoodBye~~");
                        break;
                    default:
                        System.out.println("Choose One Of Six Options.");
                }
            }while (choose !=6);
        }
        if(choose ==3){
            do {
                menuNewspaper();
                System.out.println("-------------------------------");
                System.out.println("Welcome To The List Of Newspaper.");
                System.out.println("Enter Choose Of You For Newspaper");
                choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        Newspaper newspaper = InfoNewspaper();
                        newspaperManagement.addNewspaper(newspaper);
                        break;
                    case 2:
                        System.out.println("Enter ID You Need Delete !!");
                        int inputID = Integer.parseInt(input.nextLine());
                        Newspaper newspaper1 = newspaperManagement.searchById(inputID);
                        if(newspaper1 == null){
                            System.out.println("Not Found ListNewspaper You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                           newspaperManagement.removeNewspaper(newspaper1);
                            System.out.println("Deleted !!!!!!");
                            System.out.println("------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID Of Newspaper You Need Update");
                        int enterID = Integer.parseInt(input.nextLine());
                        Newspaper newspaper2 = newspaperManagement.searchById(enterID);
                        if(newspaper2 == null){
                            System.out.println("Not Found ListMagazine You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            System.out.println("Here's The Book Information You Need.");
                            showNewspaper(newspaper2);
                            System.out.println("---------------------------");
                            newspaperManagement.updateNewspaper(newspaper2);
                            System.out.println("Successful Updates !!!");
                            System.out.println("-----------------------");
                        }
                        break;
                    case 4:
                        for(Newspaper newspaper3 : newspaperList){
                            showNewspaper(newspaper3);
                        }
                        System.out.println("--------------------------");
                        break;
                    case 5:
                        menuNewspaper();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Choose One Of Six Options.");
                }
            }while (choose !=6);
        }
        if(choose <1 || choose>3){
            System.err.println("There Are Only Three Types Of Documents, I Hope You Review Them.");
        }
    }

    public static void menuBook(){
        System.out.println("1.Add Book");
        System.out.println("2.Delete Book You Choice");
        System.out.println("3.Update Information Of Book");
        System.out.println("4.Sort Book Based On Cost");
        System.out.println("5.Display all Book");
        System.out.println("6.Show menu Of Book");
        System.out.println("7.Exist");
    }
    public static void menuMagazine(){
        System.out.println("1.Add Magazine");
        System.out.println("2.Delete Magazine You Choice");
        System.out.println("3.Update Information Of Magazine");
        System.out.println("4.Display all Magazine");
        System.out.println("5.Show menu Of Magazine");
        System.out.println("6.Exist");
    }
    public static void menuNewspaper(){
        System.out.println("1.Add Newspaper");
        System.out.println("2.Delete Newspaper You Choice");
        System.out.println("3.Update Information Of Newspaper");
        System.out.println("4.Display all Newspaper");
        System.out.println("5.Show menu Of Newspaper");
        System.out.println("6.Exist");
    }
    public static Book InfoBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Enter Producer: ");
        String producer = input.nextLine();
        System.out.println("Enter Release Number: ");
        int releaseNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter Author: ");
        String author = input.nextLine();
        System.out.println("Enter Page: ");
        int page = input.nextInt();
        return new Book(ID,producer,releaseNumber,author,page);
    }
    public static void showBook(Book book){
        System.out.println(book.toString());
    }
    public static Magazine InfoMagazine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Producer: ");
        String producer = sc.nextLine();
        System.out.println("Enter Release Number: ");
        int releaseNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Release Month: ");
        String releaseMonth = sc.nextLine();
        System.out.println("Enter Issue Number: ");
        int issueNumber = Integer.parseInt(sc.nextLine());
        return new Magazine(ID,producer,releaseNumber,releaseMonth,issueNumber);
    }
    public static void showMagazine(Magazine magazine){
        System.out.println(magazine.toString());
    }
    public static Newspaper InfoNewspaper(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID Of Newspaper: ");
        int ID = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Producer Of Newspaper");
        String producer = scan.nextLine();
        System.out.println("Enter Release Number Of Newspaper: ");
        int releaseNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Release Date Of Newspaper: ");
        String releaseDate = scan.nextLine();
        return new Newspaper(ID,producer,releaseNumber,releaseDate);
    }
    public static void showNewspaper(Newspaper newspaper){
        System.out.println(newspaper.toString());
    }
}

